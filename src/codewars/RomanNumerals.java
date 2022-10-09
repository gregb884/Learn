package codewars;
import org.apache.commons.lang3.StringUtils;

//https://www.codewars.com/kata/51b66044bce5799a7f000003/train/java

//I = 1
//II = 2
//III = 3
//IV = 4
//V = 5
//VI = 6
//VII = 7
//VIII = 8
//IX = 9
//X = 10
//XX = 20
//XXX = 30
//XL = 40
//L = 50
//LX = 60
//LXX = 70
//LXXX = 80
//XC = 90
//C = 100
//CC = 200
//CCC = 300
//CD = 400
//D = 500
//DC = 600
//DCC = 700
//DCCC = 800
//CM = 900
//M = 1000
//MD = 1500
//MM = 2000
//MMM = 3000

public class RomanNumerals
{

    public static void main(String[] args)
    {

        toRoman(1666);
        fromRoman("DCC");



    }




    public static String toRoman(int n) {
        int i = 0;
        String I = "I";
        int v = 0;
        String V = "V";
        int x = 0;
        String X = "X";
        int l = 0;
        String L = "L";
        int c = 0;
        String C = "C";
        int d = 0;
        String D = "D";
        int m = 0;
        String M = "M";
        int cm = 0;

        while (n >= 1000)
        {
            m = n / 1000;

            n -= m*1000 ;

        }
        while (n >= 500)
        {
            d = n / 500;
            n -= d * 500;

        }
        while (n >= 100)
        {
            c = n / 100;
            n -= c *100;

        }
        while (n >= 50)
        {
            l = n / 50;
            n -= l *50;

        }
        while (n >= 10)
        {
            x = n / 10;
            n -= x *10;

        }
        while (n >= 5)
        {
            v = n / 5;
            n -= v *5 ;
            break;
        }

        i = n;

        if ( i == 4 && v ==0)
        {
            i -= 3;
            I = "IV";
        }
        if ( i == 4 && v !=0)
        {
            v -=1;
            i -= 3;
            I = "IX";
        }

        if ( c == 4 && d ==0)
        {
            c -= 3;
            C = "CD";
        }

        if ( c == 4 && d !=0)
        {
            d -=1;
            c -= 3;
            C = "CM";
        }


        if ( x == 4 && l ==0)
        {
            x -= 3;
            X = "XL";
        }

        if ( x == 4 && l !=0)
        {
            l -=1;
            x -= 3;
            X = "XC";
        }
        String last = M.repeat(m)+D.repeat(d)+C.repeat(c)+L.repeat(l)+X.repeat(x)+V.repeat(v)+I.repeat(i);

        return last;
    }


    public static int fromRoman(String romanNumeral)

    {

        int value = 0;

        while (romanNumeral.contains("I"))
        {
            value += StringUtils.countMatches(romanNumeral,"I");
            break;
        }

        while (romanNumeral.contains("IV"))
        {
            value += 4;
            value -= 6;
            break;
        }
        while (romanNumeral.contains("V"))
        {
            value += 5;
            break;
        }
        while (romanNumeral.contains("IX"))
        {
            value += 9;
            value -= 11;
            break;
        }
        while (romanNumeral.contains("X"))
        {
            value += 10 * StringUtils.countMatches(romanNumeral,"X");;
            break;
        }

        while (romanNumeral.contains("XL"))
        {
            value += 40 ;
            value -= 60;
            break;
        }
        while (romanNumeral.contains("L"))
        {
            value += 50 ;
            break;
        }
        while (romanNumeral.contains("XC"))
        {
            value += 90 ;
            value -= 110;
            break;
        }
        while (romanNumeral.contains("C"))
        {
            value += 100 * StringUtils.countMatches(romanNumeral,"C");
            break;
        }
        while (romanNumeral.contains("CD"))
        {
            value += 400 ;
            value -= 600;
            break;
        }
        while (romanNumeral.contains("D"))
        {
            value += 500;
            break;
        }
        while (romanNumeral.contains("CM"))
        {
            value += 900;
            value -= 1100;
            break;
        }
        while (romanNumeral.contains("M"))
        {
            value += 1000 * StringUtils.countMatches(romanNumeral,"M");
            break;
        }


        return value;
    }




}

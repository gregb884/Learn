package codewars;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Conversion
{
 //Symbol    Value
    //I          1
    //V          5
    //X          10
    //L          50
    //C          100
    //D          500
    //M          1,000

 public static void main(String[] args)
 {

solution(5000);



 }


    public static String solution(int n)

    {
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
        System.out.println(last);

        return last;

    }


}

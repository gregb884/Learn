package codewars;

import java.util.HashMap;



public class RgbToHex
{

    public static void main(String[] args)
    {

        rgb(-20 , 275 , 125);

        //00FF7D
        //


    }


    public static String rgb(int r, int g, int b)
    {

        HashMap<Integer, String> dexhex = new HashMap<Integer, String>();
        dexhex.put(10,"A");
        dexhex.put(11,"B");
        dexhex.put(12,"C");
        dexhex.put(13,"D");
        dexhex.put(14,"E");
        dexhex.put(15,"F");


        String hex ="";
        double r1 ;
        double r2 ;
        int r3;
        int r4;
        double g1;
        double g2;
        int g3;
        int g4;
        double b1;
        double b2;
        int b3;
        int b4;


        r1 = Double.valueOf(r)/16;
        r2 = r1%1;
        r2 *= 16;
        r3 = (int) r1;
        r4 = (int) r2;
        if(r3 < 0)r3 = 0;
        if(r4 < 0)r4 = 0;
        if(r > 255) {r3 = 16;  r4 = 16 ;}
        g1 = Double.valueOf(g) / 16;
        g2 = g1 % 1;
        g2 *= 16;
        g3 = (int) g1;
        g4 = (int) g2;
        if (g3 < 0) g3 = 0;
        if (g4 < 0) g4 = 0;
        if(g > 255) {g3 = 16;  g4 = 16 ;}
        b1 = Double.valueOf(b)/16;
        b2 = b1%1;
        b2 *= 16;
        b3 = (int) b1;
        b4 = (int) b2;
        if(b3 < 0)b3=0;
        if(b4 < 0)b4=0;
        if(b > 255) {b3 = 16;  b4 = 16 ;}


        System.out.println(g4);


        if(r3 >= 10 && r3 <= 15){ hex += dexhex.get(r3);}
        if(r3 < 10 && r3 >=0) {hex += String.valueOf(r3);}
        if(r3 > 15) {hex += "F";}


        if(r4 >= 10 && r4 <= 15) { hex+= dexhex.get(r4);}
        if(r4 < 10 && r4 >= 0)  {hex+= String.valueOf(r4);}
        if(r4 > 15) {hex += "F";}


        if(g3 >= 10 && g3 <= 15) {hex += dexhex.get(g3);}
        if(g3 < 10 && g3 >=0) {hex += String.valueOf(g3);}
        if(g3 > 15) {hex += "F";}

        if(g4 >= 10 && g4 <= 15) {hex += dexhex.get(g4);}
        if(g4 < 10 && g4 >=0) {hex += String.valueOf(g4);}
        if(g4 > 15) {hex += "F";}


        if(b3 >= 10 && b3 <= 15) {hex += dexhex.get(b3);}
        if(b3 < 10 && b3 >=0) {hex += String.valueOf(b3);}
        if(b3 > 15) {hex += "F";}


        if(b4 >= 10 && b4 <= 15) {hex += dexhex.get(b4);}
        if(b4 < 10 && b4 >=0) {hex += String.valueOf(b4);}
        if(b4 > 15) {hex += "F";}



        System.out.println(hex);
        return hex;


    }


}

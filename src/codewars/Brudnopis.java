package codewars;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Brudnopis

{

    public static void main(String[] args)
    {

        for(int i=97; i<=122; i++)
        {
            for(int j=97; j<=122; j++)
            {
                for(int k=97; k<=122; k++)
                {
                    for(int l=97; l<=122; l++)
                    {
                       String generatedString = Character.toString(i) + Character.toString(j) + Character.toString(k) + Character.toString(l);

                       System.out.println(generatedString);
                    }
                }
            }
        }


    }






    public static HashMap<String, String> map1 = new HashMap<>();
    public static int leftLimit = 97; // letter a
    public static int rightLimit = 122; // letter z
    public static char a = 97;
    public static char b = 97;
    public static char c = 97;
    public static char d = 97;


    public static String myrandom()
    {
        String build = Character.toString(a) + Character.toString(b) + Character.toString(c) + Character.toString(d);


        if ( a >= 97 && a < 122)
        {
            a++;
        }

        if (a == 122)
        {
            if ( b >= 97 && b < 122 )
            {
                b++;
            }

            if ( b == 122)
            {
                if ( c >= 97 && c < 122 )
                {
                    c++;
                }

                if (c == 122)
                {

                    if ( d >= 97 && d < 122 )
                    {
                        d++;
                    }

                   if (d == 122)
                   {
                       if ( c >= 97 && c <122)
                       {
                           c--;
                       }

                   }


                if ( a == 122 && b ==122 && c==122&d==122)
                {
                    if (c >= 97 && c <= 122)
                    {
                        c--;
                    }


                }



                }


            }
        }

        System.out.println(build);
        return build ;
    }


    public static String randomalpha() {


        String generatedString = "";

        while (map1.get(generatedString) != null)
        {
            for(int i=97; i<=122; i++)
            {
                for(int j=97; j<=122; j++)
                {
                    for(int k=97; k<=122; k++)
                    {
                        for(int l=97; l<=122; l++)
                        {
                            generatedString = Character.toString(i) + Character.toString(j) + Character.toString(k) + Character.toString(l);
                            System.out.println(generatedString);
                        }
                    }
                }
            }

        }

        return generatedString;
    }


}
package codewars;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Stream;

//https://www.codewars.com/kata/54b42f9314d9229fd6000d9c/train/java

public class DuplicateEncoder
{

    public static void main(String[] args)
    {

        encode("Success");


    }






    static String encode(String word)

    {
        String small = word.toLowerCase(Locale.ROOT);
        String[] r = {};
        r = small.split("");

        String[] d = new String[r.length];

        for ( int c = 0 ; c < d.length ; c++)
        {
            d[c] = "(";

        }


        for (int i = 0; i < r.length; i++)
        {

            for (int j = i; j < r.length; j++)
            {

                if ((r[i].equals(r[j])) && (i != j))
                {
                    d[i] = d[i].replace("(",")");
                    d[j] = d[i].replace("(",")");

                }
            }
        }

        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < d.length; i++) {
            sb.append(d[i]);
        }


        for ( int a = 0 ; a < d.length ; a++)
        {
            System.out.println(d[a]);
        }



        String last = String.valueOf(sb);


        return last;
    }
}

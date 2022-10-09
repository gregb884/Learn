package codewars;


//https://www.codewars.com/kata/550554fd08b86f84fe000a58/train/java

//a1 = ["arp", "live", "strong"]
//
//a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
//
//returns ["arp", "live", "strong"]

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;

public class WhichAreIn
{


public static void main(String[] args)
{

    String a[] = new String[]{ "ar", "46" };
    String b[] = new String[] { "ar","46" };

    inArray(a,b);


}





    public static String[] inArray(String[] array1, String[] array2)

    {

        String[] r = {} ;
        String[] p = {};

        String g = "";

            for (int i = 0; i < array1.length; i++) {


                for (int o = 0; o < array2.length; o++)
                {
                    if (array2[o].contains(array1[i]))
                    {
                        g += array1[i] + " ";
                    }
                }


            }




        for (int i = 0; i < array2.length; i++) {


            for (int o = 0; o < array1.length; o++)
            {
                if (array1[o].contains(array2[i]))
                {
                    g += array2[i] + " ";
                }
            }


        }

        r = g.split(" ");


        LinkedHashSet<String> duplicate = new LinkedHashSet<String>(Arrays.asList(r));
        String[] newArray = duplicate.toArray(new String[ duplicate.size() ]);



        Arrays.sort(newArray,String.CASE_INSENSITIVE_ORDER);

           /* for (int i = 0; i < newArray.length; i++)
            {
                for (int j = i + 1; j < newArray.length; j++) {
                    if (newArray[i].compareToIgnoreCase(newArray[j])
                            > 0) {
                        String temp = newArray[i];
                        newArray[i] = newArray[j];
                        newArray[j] = temp;
                    }
                }
            }*/

        for (int b = 0 ; b < newArray.length ; b++)
        {
            System.out.println(newArray[b]);

        }


        if(newArray[0] == "")
        {
            return p;
        }


        return newArray;
    }

//  for (int b = 0 ; b < newArray.length ; b++)
//        {
//            System.out.println(newArray[b]);
//
//        }

}

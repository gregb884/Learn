package codewars;

import java.util.Arrays;
import java.util.stream.Stream;

class Solution2 {


    //https://www.codewars.com/kata/5208f99aee097e6552000148/train/java

    public static void main(String[] args)
    {


camelCase("AntekGowno");



    }




    public static String camelCase(String input)
    {

        String u[] = input.split("(?<=[a-z])(?=[A-Z])");

        StringBuffer end = new StringBuffer();

       end.append(u[0]);

        for(int i = 1; i < u.length; i++)

        {
            end.append(" "+u[i]);
        }

       String str = end.toString();

        System.out.println(str);


        return str;
    }
}
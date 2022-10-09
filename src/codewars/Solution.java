package codewars;

import java.util.Arrays;

class Solution {

    public static void main(String[] args)
    {
         whoLikesIt("Alex", "Jacob", "Mark", "Max");

         System.out.println("Alex, Jacob and 2 others like this");



    }



    public static String whoLikesIt(String... names)

    {
        int a = names.length -2 ;


        while (names.length >= 4 )
        {

            System.out.println(names[0]+", "+names[1]+" and "+a+" others like this");
            break;
        }

        while (names.length == 3)
        {
            System.out.println(names[0]+" ,"+names[1]+" and "+names[2]+" like this");
            break;

        }

        while (names.length == 2)
        {
            System.out.println(names[0]+" and "+names[1]+" like this");
            return names[0]+" and "+names[1]+" like this";
        }

        while (names.length == 1)
        {
           System.out.println(names[0]+" likes this");
           return names[0]+" likes this";

        }

        while (names.length == 0)
        {
            System.out.println("no one likes this");
            return "no one likes this";

        }



        /*if(names[0].length() > 1)
        {
            System.out.println(names[0]+" likes this");
            return "one person";
        }

        if(names[1].length() > 1)
        {
            System.out.println(names[0]+" and"+names[1]+" like this");
            return " two person";

        }*/




        return "";
    }
}
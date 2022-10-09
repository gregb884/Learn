package codewars;

//https://www.codewars.com/kata/514b92a657cdc65150000006/train/java

//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//
//Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in. Additionally, if the number is negative, return 0 (for languages that do have them).
//
//Note: If the number is a multiple of both 3 and 5, only count it once.

public class Solution3
{

    public static void main(String[] args)
    {

    solution(10);

    }




    public static int solution(int number)

    {

        int[] table = new int[number - 1];
        int tabvalue = 1 ;
        int result = 0;

        for (int a = 0 ; a<table.length ; a++)
        {
            table[a] = tabvalue;
            tabvalue++;
        }

        for (int b = 0 ; b<table.length ; b++)
        {
            while (table[b]%5 == 0)
            {
                result += table[b];
                break;
            }
            while (table[b]%3 == 0 && table[b]%5 != 0)
            {
                result += table[b];
                break;
            }

        }

        System.out.println(result);


        return 1;
    }


}

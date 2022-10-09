package codewars;

import java.util.Arrays;

public class Kata {

    public static void main(String[] args)
    {


        highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4");








    }




    public static String highAndLow(String numbers)

    {

        String []arr = numbers.split(" ");

        int[] tab = new int[numbers.length()];

        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(arr2);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        int highnumber = arr2[arr2.length - 1];
        int lownummber = arr2[0];

        System.out.println("High number " + highnumber);
        System.out.println("Low number " + lownummber);

        String h =Integer.toString(highnumber);
        String l =Integer.toString(lownummber);
        String hl = h+" "+l;



        return hl;
    }
}
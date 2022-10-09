package codewars;


//https://www.codewars.com/kata/51e0007c1f9378fa810002a9/train/java

//Write a simple parser that will parse and run Deadfish.
//
//Deadfish has 4 commands, each 1 character long:
//
//i increments the value (initially 0)
//d decrements the value
//s squares the value
//o outputs the value into the return array
//Invalid characters should be ignored.
//
//Deadfish.parse("iiisdoso") =- new int[] {8, 64};

public class DeadFish {

    public static void main(String[] args)
    {

        parse("iiisdoso");


    }




    public static int[] parse(String data)

    {

        String [] array = data.split("");

        int l = 1;

        for (int b = 0 ; b < data.length() ; b++)
        {
            while (array[b].equals("o"))
            {
                l++;
                break;
            }

        }




        int value = 0;
        int o = 0;
        int[] end = new int[l];



        for (int a = 0 ; a < data.length() ; a++)
        {

            while (array[a].equals("i"))
            {
                value++;
                break;
            }
            while (array[a].equals("d"))
            {
                value--;
                break;
            }

            while (array[a].equals("s"))
            {
                value *= value;
                break;
            }

            while (array[a].equals("o"))
            {
                end[o] = value;
                o++;
                break;
            }



        }





        return end;
    }
}

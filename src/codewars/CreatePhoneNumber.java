package codewars;

public class CreatePhoneNumber
{

    public static void main(String [] args)
    {

        createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0});




    }




    public static String createPhoneNumber(int[] numbers)

    {

        String text = "("+numbers[0]+numbers[1]+numbers[2]+") "+numbers[3]+numbers[4]+numbers[5]+"-"+numbers[6]+numbers[7]+numbers[8]+numbers[9];



       return text;
    }

//Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"

}

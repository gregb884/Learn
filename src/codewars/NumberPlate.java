package codewars;

public class NumberPlate
{

    public static void main(String[] args)
    {

findTheNumberPlate(40000);


    }



    public static String findTheNumberPlate(int customerID)

    {

        double a = 0;
        int c = 0;

        while (customerID > 1)
        {
            a = customerID / 999;
            break;

        }
        double b = a % 26;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        return "aaa001";
    }

}
//oba
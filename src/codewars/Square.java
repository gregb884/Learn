package codewars;



public class Square {
    public static void main (String[]args)
    {

        isSquare(3);



        //-1  =>  false
        // 0  =>  true
        // 3  =>  false
        // 4  =>  true
        //25  =>  true
        //26  =>  false


    }


    public static boolean isSquare(int n)

    {

        double sqrt=Math.sqrt(n);

       return  ((sqrt - Math.floor(sqrt)) == 0);

    }
}
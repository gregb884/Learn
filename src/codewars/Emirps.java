package codewars;



import java.util.Arrays;



class Emirps {

    //find_emirp(10)
    //[0, 0, 0] ''' no emirps below 10 '''
    //
    //find_emirp(50)
    //[4, 37, 98] ''' there are 4 emirps below 50: 13, 17, 31, 37; largest = 37; sum = 98 '''
    //
    //find_emirp(100)
    //[8, 97, 418] ''' there are 8 emirps below 100: 13, 17, 31, 37, 71, 73, 79, 97; largest = 97; sum = 418 '''

    public static void main(String[] args)
    {
            findEmirp(20);



    }


    public static long[] findEmirp(long n)

    {
            if (n <= 10)
            {
                long[] tab = new long[3];
                String a = "sda";
                zero();
               return tab;

            }

            if(n > 10)

            {
                int d = 1;

                long[] tab1 = new long[(int) n];

                for (int c = 0 ; c <= n-1 ;c++)
                {
                    tab1[c] = d;
                    d++;
                    System.out.println(tab1[c]);
                }





                StringBuffer sbf = new StringBuffer(Arrays.toString(tab1));

                sbf.reverse();

                System.out.println("String buffer = " + tab1);
                System.out.println("String buffer after reversing = " + sbf );

            }




            long[] args = new long[3];

return args;




    }

    public static String zero()
    {
        System.out.println("no emirps below 10");
        return "no emirps below 10";

    }

}
package codewars;

public class Xbonacci {

    public static void main(String[] args)
    {

        tribonacci(new double[]{6,2,3},11);




    }

    // assertArrayEquals(new double []{1,1,1,3,5,9,17,31,57,105}, variabonacci.tribonacci(new double []{1,1,1},10), precision);
    //Testing for signature: [6.0, 2.0, 6.0] and n: 35
    //Testing for signature: [6.0, 2.0, 3.0 , 11 , 16 , 30 , 57 ,103 , 190 , 350 , 643   ] and n: 11

    public static double[] tribonacci(double[] s, int n)

    {
        if(n >= 3)
        {

            double tab[] = new double[n];
            tab[0] = s[0];
            tab[1] = s[1];
            tab[2] = s[2];


            for (int a = 3; a <= n - 1; a++)
            {
                tab[a] = tab[a - 1] + tab[a - 2] + tab[a - 3];

                System.out.println(tab[a]);
            }
            return tab;
        }

        if (n == 2)
        {
            double[] tab1 = new double[2];
            tab1[0] = s[0];
            tab1[1] = s[1];
            return tab1;

        }

        if (n == 1)
        {
            double[]tab2 = new double[1];
            tab2[0] = s[0];
            return tab2;

        }

        double[] tab3 = new double[0];

        return tab3;
    }





}
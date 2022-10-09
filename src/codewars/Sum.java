package codewars;

import java.util.stream.IntStream;

public class Sum
{
    public static void main(String[] args)
    {
        GetSum(4,1);




    }




    public static int GetSum(int a, int b)
    {
        if ( a == b)
        {
            return a;

        }

        if (a<b) {
            int dif = b - a;
            int[] tab = new int[dif + 1];
            tab[0] = a;
            int f = tab.length - 1;
            tab[f] = b;


            for (int g = 1; g < dif; g++) {
                tab[g] = tab[g - 1] + 1;
            }

            for (int o = 0; o < tab.length; o++) {

                System.out.println(tab[o]);
            }

            int sum = IntStream.of(tab).sum();
            System.out.println(sum);
            return sum;

        }



            int fid = a-b;
            int[] tab1 = new int[fid+1];
            tab1[0] = b;
            int x = tab1.length-1;
            tab1[x] = a;



            for (int u = 1;u<fid;u++)
            {
                tab1[u] = tab1[u-1] + 1;
            }

        for (int o = 0; o < tab1.length; o++) {

            System.out.println(tab1[o]);
        }

        int sum1 = IntStream.of(tab1).sum();

        System.out.println(sum1);

        return sum1;

        }



    }




//(1, 0) --> 1 (1 + 0 = 1)
//(1, 2) --> 3 (1 + 2 = 3)
//(0, 1) --> 1 (0 + 1 = 1)
//(1, 1) --> 1 (1 since both are same)
//(-1, 0) --> -1 (-1 + 0 = -1)
//(-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)
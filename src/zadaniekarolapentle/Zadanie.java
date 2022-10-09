package zadaniekarolapentle;

public class Zadanie {

    public static void main(String[] args)

    {


        int [] tab = {23,4,6,75,32,98,12,33,90,60,44,55,21,24,54,58,21,23,66,99};

        int a = 0;
        double c = 0;


        while (a<tab.length)
        {
            System.out.println("Numer "+tab[a]);
            a++;
        }


        for (int b = 0; b<= 19 ;b++ )
        {
            c+= tab[b];


        }

        double srednia = c/tab.length;

        System.out.println("średnia liczb : "+ srednia);






    }




}

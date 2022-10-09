package pentle;

public class Petle
{

/*
        String[] kursyProgramowania = {

                "Java",
                "Java Aplikacje",
                "Java Strumienie",
                "Java Aspekty Zaawansowane",
                "Java Android",
                "C#",
                "C#",
                "C# Tworzenie Aplikacji"
        };

        int i = 0;
        int l = kursyProgramowania.length;

        while (i<l)
        {System.out.println(kursyProgramowania[i]);
        i++;} */


    /*Petle for
    *  for(int i = 0; i < Kursy.length;i++)
        {
            System.out.println(Kursy[i]);

        }
    *
    * */

/* Ulepszona pentla for
     for(String myValue: Kursy)
    {
        System.out.println(myValue);
    }

    */


    /*
    Pętla w pętli tabliczka mnożenia
    for (int j = 1; j<=10; j++)

        {

            for(int i = 1; i<=10;i++)
            {
                System.out.print(i * j + " ");
            }
            System.out.println();

        }

    */

    /* Zadanie 2 co drugi wiersz mnożenia
    for (int j = 1; j<=10; j++)
    {

        if(j % 2 == 0)
            continue;
        for(int i = 1; i<=10;i++)
        {
            if(i % 2 == 0)
                continue;


            System.out.print(i * j + " ");
        }
        System.out.println();


        /* Zadanie stworzyc tablice [10] z wartosciami od 10 do 100

        int [] tab = new int[10];


        int a = 0;
        int l = tab.length;
        int b = 10;
        int c = 1;
        int g = c+10;
        while (a<l)
        {

            tab[a] =c*10;
            System.out.println(tab[a]);
            c++;
            a++;
        }

*/

}

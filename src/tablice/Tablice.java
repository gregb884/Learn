package tablice;

public class Tablice
{

public static void main (String [] args )
{
    /*Tablica jednowymiarowa*/
    int [] tab = new int[4];

    tab[2] = 2;
    /* Tablica wielowymiarowa */

    int[][] tab2 = new int[3][4];

    tab2[1][2] = 3;

    /* Tablica wielowymiarowa z natychmiastowym przypisaniem  */
    int [][] tab3 =
            {
                    {4, 15, 17},
                    {5, 12, 125},
                    {651, 1256, -24}

            };



    System.out.println("Tablica jednowymiarowa : "+tab[2]);
    System.out.println("Tablica wielowymiarowa :"+tab2[1][2]);
    System.out.println("Tablica wielowymiarowa z natychmiastowym przypisaniem :"+tab3[1][2]);




}




}

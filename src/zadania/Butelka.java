package zadania;


public class Butelka
{
   private double ilelitrow;
   private double pojemnosc;

    Butelka(double ilelitrow, double pojemnosc)
    {
        this.ilelitrow = ilelitrow ;
        this.pojemnosc = pojemnosc ;
    }

    double getIlelitrow()
    {
        return ilelitrow;
    }
    double getPojemnosc()
    {
        return pojemnosc;
    }

    void wlej (double ilosc) {
        double b;
        double a = ilosc + this.ilelitrow - pojemnosc  ;
        if (ilosc + this.ilelitrow <= pojemnosc)

            this.ilelitrow += ilosc;
        else
            this.ilelitrow = pojemnosc;




    }

    void wylej (double ilosc)
    {

        if(ilosc <= this.ilelitrow)
        this.ilelitrow -= ilosc;
        else
        this.ilelitrow = 0 ;



    }

    void przelej (double ilosc, Butelka gdzieprzelac)
    {
        if(ilosc <= this.ilelitrow)
        {
            double a =gdzieprzelac.pojemnosc - gdzieprzelac.getIlelitrow();
            System.out.println(a);
            this.wylej(a);
            gdzieprzelac.wlej(ilosc );



        }
        else {
            System.out.println("error");
        }
    }


    public static void main(String[] args)
    {



        Butelka butelka1 = new Butelka(1,3);
        Butelka butelka2 = new Butelka(2,3);
        Butelka butelka3 = new Butelka(3,3);

butelka3.przelej(3,butelka1);


    System.out.println("Butelka 1 -  "+butelka1.getIlelitrow());
    System.out.println("Butelka 2 -  "+butelka2.getIlelitrow());
    System.out.println("Butelka 3 -  "+butelka3.getIlelitrow());




/*     Zadanie : pentla tworząca 50 butelek
        for(int i = 0; i < 50 ; i++)
        {
            butelka[i] = new  Butelka(a);
            a++;
        }
*/
    }

}

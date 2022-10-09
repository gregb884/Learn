package interfejsy;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Interfejsy
{

public static void main(String[] args)
{


    int[] tab = new int[3];

    tab[0] = 3;
    tab[1] = -5;
    tab[2] = 13;

    Arrays.sort(tab);



Pracownik[] pracownik = new Pracownik[3];


    pracownik[0] = new Pracownik(10000);
    pracownik[1] = new Pracownik(2000);
    pracownik[2] = new Pracownik(4000);


    System.out.println("Przed sortowaniem");

    for(int i = 0;i < pracownik.length;i++)
    {
        System.out.println(pracownik[i].getWynagrodzenie());

    }

    Arrays.sort(pracownik);

    System.out.println("Po sortowaniu");

    for(int i = 0;i < pracownik.length;i++)
    {
        System.out.println(pracownik[i].getWynagrodzenie());

    }

    System.out.println("Sortowanie odrwrotne");

    Arrays.sort(pracownik, Collections.reverseOrder());

    for(int i = 0;i < pracownik.length;i++)
    {
        System.out.println(pracownik[i].getWynagrodzenie());

    }

    System.out.println(pracownik[0].compareTo(pracownik[1]));

}


}


interface nazwainterfejsu
{
    double PI = 3.14; //public static final

    void cos(); //public abstract
}

class Pracownik implements nazwainterfejsu, Comparable
{

    Pracownik()
    {

    }

    Pracownik(double wynagrodzenie)
    {
        this.wynagrodzenie = wynagrodzenie;
    }

    @Override
    public void cos() {

    }

    private double wynagrodzenie;

    public double getWynagrodzenie() {
        return this.wynagrodzenie;
    }

    @Override
    public int compareTo(Object o)

    {
        Pracownik przyslany = (Pracownik) o;

        if(this.wynagrodzenie < przyslany.wynagrodzenie )
        {
            return -1;
        }
        if(this.wynagrodzenie > przyslany.wynagrodzenie)
        {
            return 1;
        }
        return 0;
    }
}
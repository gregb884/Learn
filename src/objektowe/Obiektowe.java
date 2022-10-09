package objektowe;

public class Obiektowe
{
    public static void main(String[] args)
    {

        KontoBankowe oszczednosciowe = new KontoBankowe();

        oszczednosciowe.wplac(100);

        oszczednosciowe.wyplac(4);


        System.out.println(oszczednosciowe.getSaldo());


    }

}


class KontoBankowe
{

    public KontoBankowe()
    {
        saldo = 1000;

    }
    private int saldo;

    int getSaldo()
    {
        return saldo;

    }

    private boolean setSaldo(int saldo)
    {
        this.saldo = saldo;
        return true;

    }

    boolean wyplac(int ile)
    {
        if(saldo<ile)
        {
            return false;
        }
        else
            setSaldo(saldo - ile);
        return true;
    }

    boolean wplac(int ile)
    {
        setSaldo(saldo + ile);
        return true;
    }



}




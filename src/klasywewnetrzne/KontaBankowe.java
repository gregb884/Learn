package klasywewnetrzne;

public class KontaBankowe
{

    public static void main(String[] args)
    {

        KontoBankowe kontoBankowe = new KontoBankowe(1000);


    }



}



class KontoBankowe
{

    public KontoBankowe(double stanKonta)
    {
        this.stanKonta = stanKonta ;
    }

    private double stanKonta;

    public double getStanKonta()

    {
        return this.stanKonta;
    }

    void start (double stopa)
    {
        Odsetki odsetki = new Odsetki(stopa);


    }


    class Odsetki
    {
        public Odsetki(double stopaProcentowa)
        {
            this.stopaProcentowa = stopaProcentowa;
        }

        void zmienStanKonta (double stopa)
        {



        }


        private double stopaProcentowa;

    }


}
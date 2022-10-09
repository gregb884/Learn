package finalkeyword;

import java.util.Date;

public class Main
{

public static void main(String[] args)
{



}


}

abstract class Osoba
{


}

class Pracownik extends Osoba
{
    Pracownik()
    {
        this.datazatrudnienia = new Date();
    }

final Date datazatrudnienia;

    Pracownik(Date data)
    {
        this.datazatrudnienia = data;

    }



    public Date getDatazatrudnienia()
    {
        return this.datazatrudnienia;
    }
}
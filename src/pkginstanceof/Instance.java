package pkginstanceof;

public class Instance {
    public static void main(String[] args) {
        Osoba[] osoba = new Osoba[4];
        osoba[0] = new Pracownik("Arkadiusz", "Wlodarczyk", 2000);
        osoba[1] = new Student("Klaudia","Wyrebska");


        for (int i = 0;i<osoba.length;i++)
        {
           if (osoba[i] instanceof Osoba)
               osoba[i].opis();
           else
               break;

        }

    }
}
    abstract class Osoba
    {
        String imie;
        String nazwisko;

        Osoba (String imie, String nazwisko)
        {
            this.imie = imie;
            this.nazwisko = nazwisko ;
        }
        abstract void opis();
    }

    class Pracownik extends Osoba
    {
        double wynagrodzenie;
        Pracownik(String imie, String nazwisko, double wynagrodzenie)
        {
            super(imie, nazwisko);
            this.wynagrodzenie = wynagrodzenie;
        }

        @Override
        void opis()
        {
            System.out.println("Jestem pracownikiem");
            System.out.println("Imie: "+imie);
            System.out.println("Nazwisko: "+nazwisko);
            System.out.println("Wynagrodzenie: "+wynagrodzenie);
        }
    }

    class Student extends Osoba
    {
         Student(String imie, String nazwisko)
        {
            super(imie, nazwisko);

        }

        @Override
        void opis()
        {
            System.out.println("Jestem Studentem");
            System.out.println("Imie: "+imie);
            System.out.println("Nazwisko: "+nazwisko);
        }
    }



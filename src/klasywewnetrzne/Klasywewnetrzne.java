package klasywewnetrzne;

public class Klasywewnetrzne
{

public static void main(String [] args)
{



}

}
// Klasy wewnętrzne mają dostep do danych z klasy głownej zewnetrznej

class A
{
    class B
    {
        void cos()
        {
            System.out.println(test);

        }
    }
    private int test;
}
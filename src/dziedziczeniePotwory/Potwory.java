package dziedziczeniePotwory;
import dziedziczenie.Zombie;
import dziedziczenie.Monster;
import dziedziczenie.Skieleton;

public class Potwory
{
    public static void main(String[] args)
    {


        Skieleton s = new Skieleton(25,70,"Bow");

        System.out.println(s.speed+"      "+s.hp+" Weepon  "+s.weepon);

        Zombie z = new Zombie(5,120);

        System.out.println(z.speed+"     "+z.hp);

        s.attack();



    }


}

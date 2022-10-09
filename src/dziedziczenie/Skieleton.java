package dziedziczenie;

public class Skieleton extends Monster
{

    public String weepon;

    @Override
    protected void opis()
    {

    }

    @Override
    public void attack()
    {

        System.out.println("Attack Skieleton");

    }

    public Skieleton()
{

}

public Skieleton(double speed,double hp, String weepon)
{
    super(speed, hp);
    this.weepon = weepon;


    /*this.speed = speed;
    this.hp = hp;*/

}

}

package dziedziczenie;

public abstract class Monster
{

public double speed ;
public double hp ;

public void attack()
{

    System.out.println("Attack Monster");
}

abstract protected void opis();


public Monster()
{

}

public Monster(double speed, double hp)
{
    this.speed = speed;
    this.hp = hp;

}



}

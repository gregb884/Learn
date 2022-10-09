package klasaobject;

import java.sql.SQLOutput;
import java.util.Objects;

public class Main
{

public static void main(String[] args)
{

Punkt p = new Punkt(20,30);
Punkt p2 = new Punkt(20,30);

System.out.println(p.equals(p2));



}

}

class Punkt extends Object
{
    private int x;
    private int y;

    Punkt()
    {

    }

    Punkt(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    int getX()
    {
       return x;
    }

    int getY()
    {
        return y;
    }

    @Override
    public boolean equals(Object o)
    {
        if (o == null)
        return false;
        if(this.getClass() != o.getClass())
        return false;
        Punkt przyslany = (Punkt)o;

    return this.x == przyslany.x && this.y == przyslany.y;
    }

    @Override
    public String toString()
    {
        return getX() + "  " + getY();
    }
}




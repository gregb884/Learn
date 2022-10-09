package codewars;

public class TenMinWalk

{
    public static void main(String[] args)
    {

        isValid(new char[] {'n','s','n','s','n','s','n','s','n'});


    }




    public static boolean isValid(char[] walk)

    {
        if(walk.length == 10)
        {
            System.out.println("True");
            return true;
        }
        else return false;
    }
}
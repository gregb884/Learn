package codewars;

import java.util.*;

//["a", "b", "c"] --> ["1: a", "2: b", "3: c"]
public class LineNumbering

{
    public static void main(String[] args)
    {

        number(Arrays.asList("", "", ""));


    }




    public static List<String> number(List<String> lines)
    {

        int a = 1;
        for (int i = 0; i < lines.size(); i++)
        {
            lines.set(i, a +": " + lines.get(i));
            a++;
        }
        System.out.println(lines);

       return lines;
    }


}

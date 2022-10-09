package codewars;

import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Set;


//https://www.codewars.com/kata/55c04b4cc56a697bb0000048/train/java

public class Scramblies
{


    public static void main(String[] args)
    {

        scramble("kofpskaofasiuonfasklfnskal","awe");

    }


    public static boolean scramble(String str1, String str2)
    {


        if (str2.length() > str1.length())
        {
            return false;
        }


        int check = 0;
        String value2 = str2;

        String item2[] = value2.split("");

        HashMap<String, Integer> map2 = new HashMap<>();

        for (String t : item2) {
            if (map2.containsKey(t)) {
                map2.put(t, map2.get(t) + 1);

            } else {
                map2.put(t, 1);
            }
        }
        Set<String> keys = map2.keySet();

        // first str

        String value = str1;

        String item[] = value.split("");

        HashMap<String, Integer> map1 = new HashMap<>();

        for (String y : item) {
            if (map1.containsKey(y)) {
                map1.put(y, map1.get(y) + 1);

            } else {
                map1.put(y, 1);
            }
        }
        Set<String> keys1 = map1.keySet();

            try {
                for (int i = 0; i < str2.length(); i++) {
                    if (map1.get(item2[i]) >= map2.get(item2[i])) {
                        check += 1;

                    }
                }
            }
            catch (NullPointerException s)
            {
                return false;
            }



            if(check == str2.length())
            {
                return true;
            }


          else return false;
    }
}

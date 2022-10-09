package codewars;

//https://www.codewars.com/kata/5fee4559135609002c1a1841/train/java


import java.util.HashMap;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.*;

class test

{

    private static boolean testFormat(String string)
    {

        System.out.println(Pattern.matches("^short.ly\\/[a-z]{1,4}$", string));
        return Pattern.matches("^short.ly\\/[a-z]{1,4}$", string);
    }

    public static void main(String[] args)
    {


        Shortener shortener = new Shortener();

      String shortURL1 = shortener.urlShortener("https://www.codewars.com/kata/5ef9ca8b76be6d001d5e1c3e");
      String shortURL2 = shortener.urlShortener("https://www.codewars.com/kata/5efae11e2d12df00331f91a6");
      shortener.urlRedirector(shortURL1);
      shortener.urlRedirector(shortURL2);
        testFormat(shortURL1);



        for (int j = 0 ; j < 160000 ; j++)
        {
            String k = "";
            Random random1 = new Random();

            String shortURL11 = shortener.urlShortener(k = random1.ints(97, 122)
                    .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                    .limit(20)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString());

        }



    }

}



public class Shortener {

    public static HashMap<String, String> map = new HashMap<>();
    public static HashMap<String, String> map1 = new HashMap<>();
    public static Set<String> set = new HashSet<String> ();
    public static char q = 97;
    public static char w = 97;
    public static char e = 97;
    public static char r = 97;
    public static String x = "aaaa";


    public static String randomalpha()
    {

        String generatedString = "";
    aa:
    for (int i = 97; i <= 122; i++) {
        for (int j = 97; j <= 122; j++) {
            for (int k = 97; k <= 122; k++) {
                for (int l = 97; l <= 122; l++)
                {

                    generatedString = Character.toString(i) + Character.toString(j) + Character.toString(k) + Character.toString(l);
                    x = generatedString;


                    if (generatedString.equals(x) == true)
                    {
                        break aa ;
                    }




                }
            }
        }
    }



        return generatedString;
    }


    public static String urlShortener(String longURL)

    {
        if (longURL != null)
        {
            System.out.println(Databaseshort(longURL));
            return Databaseshort(longURL);
        }
        System.out.println("Wrong string format!");
        return "Wrong string format! urlS";
    }
    public static String urlRedirector(String shortURL)
    {
        String last4 = shortURL.substring(shortURL.length() - 4);

        if (last4 != null)
        {


            System.out.println(map1.get(last4));
            return map1.get(last4);
        }




        return "zły return";
    }



    public static String Databaseshort(String url)
    {

        if (url.contains("short.ly") == false)
        {

            String s = randomalpha();

            while (map1.get(s) == s)
            {
                s = randomalpha();
                break;
            }

            if (map1.get(url) != null) {
                return "short.ly/" + map1.get(url);
            }


            if (map.get(url) == null) {
                map.put(url, s);
                map1.put(s, url);
                return "short.ly/" + s;
            }
        }

        if (map.get(url) != null)
        {
            return "short.ly/" + map.get(url) ;
        }



        return "Last return Database";

    }





}
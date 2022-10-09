package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//https://www.codewars.com/kata/59d9d8cb27ee005972000045/train/java

public class Catalog {
//public void test() {
//        testing(s, "ladder" , "ladder > prx: $112 qty: 12");
//        testing(s, "saw" , "table saw > prx: $1099.99 qty: 5\nsaw > prx: $9 qty: 10\nsaw for metal > prx: $13.80 qty: 32");
//        testing(s, "wood pallet" , "wood pallet > prx: $65 qty: 21");
//If the article is not in the catalog return "Nothing".


    public static void main(String[] args)
    {
        String s =
                "<prod><name>drill</name><prx>99</prx><qty>5</qty></prod>\n\n" +
                        "<prod><name>hammer</name><prx>10</prx><qty>50</qty></prod>\n\n" +
                        "<prod><name>screwdriver</name><prx>5</prx><qty>51</qty></prod>\n\n" +
                        "<prod><name>table saw</name><prx>1099.99</prx><qty>5</qty></prod>\n\n" +
                        "<prod><name>saw</name><prx>9</prx><qty>10</qty></prod>\n\n" +
                        "<prod><name>chair</name><prx>100</prx><qty>20</qty></prod>\n\n" +
                        "<prod><name>fan</name><prx>50</prx><qty>8</qty></prod>\n\n" +
                        "<prod><name>wire</name><prx>10.8</prx><qty>15</qty></prod>\n\n" +
                        "<prod><name>battery</name><prx>150</prx><qty>12</qty></prod>\n\n" +
                        "<prod><name>pallet</name><prx>10</prx><qty>50</qty></prod>\n\n" +
                        "<prod><name>wheel</name><prx>8.80</prx><qty>32</qty></prod>\n\n" +
                        "<prod><name>extractor</name><prx>105</prx><qty>17</qty></prod>\n\n" +
                        "<prod><name>bumper</name><prx>150</prx><qty>3</qty></prod>\n\n" +
                        "<prod><name>ladder</name><prx>112</prx><qty>12</qty></prod>\n\n" +
                        "<prod><name>hoist</name><prx>13.80</prx><qty>32</qty></prod>\n\n" +
                        "<prod><name>platform</name><prx>65</prx><qty>21</qty></prod>\n\n" +
                        "<prod><name>car wheel</name><prx>505</prx><qty>7</qty></prod>\n\n" +
                        "<prod><name>bicycle wheel</name><prx>150</prx><qty>11</qty></prod>\n\n" +
                        "<prod><name>big hammer</name><prx>18</prx><qty>12</qty></prod>\n\n" +
                        "<prod><name>saw for metal</name><prx>13.80</prx><qty>32</qty></prod>\n\n" +
                        "<prod><name>wood pallet</name><prx>65</prx><qty>21</qty></prod>\n\n" +
                        "<prod><name>circular fan</name><prx>80</prx><qty>8</qty></prod>\n\n" +
                        "<prod><name>exhaust fan</name><prx>62</prx><qty>8</qty></prod>\n\n" +
                        "<prod><name>cattle prod</name><prx>990</prx><qty>2</qty></prod>\n\n" +
                        "<prod><name>window fan</name><prx>62</prx><qty>8</qty></prod>";


catalog(s,"saw");


    }



    public static String catalog(String s, String article)

    {




        String u[] = s.split("\n\n");


        List<String> list = Arrays.asList(u);




        List<String> result = new ArrayList<>();


        for (int i = 0;i < u.length;i++)

            if (u[i].contains(article))
            {
                result.add(list.get(i));
            }


           String r = result.toString();

           String tab[] = r.split(("<prod><name>"));


        for (int i = 0;i<tab.length;i++)
        {
            tab[i] = tab[i].replace("</name><prx>"," > prx: $");
            tab[i] = tab[i].replace("</prx><qty>"," qty: ");
            tab[i] = tab[i].replace("</qty></prod>","");
            tab[i] = tab[i].replace("[","");
            tab[i] = tab[i].replace("]","");
            tab[i] = tab[i].replaceAll(",", "");
        }

        String last = "";
        String mod = "";


            for (int i = 1; i < tab.length; i++)
            {
                last += tab[i].trim() + "\n";
            }

            mod = last.trim();

            if (mod == "")

            {
                mod = "Nothing";

            }

            System.out.println(mod);

        return mod;
    }
}
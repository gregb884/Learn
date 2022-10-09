package codewars;

import java.util.stream.IntStream;
//import org.apache.commons.lang3.StringUtils;

public class UpsideDown {}

   /* public int solve(int x, int y)
    {
        return (int) IntStream.range(x, y)
                .filter(i -> !StringUtils.containsAny(String.valueOf(i), "23457"))
                .filter(i -> new StringBuilder(i + "").reverse().toString()
                        .replaceAll("6", "2")
                        .replaceAll("9", "6")
                        .replaceAll("2", "9")
                        .equals(String.valueOf(i)))
                .count();



    }
}*/
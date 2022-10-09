package codewars;
import java.util.Arrays;

//https://www.codewars.com/kata/5270d0d18625160ada0000e4/train/java


// Throw       Score
// ---------   ------------------
// 5 1 3 4 1   250:  50 (for the 5) + 2 * 100 (for the 1s)
// 1 1 1 3 1   1100: 1000 (for three 1s) + 100 (for the other 1)
// 2 4 4 5 4   450:  400 (for three 4s) + 50 (for the 5)

//Three 1's => 1000 points
// Three 6's =>  600 points
// Three 5's =>  500 points
// Three 4's =>  400 points
// Three 3's =>  300 points
// Three 2's =>  200 points
// One   1   =>  100 points
// One   5   =>   50 point

public class Greed {

    public static void main(String[] args) {

        greedy(new int[]{6, 6, 6, 6, 1});


    }


    public static int greedy(int[] dice) {
        int t1 = 0;
        int t6 = 0;
        int t5 = 0;
        int t4 = 0;
        int t3 = 0;
        int t2 = 0;
        int o1 = 0;
        int o5 = 0;


        for (int i = 0; i < dice.length; i++) {
            switch (dice[i]) {
                case 1:
                    t1++;
                    break;
                case 2:
                    t2++;
                    break;
                case 3:
                    t3++;
                    break;
                case 4:
                    t4++;
                    break;
                case 5:
                    t5++;
                    break;
                case 6:
                    t6++;
                    break;
                default:
                    break;
            }
        }

        int sum = 0;

        while (t1 > 3)
        {
            sum += 1000;
            o1 = t1 -3 ;
            sum += o1 * 100;
            break;
        }
        while (t1 < 3)
        {
            sum += t1 *100;
            break;
        }
        while (t5 > 3)
        {
            sum += 500;
            o5 = t5 - 3;
            sum += o5 * 50;
            break;
        }
        while (t5 < 3)
        {
        sum += t5 * 50;
            break;
        }

        while (t1 == 3)
        {
            sum += 1000;
            break;
        }
        while (t2 >= 3)
        {
            sum += 200;
            break;
        }
        while (t3 >= 3)
        {
            sum += 300;
            break;
        }
        while (t4 >= 3)
        {
            sum += 400;
            break;
        }
        while (t5 == 3)
        {
            sum += 500;
            break;
        }
        while (t6 >= 3)
        {
            sum += 600;
            break;
        }



            System.out.println("t1 " + t1);
            System.out.println("t2 " + t2);
            System.out.println("t3 " + t3);
            System.out.println("t4 " + t4);
            System.out.println("t5 " + t5);
            System.out.println("t6 " + t6);
            System.out.println(sum);

            System.out.println("Score for "+ Arrays.toString(dice)+" must be "+sum+":");


            return sum;
        }
    }

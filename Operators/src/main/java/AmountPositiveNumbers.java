/**
 *
 */
public class AmountPositiveNumbers {

    public static int main(int[] test) {

        int c=0;
        for (int value : test) {
            if (value>0)
            {c = c + value;}
        }
        System.out.println("Amount of positive numbers is " + c);
        return c;
    }

    }

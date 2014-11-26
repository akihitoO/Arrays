import java.util.Scanner;

/**
 *
 */
public class AmountDigits {

    public static int main(int i){

        int sum = 0;
        while(i != 0){
            sum = sum + (i % 10);
            i= i / 10;
        }
        System.out.println(sum + " ");
        return sum;
    }

    }

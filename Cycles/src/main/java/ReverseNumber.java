/**
 *
 */
public class ReverseNumber {

    public static String main(int num){

        String reverse = new StringBuffer(Integer.toString(num)).reverse().toString();
        System.out.println(reverse);
        return reverse;
    }

    }

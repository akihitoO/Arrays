/**
 *
 */
public class Factorial {

    public static int main(int n)
    {
        int ret = 1;
        for (int i = 1; i <= n; ++i) ret *= i;
        System.out.println("Factorial = " + ret);
        return ret;
    }

    }

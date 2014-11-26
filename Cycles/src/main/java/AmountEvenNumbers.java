/**
 *
 */
public class AmountEvenNumbers {

    public static int[] main(String[] args) {

        int[] nums = new int[99];

        for (int i = 0; i < nums.length; i++)
            nums[i] = i+1;

        int sum = 0;
        int i = 0;
        for (int n : nums)
            if(n%2==0) {
                sum += n;
                i += 1;
            }

        System.out.println("Amount of even numbers = " + sum);
        System.out.println("Quantity of even numbers = " + i);
        return new int[] {sum, i};

    }

    }

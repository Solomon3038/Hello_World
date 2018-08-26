package loops;

public class Loops {


    public static void main(String[] args) {


        // Create an array with room for 100 integers
        int[] nums = new int[100];

// Fill it with numbers using a for-loop
        for (int i = 0; i < 100; i++)

        {
            nums[i] = i + 1;  // +1 since we want 1-100 and not 0-99

            // Compute sum
            int sum = 0;
            for (int n : nums)
                sum += n;

            System.out.println(sum);


            /*int i = 100;
// Implement the fomrulae n*(n+1)/2
            int sum = (i*(i+1))/2;
            System.out.println(sum);*/
        }
    }
}



import java.util.*;

public class program4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to input: ");
        int n = sc.nextInt();
        int[] input = new int[n];

        // Take array input from user
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        // Map to store multiples count (1–9)
        Map<Integer, Integer> result = new HashMap<>();

        // Initialize map with 0
        for (int i = 1; i <= 9; i++) {
            result.put(i, 0);
        }

        // Check multiples
        for (int num : input) {
            for (int key = 1; key <= 9; key++) {
                if (num % key == 0) {
                    result.put(key, result.get(key) + 1);
                }
            }
        }

        System.out.println("Output: " + result);
    }
}

import java.util.*;
public class program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to input: ");
        int n = sc.nextInt();
        int[] input = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            result.put(i, 0);
        }
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

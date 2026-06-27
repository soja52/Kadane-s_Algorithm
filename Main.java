public import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = 3;

        int[] result = new int[arr.length * k];

        int index = 0;

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < arr.length; j++) {
                result[index++] = arr[j];
            }
        }

        System.out.println("K-time concatenated array:");
        System.out.println(Arrays.toString(result));
    }
} {
    
}

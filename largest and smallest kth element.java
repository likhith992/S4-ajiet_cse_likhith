import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] numbers = {45, 12, -85, 32, 67, 78, 89};
        int k = 2;
        
        Arrays.sort(numbers);
        
        int kSmallest = numbers[k - 1];
        int kLargest = numbers[numbers.length - k];
        
        System.out.println(k + "-th Smallest: " + kSmallest);
        System.out.println(k + "-th Largest: " + kLargest);
    }
}

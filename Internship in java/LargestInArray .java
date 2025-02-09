public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 1, 9 };
        int largest = arr[0];
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println("Largest: " + largest);
    }
}
public class EvenOddCounter {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        
        int evenCount = 0;
        int oddCount = 0;
        
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        System.out.println("Even Count = " + evenCount);
        System.out.println("Odd Count = " + oddCount);
    }
}
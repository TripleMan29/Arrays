public class MaxArray {
    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, -20, 8};
        findMaxSubarray(a);
    }

    public static void findMaxSubarray(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("empty array");
            return;
        }

        int maxSumStartIndex = 0;
        int maxSumLastIndex = 0;
        int maxSum = arr[0];

        int lastSumStartIndex = 0;
        int lastSum = arr[0];

        for (int i=1; i<arr.length; i++) {

            lastSum += arr[i];
            if (lastSum < arr[i]) {
                lastSum = arr[i];
                lastSumStartIndex = i;
            }

            if (maxSum < lastSum) {
                maxSumStartIndex = lastSumStartIndex;
                maxSumLastIndex = i;
                maxSum = lastSum;
            }
        }

        System.out.println("sum( arr["+maxSumStartIndex+"] .. arr["+maxSumLastIndex+"] ) = " + maxSum);
        for (int i=maxSumStartIndex; i<=maxSumLastIndex; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

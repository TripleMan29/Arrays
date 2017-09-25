import java.sql.Array;
import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {
        int[] a = search(new int[]{1, 2, -3, 4, 5, -20, 8});
        System.out.println(Arrays.toString(a));
    }

    static int[] search(int[] arr){
        int[] maxSumArr = new int[arr.length];
  //      int[] indexArr = new int[arr.length];
        int[] timeArray = new int[arr.length];

        int summa = 0;

        for (int i = 0; i < arr.length; i++){

            summa += arr[i];

            if (summa <= 0){
                summa = 0;
           //     indexArr = new int[arr.length - i];
                timeArray = new int[arr.length];
            }
            else
                timeArray[i] = arr[i];
     //           indexArr[i] = i;
            if (allSum(maxSumArr) < allSum(timeArray)) {
                for (int j = 0; j < maxSumArr.length; j++) maxSumArr[j] = timeArray[j];
            }
        }
        return maxSumArr;
    }

    static int allSum(int[] array){
        int sum = 0;
        for (int i : array){
            sum += i;
        }
        return sum;
    }
  /*  public static int[] deviding(int[] arr){
        int halfSize = arr.length/2;
        int[] fisrtArray = new int[halfSize];
        int[] secondArray = new int[arr.length - halfSize];

        for(int i = 0; i < halfSize; i++){
            fisrtArray[i] = arr[i];
        }

        if (fisrtArray.length < 3) deviding(fisrtArray);


        for (int i = halfSize; i < arr.length; i++){
            secondArray[i] = arr[i];
        }

        if (secondArray.length < 3) deviding(secondArray);

    }*/
}

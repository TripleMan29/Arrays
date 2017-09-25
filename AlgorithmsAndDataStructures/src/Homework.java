import java.sql.Array;
import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {
        int[] a = search(new int[]{1, 2, -3, 4, 5, -20, 8});
        System.out.println(Arrays.toString(a));
    }

    static int[] search(int[] arr){
        int[] maxSumArr = new int[0];
        int[] timeArray = new int[0];

        int summa = 0;

        for (int i : arr){

            summa += i;

            if (summa <= 0){
                summa = 0;
                timeArray = new int[0];
            }
            else {
                timeArray = Arrays.copyOf(timeArray, timeArray.length + 1);
                timeArray[timeArray.length - 1] = i;
            }
            if (allSum(maxSumArr) < allSum(timeArray)) maxSumArr = Arrays.copyOf(timeArray, timeArray.length);
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
}

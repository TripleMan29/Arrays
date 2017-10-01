import java.sql.Array;
import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {
        int[] a = search(new int[]{1, 2, -3, 4, 5, -20, 8});
        System.out.println(Arrays.toString(a));
    }

    static int[] search(int[] arr){
        int timeIndex = 0;
        int firstIndex = 0;
        int secondIndex = -1;

        int summa = 0;

        int maxSumma = 0;

        for (int i = 0; i < arr.length; i++){

            summa += arr[i];

            if (summa <= 0){
                summa = 0;
                timeIndex = i + 1;
            }
            else if (summa > maxSumma){
                maxSumma = summa;
                firstIndex = timeIndex;
                secondIndex = i;
            }
        }
        return Arrays.copyOfRange(arr, firstIndex, secondIndex + 1);
    }
}
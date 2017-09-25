import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Testing {
    @Test
    void searchTheSubArr(){
        int[] in1 = {1, 2, -3, 4, 5, -20, 8};
        int[] out1 = {4, 5};

        int[] in2 = {};
        int[] out2 = {};

        int[] in3 = {-2, -5, -1};
        int[] out3 = {};

        int[] in4 = {1, 2, 3, 4, -1, -2, 100, -40, -1, -3, -5, 10, 40, 0, 0};
        int[] out4 = {1, 2, 3, 4, -1, -2, 100, -40, -1, -3, -5, 10, 40};

        int[] in5 = {1, 2, 3, 6, -1, -1, -1, 100, -121, -1, -3, -5, 10, 400, -30, 40};
        int[] out5 = {10, 400, -30, 40};

        assertEquals(Arrays.toString(out1), Arrays.toString(Homework.search(in1)));

        assertEquals(Arrays.toString(out2), Arrays.toString(Homework.search(in2)));

        assertEquals(Arrays.toString(out3), Arrays.toString(Homework.search(in3)));

        assertEquals(Arrays.toString(out4), Arrays.toString(Homework.search(in4)));

        assertEquals(Arrays.toString(out5), Arrays.toString(Homework.search(in5)));
    }
}

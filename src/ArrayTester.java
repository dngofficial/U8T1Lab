import java.util.Arrays;

public class ArrayTester
{
    public static void main(String[] args) {
        String[][] names = {{"Abby", "Don", "George", "Kim"},
                            {"Brian", "Elenor", "Harry", "Lenny"},
                            {"Cathy", "Fred", "Jill", "Matt"}};



        names[1][2] = "Paul";

        for (String[] name : names)
        {
            System.out.println(Arrays.toString(name));
        }

        String temp = names[0][0];
        names[0][0] = names[2][3];
        names[2][3] = temp;

        for (String[] name : names)
        {
            System.out.println(Arrays.toString(name));
        }

        String[] temp1 = names[0];
        names[0] = names[1];
        names[1] = temp1;

        for (String[] name : names)
        {
            System.out.println(Arrays.toString(name));
        }


        //num testing

        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[3][2];
        for (int[] ints : arr1)
        {
            System.out.println(Arrays.toString(ints));
        }

        for (int[] ints : arr2)
        {
            System.out.println(Arrays.toString(ints));
        }

        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;

        for (int[] ints : arr1)
        {
            System.out.println(Arrays.toString(ints));
        }

        arr2[0][0] = 1;
        arr2[0][1] = 4;
        arr2[1][0] = 2;
        arr2[1][1] = 5;
        arr2[2][0] = 3;
        arr2[2][1] = 6;

        for (int[] ints : arr2)
        {
            System.out.println(Arrays.toString(ints));
        }

        System.out.println(arr1.length);


        // TEST CODE FOR average
        int[][] testArr1 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(FunWith2DArrays.average(testArr1));
        int[][] testArr2 = {{1, 2, 3, 4}, {7, 8, 9, 10}};
        System.out.println(FunWith2DArrays.average(testArr2));
        int[][] testArr3 = {{4, 5, 2}, {1, 9, 7}, {8, 10, 13}};
        System.out.println(FunWith2DArrays.average(testArr3));
        int[][] testArr4 = {{4}, {7}, {8}, {2}};
        System.out.println(FunWith2DArrays.average(testArr4));
        int[][] testArr5 = {{4}};
        System.out.println(FunWith2DArrays.average(testArr5));

        // TEST CODE FOR indexFound
        String[][] words = {{"hi", "bye", "stuff", "go"}, {"time", "up", "you", "good"}, {"map", "low", "bow", "mom"}};
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "stuff")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "good")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "map")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "cat")));
        System.out.println("--------------");

        String[][] words2 = {{"time", "up", "bye"}, {"hi", "hit", "up"}, {"map", "bam", "low"}, {"bow", "mom", "joy"}};
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "time")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "joy")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "bam")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "cat")));


    }
}


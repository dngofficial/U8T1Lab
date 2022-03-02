import java.util.Arrays;

public class FunWith2DArrays
{
    public static int totalElements(int[][] ints)
    {
        int sum  = 0;

        for (int[] nums : ints)
        {
            sum += nums.length;
        }

        return sum;
    }

    public static void fourCorners(String[][] strArray)
    {
        System.out.println(strArray[0][0]);
        System.out.println(strArray[0][strArray[0].length  -1]);
        System.out.println(strArray[strArray.length - 1][0]);
        System.out.println(strArray[strArray.length - 1][strArray[0].length  -1]);

    }
}


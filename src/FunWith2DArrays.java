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

    public static double average(int[][] intArray)
    {
        double sum = 0;
        int total = 0;
        for (int[] nums : intArray)
        {
            for (int nums1 : nums)
            {
                sum += nums1;
                total++;
            }
        }

        return sum / total;
    }

    public static int[] indexFound(String[][] strArray, String searchTerm)
    {


        int[] finalArray = new int[2];
        for (int i = 0; i < strArray.length; i++)
        {
            for (int j = 0; j < strArray[0].length; j++)
            {

                if (strArray[i][j].equals(searchTerm))
                {
                    finalArray[0] = i;
                    finalArray[1] = j;
                    return finalArray;
                }
            }

        }
        finalArray[0] = -1;
        finalArray[1] = -1;

        return finalArray;

        //a
    }
}


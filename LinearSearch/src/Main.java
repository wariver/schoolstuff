import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Hello World!");
        System.out.println("Please enter the number you wish to search for ");
        Scanner scanner = new Scanner(System.in);
        int searchValue = scanner.nextInt();
        System.out.println(linearSearchAnswer(searchValue, linearSearch(a, searchValue)));
    }

    private static int linearSearch(int[] dataSet, int searchValue){
//     if the sataset has three values
        int index = 0;
        for (int i : dataSet) {
        if (i == searchValue) return index+1;

        index++;
        }
        return -1;
    }
    private static String linearSearchAnswer(int searchValue, int searchPositionResult){
        if(searchPositionResult != -1) return "the number " + searchValue + " was found in position " + searchPositionResult;
        else return "The number " + searchValue + " was not found in the given dataset";
    }
}

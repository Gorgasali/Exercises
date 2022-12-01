import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static boolean arr(int testNum) {
        int[] nums = new int[]{5, 3, 6, 8, 10,};
        int len = nums.length;
        boolean exists = false;
        for (int i = 0; i < len - 1; i++)
            if (testNum == nums[i])
                exists = true;
        return exists;
    }

    public static int diagonalSimOfArray(int a) {
        int[][] twoD = new int[a][a];
        int k = 1;
        int sum = 0;
        int c = 0;

        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD.length; j++) {
                twoD[i][j] = k++;
            }
        }
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD.length; j++) {
                System.out.print(" " + twoD[i][j]);
            }
            System.out.println();
        }
        for (int l = twoD.length - 1; l >= 0; l--) {
            int n = twoD[c][l];
            System.out.println("Element #" + c + " is: " + n);
            c++;
            sum += n;
        }
        return sum;
    }

    public static void getEvenElementsArray(int start, int total) {
        int temp = 0;
        int[] even = new int[total];
        for (int i = 0; i < total; i++) {
            if (start % 2 == 0) {
                even[i] = start + temp;
                System.out.println(even[i]);
                temp += 2;
            } else if (start % 2 == 1) {
                int nextEven = start + 1;
                even[i] = nextEven + temp;
                System.out.println(even[i]);
                temp += 2;

            }
        }
    }

    public static int[] progressivelyDecreasingNumbers(int start, int limit) {
        int[] result = new int[limit];
        int index = 0;
        for (int i = 1; i <= limit; i++) {
            start -= i;
            result[index] = start;
            // System.out.println(result[index]);
        }
        return result;
    }


    public static int frequency(int n, int testNum) {
        int count = 0;
        while (n > 0) {

            // check if the digit is D
            count = (n % 10 == testNum) ?
                    count + 1 : count;
            n = n / 10;
        }
        return count;
    }

    public static int[] removeElement(int arr[], int pos){
        for (int i = pos-1; i<arr.length-1; i++) {
            arr[i] = arr[i + 1];
        }

        int[] newArr = new int[arr.length-1];
        for (int i =0; i< newArr.length;i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }
    public static void arrList(){
        ArrayList<String> seasons = new ArrayList<>();
        seasons.add("Winter");
        seasons.add("Summer");
        seasons.add("Spring");
        seasons.add("Autumn");
        System.out.println("season.indexOf(\"Summer\") = " + seasons.indexOf("Summer"));

        seasons.remove("Summer");

        System.out.println("seasons.indexOf(\"Summer\") = " + seasons.indexOf("Summer"));
        System.out.println("seasons.indexOf(\"Summer\") = " + seasons.contains("Summer"));
    }
    public static void copyOnWrite (){
        ArrayList<String> names = new ArrayList<>(
                Arrays.asList("John", "Anton", "Heinz"));
        names.forEach(name -> {
            if (name.contains("o")) names.remove(name);
        });
        System.out.println("names = " + names);
        names.listIterator();

    }

    public static int fib(int k) {
        if (k == 0) return 0;
        else if (k <= 2) return 1;
        return fib(k-1) + fib(k-2);
    }



    public static char ticTacToeWinner(char[][] arr) {
        for(int i = 0;i<arr.length;i++) {
            //check for 3 rows
            if(arr[i][0] == arr[i][1] && arr[i][1]==arr[i][2])
                return arr[i][0];
            //check for 3 columns
            if(arr[0][i] == arr[1][i] && arr[1][i]==arr[2][i])
                return arr[0][i];
        }
        //main diagonal
        if(arr[0][0]==arr[1][1] && arr[1][1]==arr[2][2])
            return arr[0][0];
        //secondary diagonal
        if(arr[0][2]==arr[1][1] && arr[1][1]==arr[2][0])
            return arr[0][2];

        return 'D';
    }
    public static void innerOuter(){
        int outer = 0, inner = 0;
        for(int i =0;i<3;i++){
            outer++;
            System.out.println("outer i = "+i);
            for(int j=i+1;j<3;j++){
                inner++;
                System.out.println("inner i, j = "+i + " "+ j);
            }
        }
        //0   1 2
        //1     2
        //2

        System.out.println("outer, inner = "+outer + " "+ inner);
    }

    //Jessica
    public static int[] twoSum(int[] arr, int target) {
        int sum = 0;

        for (int i=0; i<arr.length; i++) {
            int first = arr[i];
            for (int j=0; j<arr.length; j++) {
                sum = first + arr[j];
                if (sum == target) {
                    System.out.println(arr[i] + " " + arr[j]);
//                    return new int[] {arr[i],arr[j]};
                }
            }
        }
        return new int[] {};
    }







    public static String reverseString(String str) {
        int stackSize = str.length();
        Stack theStack = new Stack();
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            theStack.push(ch);

        }
        String result = "";
        while (!theStack.isEmpty()) {
            char ch = (char) theStack.pop();
            result = result + ch;

        }
        return result;

    }
    public static String stackExample(String str){
        Stack stack = new Stack();
        String reverse = "";
        for(int i =0; i < str.length(); i++){
            stack.push(str.charAt(i));
        }
        while (!stack.isEmpty()){
            char ch = (char) stack.pop();
            reverse += ch;
        }
        return reverse;
    }
    public static void main (String[] args){
        System.out.println(stackExample("Givvviii"));

    }
}
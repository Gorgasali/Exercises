package exercisesWeek4;

public class Exercises {
    public static void mirror_inverse() {
        String message = "Yes";

        int[] arr = new int[]{3, 4, 2, 0, 1, 5, 6};
        for (int i = 0; i < arr.length; i++) {
            int l = 0;
            l = arr[i];
            if (arr[i] > arr.length) {
                message = "NO";
                break;
            }
            if (i != arr[l]) {
                message = "No";
                break;
            }
        }
        System.out.println(message);


    }

    class DecimalToBinary {
        static char reVal(int num) {
            if (num >= 0 && num <= 9)
                return (char) (num + 48);
            else
                return (char) (num -10 +65);
        }
            public static String decimalToBinary (int a, int b){
            String s = "";
            while (a > 0){
                s += reVal(a%b);
                a/=b;
            }
            StringBuilder ix = new StringBuilder();
            ix.append(s);

            return new String(ix.reverse());
            }
        }
    public static void main(String[] args) {
        mirror_inverse();
        System.out.println(DecimalToBinary.decimalToBinary(9,8));
    }
}





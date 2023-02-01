import java.util.Scanner;

public class CodingChallenge5 {
    public static void main(String[] args) {

       // fav food list
        Scanner scanner = new Scanner(System.in);
        String[] favFoods = new String[3];

        System.out.println("What are your top 5 favorite foods?");

        for ( int i = 0; i < favFoods.length; i++) {
            favFoods[i] = scanner.nextLine();
        }
        System.out.println("Sorry no more memory");


//       calculate sum of values
//        double[] values = new double[5];
//        values[0] = 22.1;
//        values[1] = 23.2;
//        values[2] = 25;
//        values[3] = 22;
//        values[4] = 33;
//
//        double sumValues = 0;
//
//        for (int i = 0; i < values.length; i++) {
//         sumValues = sumValues + values[i];
//        }
//        System.out.println(sumValues);

        //print arr backwards 1-20
//        int[] intArr = new int[20];
//
//        for (int i = 0; i < intArr.length; i++) {
//            intArr[i] = i + 1;
//        }
//        for (int i = intArr.length - 1; i >= 0; i--) {
//            System.out.println(intArr[i]);
//        }
    }
}

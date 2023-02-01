public class Arrays {
    public static void main(String[] args) {
        // for each looping
        double[] array = new double[] {25.55, 66.99, 44.77};

        for (double element : array) {
            System.out.println(element);
        }

        // looping an array
        int [] test = {100,52,76,111,65454};

        int  count = 0;
        int sumOfNums = 0;

        for (int i = 0; i< test.length; i++) {
            if (test[i] >= 100) {
                count++;
            }
            sumOfNums = sumOfNums + test[i];
        }
        System.out.println("Numbers greater than 100: " + count);
    }
}

public class Conditionals {
    public static void main(String[] args) {
        int x = 50;
        int y = 26;

        int difference = x - y;

        if (x > y) {
            System.out.format("%d is bigger than %d, and the differance is %d", x, y, difference);
        }

        else if (x < y) {
            System.out.format("%d is smaller than %d, and the differance is %d", x, y, difference);
        }

        else {
            System.out.format("%d and  %d are the  same.", x, y);
        }
    }
}

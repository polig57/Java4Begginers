import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        char[] position = {' ',' ',' ',' ',' ',' ',' ',' ',' '};

        Scanner scanner = new Scanner(System.in);
        int input;
        char turn = 'X';
        int currentTurn = 1;

        while (true) {
            do {
                System.out.println("Pick a box 1-9 ");
                input = scanner.nextInt();
            } while (position[input - 1] == 'X' || position[input - 1] == 'O');

            position[input - 1] = turn;

            System.out.println(" " + position[6] + " | " + position[7] + " | " + position[8] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + position[3] + " | " + position[4] + " | " + position[5] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + position[0] + " | " + position[1] + " | " + position[2] + " ");

            if (position[0] == turn && position[1] == turn && position[2] == turn
                    || position[3] == turn && position[4] == turn && position[5] == turn
                    || position[6] == turn && position[7] == turn && position[8] == turn
                    || position[6] == turn && position[3] == turn && position[0] == turn
                    || position[7] == turn && position[4] == turn && position[1] == turn
                    || position[8] == turn && position[5] == turn && position[2] == turn
                    || position[6] == turn && position[4] == turn && position[2] == turn
                    || position[8] == turn && position[4] == turn && position[0] == turn) {
                System.out.println(turn + " is the WINNER!");
                break;
            }

            if (turn == 'X') {
                turn = 'O';
            } else if (turn == 'O') {
                turn = 'X';
            }
            currentTurn++;
            if (currentTurn > 9) {
                System.out.println("DRAW");
                break;
            }
        }
    }
}

package spw4.gameConnectFour;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        Game game = new GameImpl();
        game.initialize();
        System.out.println(game);

        while (!game.isOver()) {
            System.out.print("command [1-7, (r)estart, (q)uit, (h)elp] > ");
            input = scanner.nextLine();

        switch (input) {
            case "1", "2", "3", "4", "5", "6", "7":
                game.placeToken(Integer.parseInt(input));
                break;
            case "r":
                game.initialize();
                break;
            case "q":
                System.out.println("Ok, bye.");
                return;
            case "h":
                printHelp();
                break;
            default:
                System.out.println("Unknown command");
                break;
        }
        System.out.println(game);
    }

        System.out.println(game.isWon() ? "You win!!! :)" : "You lose. :(");
}


    private static void printHelp() {
        System.out.println();
        System.out.println("Available commands:");
        System.out.println("-------------------");
        System.out.println("1-7 --> choose column");
        System.out.println("r --> restart game");
        System.out.println("q --> quit game");
        System.out.println("h --> show help");
    }
}

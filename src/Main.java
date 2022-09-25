import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(2, 2);
        Scanner scan = new Scanner(System.in);
        int option;

        do {
            System.out.println("========================");
            System.out.println("Welcome to Pacman Game");
            System.out.println("========================");

            System.out.println("What do you want to do ?");
            System.out.println("1. Show Current Location");
            System.out.println("2. Move up");
            System.out.println("3. Move down");
            System.out.println("4. Move left");
            System.out.println("5. Move right");
            System.out.println("6. Undo move");
            System.out.println("7. Exit game");

            System.out.print("Please input your option : ");
            option = scan.nextInt();

            switch (option) {
                case 1 -> {
                    Coordinate coordinate = game.getCoordinateHistory().getCoordinate();
                    System.out.println("x : " + coordinate.getX());
                    System.out.println("y : " + coordinate.getY());
                    scan.nextLine();
                    scan.nextLine();
                }
                case 2 -> game.moveUp();
                case 3 -> game.moveDown();
                case 4 -> game.moveLeft();
                case 5 -> game.moveRight();
                case 6 -> game.undoMove();
                case 7 -> System.out.println("Thank you");
                default -> System.out.println("Input invalid");
            }
        } while(option != 7);
    }
}
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("============================.");;
            System.out.println("Select an optionę:");
            System.out.println("1.New game");
            System.out.println("2.View movie listw");
            System.out.println("3.Exit");
            System.out.println("============================.");;
            String playerChoice = scanner.nextLine();
            System.out.println("============================.");;

            if("1".equals(playerChoice)) {
                System.out.println("============================.");;
                System.out.println("Game development.");
                System.out.println("============================.");;
            } else if ("2".equals(playerChoice)) {
                game.displayMovies();
            } else if ("3".equals(playerChoice)) {
                System.out.println("============================.");;
                System.out.println("End of program.");
                System.out.println("============================.");;
                break;
            }else {
                System.out.println("============================.");;
                System.out.println("Invalid option, please try again!");
                System.out.println("============================.");;
            }
        }
    }
    public static class Game {
        private ArrayList<String> moviessList = new ArrayList<>();

        public Game() {
            populateMoviesLis();
        }
        public void displayMovies() {
            System.out.println("Movies list ");
            for(String movie : moviessList){
                System.out.println(movie);

            }
        }

        private void  populateMoviesLis() {
            moviessList.add("The Shawshank Redemption");
            moviessList.add("The Godfather");
            moviessList.add("The Dark Knight");
            moviessList.add("Schindler's List");
            moviessList.add("Pulp Fiction");
            moviessList.add("The Lord of the Rings");
            moviessList.add("The Good The Bad and The Ugly");
            moviessList.add("Fight Club");
            moviessList.add("The Lord of the Rings");
            moviessList.add("Forrest Gump");
            moviessList.add("Star Wars");
            moviessList.add("Inception");
            moviessList.add("The Lord of the Rings");
            moviessList.add("The Matrix");
            moviessList.add("Samurai");
            moviessList.add("Star Wars");
            moviessList.add("City of God");
            moviessList.add("The Silence of the Lambs");
            moviessList.add("Batman Begins");
            moviessList.add("Die Hard");
            moviessList.add("Chinatown");
            moviessList.add("Room");
            moviessList.add("Dunkirk");
            moviessList.add("Fargo");
            moviessList.add("No Country for Old Men");
        }
    }

}
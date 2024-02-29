import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        //Menu
        while (true) {
            System.out.println("============================.");
            System.out.println("Select:");
            System.out.println("1.New game - guess what movie it is ?");
            System.out.println("2.View movie listw");
            System.out.println("3.Exit");
            System.out.println("============================.");
            String playerChoice = scanner.nextLine();

            if ("1".equals(playerChoice)) {
                game.gameLogic();
            } else if ("2".equals(playerChoice)) {
                game.displayMovies();
            } else if ("3".equals(playerChoice)) {
                System.out.println("============================.");
                System.out.println("End of program.");
                System.out.println("============================.");
                break;
            } else {
                System.out.println("============================.");
                System.out.println("Invalid option, please try again!");
                System.out.println("============================.");
            }
        }
    }

    public static class Game {
        //Lista filmów
        private ArrayList<String> moviessList = new ArrayList<>();

        public Game() {
            populateMoviesLis();
        }

        //Wypisanie listy filmów
        public void displayMovies() {
            System.out.println("Movies list ");
            for (String movie : moviessList) {
                System.out.println(movie);
            }
        }

        // Dodanie listy filmów
        private void populateMoviesLis() {
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

        //Randomowy wybór filmu
        public String pickMovie() {
            Random random = new Random();
            return moviessList.get(random.nextInt(moviessList.size()));
        }

        //Ukrywanie filmu znakami ("_")
        public String hiddenMovieTitle(String movieGuess) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < movieGuess.length(); i++) {
                sb.append("_");
            }
            return sb.toString();
        }

        // Logika gry
        public void gameLogic() {
            int chance = 10;
            System.out.println("============================.");
            String guesseRandom = pickMovie().toLowerCase();
//            System.out.println(guesseRandom);
            String guesseHiden = hiddenMovieTitle(guesseRandom);

            while (chance > 0) {
                System.out.println("You have " + chance + " chances - Add a letter.");
                Scanner scanner2 = new Scanner(System.in);

                String guess = scanner2.nextLine();
                StringBuilder sb = new StringBuilder(guesseHiden);
                // Jeżeli tak, zamienia '_' na daną literę w ukrytej nazwie filmu
                if (guesseRandom.contains(guess)) {
                    for (int i = 0; i < guesseRandom.length(); i++) {
                        if (guesseRandom.charAt(i) == guess.charAt(0)) {
                            sb.setCharAt(i, guess.charAt(0));
                        }
                    }
                    guesseHiden = sb.toString();
                    System.out.println("A movie to guess: " + guesseHiden);
                } else {
                    System.out.println("A movie to guess: " + guesseHiden);
                    chance--;
                }
                if (guesseRandom.equals(guesseHiden)) {
                    System.out.println("You won - Movie was: " + guesseRandom);
                    return;
                }
            }
            System.out.println("You lost-Movie was: " + guesseRandom);
        }
    }
}
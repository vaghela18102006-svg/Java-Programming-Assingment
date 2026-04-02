/*
 * Problem Statement: Develop inheritance-based Cricket-Match system using 
 * command line arguments.
 */

// 1. Superclass (Parent Class)
class CricketMatch {
    // Protected variables can be accessed by the subclass
    protected String matchFormat;
    protected String venue;

    // Constructor to initialize match details
    public CricketMatch(String matchFormat, String venue) {
        this.matchFormat = matchFormat;
        this.venue = venue;
    }

    // Method to print match info
    public void displayMatchDetails() {
        System.out.println("Match Format: " + matchFormat);
        System.out.println("Venue: " + venue);
    }
}

// 2. Subclass (Child Class) inheriting from CricketMatch using 'extends'
class PlayerPerformance extends CricketMatch {
    private String playerName;
    private int runsScored;
    private int wicketsTaken;

    // Constructor to initialize all details, including parent class details
    public PlayerPerformance(String format, String venue, String name, int runs, int wickets) {
        // 'super' calls the constructor of the parent class (CricketMatch)
        super(format, venue); 
        this.playerName = name;
        this.runsScored = runs;
        this.wicketsTaken = wickets;
    }

    // Method to print player info
    public void displayPerformance() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Runs Scored: " + runsScored);
        System.out.println("Wickets Taken: " + wicketsTaken);
    }
}

// 3. Main Class to run the program
public class Program5 {
    public static void main(String[] args) {
        
        // Check if the user provided exactly 5 command line arguments
        if (args.length != 5) {
            System.out.println("Error: Please provide exactly 5 command line arguments.");
            System.out.println("Usage: java Program5 <Format> <Venue> <PlayerName> <Runs> <Wickets>");
            System.out.println("Example: java Program5 T20 Wankhede Virat 82 0");
            return; // Stop the program if arguments are missing
        }

        System.out.println("=== Cricket Match Performance Report ===");

        // Read data from command line arguments (args array)
        String format = args[0];
        String venue = args[1];
        String player = args[2];
        
        // Convert the String arguments for runs and wickets into integers
        int runs = Integer.parseInt(args[3]);
        int wickets = Integer.parseInt(args[4]);
        
        // Create an object of the subclass
        PlayerPerformance report = new PlayerPerformance(format, venue, player, runs, wickets);
        
        // Call methods (Inherited from parent and specific to child)
        report.displayMatchDetails();
        System.out.println("----------------------------------------");
        report.displayPerformance();
    }
}
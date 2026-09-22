package com.intermidiate.classesandobjects;

/**
 * Main application class demonstrating object creation (instantiation),
 * array storage of objects, and iterating over array elements to invoke methods.
 */
public class BasketballApp {

    /**
     * The entry point of the Java application.
     *
     * @param args Command line arguments passed to the application
     */
    public static void main(String[] args) {
        // Instantiate BasketballPlayer objects with custom player attributes and statistics
        BasketballPlayer kobe = new BasketballPlayer("Kobe Bryant", "Black Mamba", 1978, "Lakers", 83.7, 30.0, 1346);
        BasketballPlayer michael = new BasketballPlayer("Michael Jordan", "MJ", 1963, "Chicago Bulls", 83.5, 30.1,
                1072);
        BasketballPlayer magic = new BasketballPlayer("Earvin Johnson", "Magic", 1959, "Lakers", 84.8, 19.5, 906);

        // Declare and allocate memory for an array capable of holding 3 BasketballPlayer objects
        BasketballPlayer[] basketballPlayers = new BasketballPlayer[3];
        
        // Populate the array elements with the instantiated player references
        basketballPlayers[0] = kobe;
        basketballPlayers[1] = michael;
        basketballPlayers[2] = magic;

        // Iterate through each player in the array using an enhanced for-loop (for-each loop)
        // and call the freeThrow() method to simulate free throw attempts
        for (BasketballPlayer basketballPlayer : basketballPlayers) {
            basketballPlayer.freeThrow();
        }

    }

}


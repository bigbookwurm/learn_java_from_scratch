package com.beginner.endsection;

/**
 * IMDBApp is an end-section project application that demonstrates beginner Java concepts:
 * - Variable declaration and basic arithmetic calculations
 * - Array initialization and indexed access
 * - Controlled iteration using for loops
 * - Helper methods with parameters and return values
 * - Conditional logic branching with if-else statements
 */
public class IMDBApp {

    /**
     * Main entry point of the Java application.
     * 
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        // Actor details
        String actorName = "Tom Cruise";
        int yearBorn = 1962;
        int age = 2026 - yearBorn; // Calculate age dynamically based on birth year

        // Array containing movie titles
        String[] movieTitles = {
                "The Last Samurai",
                "Minority Report",
                "Top Gun",
                "Cocktail",
                "Mission Impossible"
        };

        // Array containing corresponding float ratings for each movie
        float[] movieRatings = {
                7.7f,
                7.6f,
                6.9f,
                8.0f,
                7.3f
        };

        // Print header information about the actor
        System.out.println("Actor: " + actorName);
        System.out.println("Age: " + age);

        // Iterate through the movies array using a for loop
        for (int i = 0; i < movieRatings.length; i++) {
            // Output each movie title along with its descriptive rating string from getRating()
            System.out.println(movieTitles[i] + " - " + getRating(movieRatings[i]));
        }
    }

    /**
     * Converts a numeric float rating into a descriptive text evaluation.
     * 
     * @param rating The numeric rating value (e.g., 7.7f).
     * @return A string representing the rating category ("bad", "average", "good", "very good", "excellent").
     */
    static String getRating(float rating) {
        if (rating <= 5.0) {
            return "bad"; // Ratings 5.0 and lower
        } else if (rating > 5.0 && rating <= 6.5) {
            return "average"; // Ratings between 5.0 (exclusive) and 6.5 (inclusive)
        } else if (rating > 6.5 && rating <= 7.0) {
            return "good"; // Ratings between 6.5 (exclusive) and 7.0 (inclusive)
        } else if (rating > 7.0 && rating <= 8.0) {
            return "very good"; // Ratings between 7.0 (exclusive) and 8.0 (inclusive)
        } else {
            return "excellent"; // Ratings above 8.0
        }
    }

}


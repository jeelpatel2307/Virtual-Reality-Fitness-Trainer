import java.util.Scanner;

// Class representing the Virtual Reality Fitness Trainer
public class VirtualRealityFitnessTrainer {
    // Method to start the virtual reality fitness session
    public void startSession() {
        System.out.println("Welcome to Virtual Reality Fitness Trainer!");
        System.out.println("Get ready for an immersive fitness experience.");

        // Simulating VR fitness session
        for (int i = 1; i <= 5; i++) {
            System.out.println("Exercise " + i + ": Perform your workout routine...");
            // Simulating exercise duration
            try {
                Thread.sleep(3000); // Sleep for 3 seconds (simulating exercise duration)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Great job! Keep going...");
        }

        System.out.println("Session completed! Good work!");
    }

    // Main method to start the program
    public static void main(String[] args) {
        // Create an instance of VirtualRealityFitnessTrainer
        VirtualRealityFitnessTrainer trainer = new VirtualRealityFitnessTrainer();
        // Start the fitness session
        trainer.startSession();
    }
}

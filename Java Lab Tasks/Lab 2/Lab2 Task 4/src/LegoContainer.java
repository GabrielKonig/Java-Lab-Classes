public class LegoContainer {
    public static void main(String[] args) {
        int legoBricks = 77; // Number of lego bricks
        int containerCapacity = 8; // Container capacity

        // Calculate the number of full containers
        int fullContainers = legoBricks / containerCapacity;

        // Calculate the remaining bricks after filling full containers
        int remainingBricks = legoBricks % containerCapacity;

        // Calculate the total number of containers (full and not full)
        int totalContainers = (remainingBricks > 0) ? fullContainers + 1 : fullContainers;

        // Calculate the number of bricks in the container that is not completely full
        int bricksInPartialContainer = (remainingBricks > 0) ? remainingBricks : 0;

        // Display the results
        System.out.println("Number of full containers: " + fullContainers);
        System.out.println("Total number of containers: " + totalContainers);
        System.out.println("Bricks in the partially filled container: " + bricksInPartialContainer);
    }
}

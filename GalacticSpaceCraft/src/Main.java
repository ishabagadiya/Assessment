public class Main {
    public static void main(String[] args) {
        int[] startingPosition = {0, 0, 0};
        String initialDirection = "N";
        String[] commands = {"f", "r", "u", "b", "l"};

        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(startingPosition[0], startingPosition[1], startingPosition[2], initialDirection);

        for (String command : commands) {
            switch (command) {
                case "f":
                    spacecraft.moveForward();
                    break;
                case "b":
                    spacecraft.moveBackward();
                    break;
                case "l":
                    spacecraft.turnLeft();
                    break;
                case "r":
                    spacecraft.turnRight();
                    break;
                case "u":
                    spacecraft.turnUp();
                    break;
                case "d":
                    spacecraft.turnDown();
                    break;
            }
        }

        int finalX = spacecraft.getX();
        int finalY = spacecraft.getY();
        int finalZ = spacecraft.getZ();
        String finalDirection = spacecraft.getDirection();

        System.out.println("Final Position: (" + finalX + ", " + finalY + ", " + finalZ + ")");
        System.out.println("Final Direction: " + finalDirection);
    }
}

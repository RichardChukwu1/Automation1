package testngClass;

public class MarsRover {
        private int x;
        private int y;
        private int maxX;
        private int maxY;
        private String direction;

        // Constructor for MarsRover class. Sets the initial position, direction and plateau size.
        public MarsRover(int x, int y, String direction, int maxX, int maxY) {
            this.x = x;
            this.y = y;
            this.direction = direction;
            this.maxX = maxX;
            this.maxY = maxY;
        }

        // Takes a string of instructions and processes each one.
        // If the instruction is 'M', it moves the rover forward.
        // If the instruction is 'L' or 'R', it turns the rover in that direction.
        // If the instruction is neither of those, it throws an exception.
        public void move(String instructions) throws Exception {
            for (char instruction : instructions.toCharArray()) {
                if (instruction == 'M') {
                    moveForward();
                } else if (instruction == 'L' || instruction == 'R') {
                    turn(instruction);
                } else {
                    throw new Exception("Invalid instruction: " + instruction);
                }
            }
        }

        // Moves the rover forward one grid point in the direction it is currently facing.
        // If the movement would cause the rover to fall off the plateau, it throws an exception.
        private void moveForward() throws Exception {
            int newX = x;
            int newY = y;
            if (direction.equals("N")) {
                newY += 1;
            } else if (direction.equals("S")) {
                newY -= 1;
            } else if (direction.equals("E")) {
                newX += 1;
            } else if (direction.equals("W")) {
                newX -= 1;
            }

            if (newX < 0 || newX > maxX || newY < 0 || newY > maxY) {
                throw new Exception("Movement would result in rover falling off the plateau");
            }

            x = newX;
            y = newY;
        }

        // Rotates the rover 90 degrees in the specified direction ('L' for left, 'R' for right) without moving it.
        private void turn(char instruction) {
            if (direction.equals("N")) {
                direction = instruction == 'L' ? "W" : "E";
            } else if (direction.equals("S")) {
                direction = instruction == 'L' ? "E" : "W";
            } else if (direction.equals("E")) {
                direction = instruction == 'L' ? "N" : "S";
            } else if (direction.equals("W")) {
                direction = instruction == 'L' ? "S" : "N";
            }
        }

        // Returns the rover's current position and direction as a string.
        public String getPosition() {
            return x + " " + y + " " + direction;
        }

        // Main method for running the program.
        // Reads the plateau size and rover information from the console,
        // creates a new MarsRover for each set of rover instructions, and moves it according to the instructions.
        // If an error occurs during the movement of a rover, it prints an error message and continues with the next rover.
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // read plateau size
            int maxX = sc.nextInt();
            int maxY = sc.nextInt();

            while (sc.hasNext()) {
                try {
                    MarsRover rover = new MarsRover(sc.nextInt(), sc.nextInt(), sc.next(), maxX, maxY);
                    rover.move(sc.next());
                    System.out.println(rover.getPosition());
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

            sc.close();
        }
    }

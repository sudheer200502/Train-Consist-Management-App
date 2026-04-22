class InvalidCapacityException extends Exception {
    InvalidCapacityException(String message) {
        super(message);
    }
}

class PassengerBogie {
    String type;
    int capacity;

    PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
        System.out.println("Bogie created: " + type + " with capacity " + capacity);
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            PassengerBogie b2 = new PassengerBogie("AC Chair", -10);
        } catch (InvalidCapacityException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        try {
            PassengerBogie b3 = new PassengerBogie("First Class", 0);
        } catch (InvalidCapacityException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        try {
            PassengerBogie b4 = new PassengerBogie("AC Chair", 56);
        } catch (InvalidCapacityException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println("System continues safely...");
    }
}
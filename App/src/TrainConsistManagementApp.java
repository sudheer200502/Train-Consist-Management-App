import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<String> bogieIds = new ArrayList<>();

        String searchKey = "BG101";

        if (bogieIds.isEmpty()) {
            throw new IllegalStateException("No bogies available in train. Search operation not allowed.");
        }

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie ID " + searchKey + " found");
        } else {
            System.out.println("Bogie ID " + searchKey + " not found");
        }
    }
}
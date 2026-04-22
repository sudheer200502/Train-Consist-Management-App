import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        String searchKey = "BG309";

        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int cmp = searchKey.compareTo(bogieIds[mid]);

            if (cmp == 0) {
                found = true;
                break;
            } else if (cmp > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (found) {
            System.out.println("Bogie ID " + searchKey + " found");
        } else {
            System.out.println("Bogie ID " + searchKey + " not found");
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        callElevator(5,6);
    }

    public static void callElevator(int currentL1, int currentL2) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Call elevator floor: ");
        int floor = scanner.nextInt();

        if (Math.abs(currentL1 - floor) <= Math.abs(currentL2 - floor)) {
            System.out.println("Elevator 1 is coming ");
            currentL1 = floor;
            callElevator(currentL1, currentL2);
        } else {
            System.out.println("Elevator 2 is coming ");
            currentL2 = floor;
            callElevator(currentL1, currentL2);
        }
    }
}
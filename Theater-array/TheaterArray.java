public class TheaterArray {
    int arr[][] = null;

    public TheaterArray(int row, int col) {
        arr = new int[row][col];
    }

    public void displaySeats() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public String reserveSeat(int row, int col) {
        if (arr[row][col] == 0) {
            arr[row][col] = 1;
            return "Seat successfully reserved.";
        } else {
            return "Sorry, this seat is already taken.";
        }
    }

    public static void main(String[] args) {
        TheaterArray theater = new TheaterArray(5, 5);
        theater.displaySeats();
        System.out.println(theater.reserveSeat(2, 2));
        theater.displaySeats();
        System.out.println(theater.reserveSeat(2, 2));
        theater.displaySeats();
    }
}

import java.util.Arrays; // para magamit po yung Arrays.deepToString()

    public class CinemaSeatingChart { // pangalan ng class
        public static void main(String[] args) { // ito po yung start ng program

            // 1. gumawa at maglagay ng laman yung 2D String array
            String[][] seats = { // ito po yung 2 rows
                    {"Alice", "Bob", "Charlie"}, // row 1
                    {"David", "Emma", "Frank"}   // row 2
            };

            // 2. para maprint yung nakaupo sa second row, third column
            System.out.println(seats[1][2]); // [1] = second row, [2] = third column para maprint yung Frank

            // 3. papaalitan yung "Bob" ng "Vacant"
            seats[0][1] = "Vacant"; // first row, second column si Bob

            // 4. para maprint yung buong seating arrangement in one line
            System.out.println(Arrays.deepToString(seats));
        }
    }



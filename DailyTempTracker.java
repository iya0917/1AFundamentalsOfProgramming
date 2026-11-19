public class DailyTempTracker { // pangalan ng class
        public static void main(String[] args) { // ito po yung start ng program

            // 1. gumawa ng double array na may 5 na slot
            double[] temperatures = new double[5];

            // 2. lagyan ng laman yung mga index
            temperatures[0] = 32.5; // Day 1
            temperatures[1] = 34.0; // Day 2
            temperatures[2] = 31.8; // Day 3
            temperatures[3] = 33.2; // Day 4
            temperatures[4] = 35.1; // Day 5

            // 3. for loop para maprint ang mga temperature
            for (int i = 0; i < temperatures.length; i++) { // ito po yung logic
                System.out.println("Day " + (i + 1) + ": " + temperatures[i]); // para maprint na yung mga temp
            }

            // 4. I-update ang temperature sa third day (index 2)
            temperatures[2] = 32.0; // gawing 32.0 mula 31.8

            // 5.para maprint ang bagong temperature sa third day
            System.out.println("Updated Day 3: " + temperatures[2]);
        }
    }


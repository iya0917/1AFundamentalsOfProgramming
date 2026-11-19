public class CoffeeShopAnalyzer { // pangalan ng class
    public static void main(String[] args) { // start ng program

        int[] weeklySales = {120, 145, 130, 155, 180, 210, 195}; // array ng benta kada araw
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}; // parallel array ng pangalan ng mga araw

        System.out.println("--- Daily Sales ---"); // para ma-print yung title
        for (int i = 0; i < weeklySales.length; i++) { // ito yung logic para ma-print yung mga araw
            System.out.println(daysOfWeek[i] + " sales: " + weeklySales[i]); // para ma-print yung day kasama nung daily sales
        }
        int totalSales = 0; // variable na mag-iipon ng total na benta, nagsisimula sa 0

        for (int dailySale : weeklySales) {
            totalSales += dailySale; // idinadagdag yung sales ng araw sa total
        }

        double averageSales = (double) totalSales / weeklySales.length; // Ang (double) cast ay pumipigil sa pagputol ng decimal sa integer division
        System.out.println("\n--- Weekly Summary ---"); // Nagpi-print ng pamagat ng buod ng linggo
        System.out.println("Total Sales: " + totalSales + " cups"); // Ipinapakita ang kabuuang bilang ng tasang naibenta
        System.out.println("Average Daily Sales: " + averageSales + " cups"); // Ipinapakita ang karaniwang benta kada araw

        int maxSales = weeklySales[0]; // ipinapalagay muna na ang unang araw ang pinakamataas
        int minSales = weeklySales[0]; // ipinapalagay muna na ang unang araw ang pinakamababa
        String bestDay = daysOfWeek[0]; // sinusubaybayan ang araw na may pinakamataas na benta
        String worstDay = daysOfWeek[0]; // sinusubaybayan ang araw na may pinakamababang benta

        for (int i = 1; i < weeklySales.length; i++) { // for loop para sa logic
            if (weeklySales[i] > maxSales) { // sinusuri kung mas mataas ang kasalukuyang benta kaysa sa kasalukuyang max
                maxSales = weeklySales[i]; // ina-update ang max sa bagong pinakamataas na halaga
                bestDay = daysOfWeek[i]; // itinatala ang pangalan ng araw na iyon bilang pinakamagandang araw
            }

            if (weeklySales[i] < minSales) { // sinusuri kung mas mababa ang kasalukuyang benta kaysa sa kasalukuyang min
                minSales = weeklySales[i]; // ina-update ang min sa bagong pinakamababang halaga
                worstDay = daysOfWeek[i]; // itinatala ang pangalan ng araw na iyon bilang pinakamahinang araw
            }
        }

        System.out.println("\n--- Bests and Worsts ---"); // para ma-print yung title
        System.out.println("Best day was " + bestDay + " with " + maxSales + " cups."); // ipinapakita ang araw na may pinakamadamimg sales at yung total sales
        System.out.println("Slowest day was " + worstDay + " with " + minSales + " cups."); // ipinapakita ang araw na may pinakamaliit ang sales at yung total sales
    }
}
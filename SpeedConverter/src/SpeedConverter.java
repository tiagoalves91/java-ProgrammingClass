public class SpeedConverter {

    public static long toMilesPerHour(double kiloPerHour) {
        if (kiloPerHour < 0) {
            return -1;
        }
        return Math.round(kiloPerHour / 1.609);
    }

    public static void printConversion(double kiloPerHour) {
        if (kiloPerHour < 0) {
            System.out.println("Error");
        } else {
            long milesPerHour = toMilesPerHour(kiloPerHour);
            System.out.println(kiloPerHour +
                    "km/h " + milesPerHour +
                    " mi/h");
        }
    }
}

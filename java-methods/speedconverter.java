public class speedconverter {
    public static void main(String[] args) {
        System.out.println(toMPH(100.5));
        System.out.println(toMPH(10.25));
        printConversion(100.5);
        printConversion(10.25);

    }

    public static long toMPH(double kph) {
        if (kph < 0) {
            return -1;
        } else {
            return Math.round(kph / 1.609);
        }
    }

    public static void printConversion(double kph) {
        if (kph < 0) {
            System.out.println("Invalid input");
        } else {
            long mph = Math.round(kph / 1.609);
            System.out.println(String.format("%f km/h = %d mi/h", kph, mph));
        }
    }
}
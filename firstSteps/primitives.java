public class primitives {
    public static void main(String[] args) {
        System.out.println("in primitives");

        int value = 10000;

        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + minValue);
        System.out.println("Integer Maximum Value = " + maxValue);
        System.out.println("Overflow MAX value = " + (maxValue + 1));
        System.out.println("Overflow MIN value = " + (minValue - 1));

    }
}
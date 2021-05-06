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

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min Value = " + minByteValue);
        System.out.println("Byte Max Value = " + maxByteValue);

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min Value = " + minShortValue);
        System.out.println("Short Max Value = " + maxShortValue);


    }
}

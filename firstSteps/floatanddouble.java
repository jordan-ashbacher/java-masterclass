public class floatanddouble {
    public static void main(String[] args) {
        System.out.println("in float and double file");

        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("Float min value = " + minFloat);
        System.out.println("Float max value = " + maxFloat);

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("Double min value = " + minDouble);
        System.out.println("Double max value = " + maxDouble);
        
        int intValue = 5 / 3;
        float floatValue = 5f / 3f;
        double doubleValue = 5d / 3d;
        
        System.out.println("int value = " + intValue);
        System.out.println("float value = " + floatValue);
        System.out.println("double value = " + doubleValue);

        double pound = 175;
        double weightInKilo = pound * 0.45359237;
        System.out.println("175lbs in kilograms = " + weightInKilo);

    }
}

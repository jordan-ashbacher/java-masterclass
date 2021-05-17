public class Car {
    private int doors;
    private String make;
    private String model;
    private String year;
    private String color;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("911")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }
}

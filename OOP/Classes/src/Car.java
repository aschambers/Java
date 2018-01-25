// template or blueprint for a car
public class Car {
    // generally always use private to create variables in classes, characteristics of the car
    // private means, don't allow a class outside of the Car Java Class to access them
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // make a method publicly accessible, setter method
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        // test if a model of type String is equal to another type, only allow model to be set if porsche or holden
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            // update model variable with parameter we are passed in the method
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    // getter method
    public String getModel() {
        return this.model;
    }
}

public class Main {
    public static void main(String[] args) {
        // to create a class, need to use the keyword new, which makes an object based on the Car template
        Car porsche = new Car();
        Car holden = new Car();
        // call setter method
        porsche.setModel("Carrera");
        // call getter method, needs to be called after setModel, otherwise it will be set to null
        System.out.println("Model is " + porsche.getModel());
        // 911 isn't a valid model, so it's set to Unknown
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());
    }
}

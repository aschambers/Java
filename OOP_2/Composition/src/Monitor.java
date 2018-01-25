public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    // composition, this is a component of a monitor, created a resolution class for this type of variable
    private Resolution nativeResultion;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResultion) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResultion = nativeResultion;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + y + " in color " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResultion() {
        return nativeResultion;
    }
}

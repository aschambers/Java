public class PC {
    // case is a reserved word, which is why we called it theCase
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
//        getTheCase().pressPowerButton();
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // Fancy graphics, can use getMonitor().drawPixelAt, or monitor.drawPixelAt, don't need getters
        // here, so just monitor.drawPixelAt is fine, only need if some form of validation.
        monitor.drawPixelAt(1200, 50, "yellow");
    }

    // not needed atm
//    // getters not accessible by main class anymore when private, but can access internally
//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }

}

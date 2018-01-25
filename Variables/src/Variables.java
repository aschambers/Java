public class Variables {
    // need this method to be public so that the method can be found by the JVM, and
    // needs to be static so that it can be called without having to create a new instance
    public static void main(String[] args) {
        int myFirstNumber = 5;
        System.out.println(myFirstNumber);

        // max width of 8
        byte myByteValue = -128;
        // max width of 16
        short myShortValue = -32768;
        // max width of 64
        long myLongValue = 100L;
        System.out.println(myByteValue);
        System.out.println(myShortValue);
        System.out.println(myLongValue);


        // float and double give you an exact value, where as int doesn't when dividing
        float myFloatValue = 5f;
        System.out.println(myFloatValue);
        // assumes it's a double if decimal number
        double myDoubleValue = 5d;
        System.out.println(myDoubleValue);
        // doubles are more useful than floats in general

        // width of 16 (2 bytes)
        char myChar = '\u00A9';
        System.out.println("Unicode output was: " + myChar);
        boolean myBoolean = true;
        System.out.println(myBoolean);
        char registeredSymbol = '\u00AE';
        System.out.println("Registered symbol = " + registeredSymbol);

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);
    }
}

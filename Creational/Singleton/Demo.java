public class Demo {
    public static void main(String[] args) {

        SingletonLogger logger = SingletonLogger.getInstance();
        logger.log("Starting Demo","INFO");

        Utility.doSomething();
        Utility.getLength("abcd");

    }
}

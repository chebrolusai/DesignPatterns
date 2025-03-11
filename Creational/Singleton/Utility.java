public class Utility {
    public static void doSomething() {
        SingletonLogger logger = SingletonLogger.getInstance();
        logger.log("Starting to add numbers from one to 10","INFO");
        int result = 0;
        for(int i=0; i<=10; i++) {
            result += i;
        }
        logger.log("Result: "+result,"OUTPUT");
    }

    public static void getLength(String s) {
        SingletonLogger logger = SingletonLogger.getInstance();
        logger.log("Getting length for string" + s,"INFO");
        logger.log("Length: "+s.length(),"OUTPUT");
    }
}

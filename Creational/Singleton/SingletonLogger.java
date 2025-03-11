import java.util.Date;

public class SingletonLogger {
    private static SingletonLogger logger;

    private SingletonLogger(){
        System.out.println("Creating a new Object..");
    };

    public static SingletonLogger getInstance() {
        if(logger == null) {
            logger = new SingletonLogger();
        }
        return logger;
    }

    public void log(String message, String type) {
        Date date = new Date();
        System.out.println(date + ", " + type.toUpperCase() + ": " + message);
    }

}

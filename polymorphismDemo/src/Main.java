public class Main {
    public static void main(String[] args) {
        /*EmailLogger emailLogger =  new EmailLogger();
        emailLogger.Log("Log for Email");*/

        /*BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger(), new BaseLogger()};
        for (BaseLogger logger:loggers){
            logger.Log("Log Message");
        }*/

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}
package enset.ma.aspect;

public class LoggingAspect {

    public void logStart(String method) {

        System.out.println("Start: " + method);
    }

    public void logEnd(String method) {

        System.out.println("End: " + method);
    }

}

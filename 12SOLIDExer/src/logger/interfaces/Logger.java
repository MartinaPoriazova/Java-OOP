package logger.interfaces;

public interface Logger {

    // INFO,
    //    WARNING,
    //    ERROR,
    //    CRITICAL,
    //    FATAL;

    void logInfo(String time, String message);

    void logWarning(String time, String message);

    void logError(String time, String message);

    void logCritical(String time, String message);

    void logFatal(String time, String message);

}

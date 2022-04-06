package logger.interfaces;

import logger.emuns.ReportLevel;

public interface Appender {

    void append(String time, String message, ReportLevel reportLevel);

}

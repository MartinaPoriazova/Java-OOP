package logger.interfaces;

import logger.emuns.ReportLevel;

public interface Layout {

    String format(String time, String message, ReportLevel reportLevel);

}

package logger.impl.appenders;

import logger.emuns.ReportLevel;
import logger.interfaces.File;
import logger.interfaces.Layout;

public class FileAppender extends BaseAppender {

    private File file;

    public FileAppender(Layout layout) {
        super(layout);
        this.file = new LogFile();
    }

    public FileAppender(Layout layout, String fileName) {
        this(layout);
        this.file = new LogFile(fileName);
    }


    @Override
    public void append(String time, String message, ReportLevel reportLevel) {
        String output = this.layout.format(time, message, reportLevel);// append to file
        file.append(output);
    }

    public void setFile(File file) {
        this.file = file;
    }
}

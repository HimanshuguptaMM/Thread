
import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Handlers {
    private static Logger logger = Logger.getLogger("SimpleFormatterExample");

    private static void logMessages() {
        logger.info("Line One");
        logger.info("Line Two");
    }

    public static void main(String[] args) {
        logger.setUseParentHandlers(false);
        Handler conHdlr = new ConsoleHandler();
        conHdlr.setFormatter(new Formatter() {
            public String format(LogRecord record) {
                return record.getLevel() + "  :  " + record.getSourceClassName() + " -:- "
                        + record.getSourceMethodName() + " -:- " + record.getMessage() + "\n";
            }
        });
        logger.addHandler(conHdlr);
        logMessages();
    }
}
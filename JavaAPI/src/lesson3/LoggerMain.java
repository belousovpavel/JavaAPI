package lesson3;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerMain {

    static Logger logger = Logger.getLogger(LoggerMain.class.getName());

    public static void main(String[] args) {
        // log4j, log4j2
        // simple logging facade for java библиотеки логирования



        // FATAL, ERROR, WARN, INFO, DEBUG, TRACE
        for (Handler handler : logger.getHandlers()) {
            handler.setLevel(Level.FINE);
        }

        //stderr
        logger.setLevel(Level.FINE);
        logger.log(Level.INFO, "error");
    }
}

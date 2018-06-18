package helpers;

import java.io.IOException;
import java.util.logging.*;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class Log {

  private static final Logger Log = Logger.getLogger(Log.class.getName());

  public Log() throws IOException {
    Handler fh = new FileHandler("/tmp/wombat.log");
    Log.addHandler(fh);
    SimpleFormatter formatter = new SimpleFormatter();
    fh.setFormatter(formatter);

  }

  public static void startTestCase(String sTestCaseName) {
    Log.info("Started Test case");
  }

  public static void endTestCase(String sTestCaseName) {
    Log.info("Ended Test Case");
  }

  public static void info(String message) {
    Log.info(message);
  }

}

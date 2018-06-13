package helpers;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author sergey
 */
public class MyDateTime {

  LocalDate date = LocalDate.now();
  
  LocalDateTime dateTime = LocalDateTime.now();

  String formatDateUtfMysql ="yyyy-mm-dd";
  String formatDateTimeUtfMysql ="yyyy-mm-dd kk:mm:ss";
  
  String formatDatej15 ="dd.mm.yyyy";
  String formatDateTimej15 ="dd.mm.yyyy kk:mm:ss";
 

    private String DateUtfMysql;

  /**
   * Get the value of YYYY-mm-dd 
   *
   * @return the value of 2018-02-05
   */
  public String getDateUtfMysql() {
    return dateTime.format(DateTimeFormatter.ofPattern(formatDateUtfMysql));
  }

  /**
   * Get the value of YYYY-mm-dd H:m:s
   *
   * @return the value of 2018-02-05 16:16:48
   */
  public String getDateTimeUtfMysql() {
    return dateTime.format(DateTimeFormatter.ofPattern(formatDateTimeUtfMysql));
  }

    private String DateTimej15;

  /**
   * Get the value of dd.mm.yyyy
   *
   * @return the value of dd.mm.yyyy
   */
  public String getDateTimej15() {
    return DateTimej15;
  }

    private String Datej15;

  /**
   * Get the value of dd.mm.yyyy hh:mm:ss
   *
   * @return the value of dd.mm.yyyy hh:mm:ss
   */
  public String getDatej15() {
    return Datej15;
  }


  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.ini4j.Ini;

/**
 *
 * @author sergej
 */
public class DefaultParams {
  
  private String section = "default";
  
  public  String displeyRequest;
  
  public  String logRequest;

  public String getSection() {
    return section;
  }

  public void setSection(String section) {
    this.section = section;
  }

 
  public static String DS;
 
  public DefaultParams() {
    DS = System.getProperty("file.separator").toLowerCase();
   this.displeyRequest = loadData("config", "displey_request");
   this.logRequest = loadData("config", "log_request");
  
  }

  public String loadData(String key) {
    try {
      File file = new File("settings.ini");
      Ini ini = new Ini(file);
      
      System.out.println("-loadData-"+ini.get(this.section, key));
      return ini.get(section, key);
    } catch (IOException ex) {
      Logger.getLogger(DefaultParams.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
  }

  public static String loadData(String section, String key) {
    try {
      File file = new File("settings.ini");
      Ini ini = new Ini(file);
      return ini.get(section, key);
    } catch (IOException ex) {
      Logger.getLogger(DefaultParams.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
  }


}

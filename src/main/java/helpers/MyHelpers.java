/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author sergey
 */
public class MyHelpers {

  /**
   * Check entry of substring
   *
   * @param str
   * @param str_check
   * @return boolean
   */
  public static boolean checkTeg(String str, String str_check) {
    int index;
    index = str.indexOf(str_check);
    return index == -1;
  }

  public static boolean checkArray(String str, String str_check) {
    int index;
    index = str.indexOf(str_check);
    return index == -1;
  }

  public static boolean checkObject(String str, String str_check) {
    int index;
    index = str.indexOf(str_check);
    return index == -1;
  }


  }

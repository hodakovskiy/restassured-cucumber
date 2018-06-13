/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

/**
 *
 * @author sergey
 */
public class MainApp {

    public  String OsName = null;

    public  String OsVersion = null;

    public  String OsArchitecture = "test";
    
     public static void main(String[] args) { 
        System.out.println("Wrong"); 
    } 

    public MainApp() {
          System.out.println("Wrong");  
        if (isWindows()) {
            System.out.println("This is Windows");
            System.out.println("It's version is: " + getOSVerion());

            OsName = "Windows";

        } else if (isMac()) {
            System.out.println("This is Macintosh");
            System.out.println("It's version is: " + getOSVerion());
            OsName = "Mac";

        } else if (isUnix()) {
            System.out.println("This is Unix or Linux OS");
            System.out.println("It's version is: " + getOSVerion());
            OsName = "Linux";

        } else {
            System.out.println("This is unknown OS");
        }

        this.OsVersion = getOSVerion();
        OsArchitecture =  System.getProperty("os.arch").toLowerCase();
        

        System.out.println("Operating System Architecture: " + System.getProperty("os.arch").toLowerCase());
        System.out.println("Version: " + getOSVerion());

    }

    public static boolean isWindows() {

        String os = System.getProperty("os.name").toLowerCase();
        //windows
        return (os.indexOf("win") >= 0);

    }

    public static boolean isMac() {

        String os = System.getProperty("os.name").toLowerCase();
        //Mac
        return (os.indexOf("mac") >= 0);

    }

    public static boolean isUnix() {

        String os = System.getProperty("os.name").toLowerCase();
        //linux or unix
        return (os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0);

    }

    public static String getOSVerion() {
        String os = System.getProperty("os.version");
        return os;
    }


}

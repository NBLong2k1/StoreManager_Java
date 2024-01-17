package Connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBContext {

    /*USE BELOW METHOD FOR YOUR DATABASE CONNECTION FOR BOTH SINGLE AND MULTILPE SQL SERVER INSTANCE(s)*/
 /*DO NOT EDIT THE BELOW METHOD, YOU MUST USE ONLY THIS ONE FOR YOUR DATABASE CONNECTION*/
    public Connection getConnection() throws Exception {
        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
    }

    /*Insert your other code right after this comment*/
 /*Change/update information of your database connection, DO NOT change name of instance variables in this class*/
//    /private final String serverName = "DESKTOP-M158JNF";
    private final String serverName = "localhost";
    private final String dbName = "Bakery_Management";
    private final String portNumber = "1433";
    private final String userID = "sa";
    private final String password = "123456";

    public static void main(String[] args) {
        DBContext db = new DBContext();
        try {
            if (db.getConnection() != null) {
                System.out.println("connect thanh cong");
            } else {
                System.out.println("not ok");
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

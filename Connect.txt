package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
public class Connect {
    public Connection getConnection(){
        Connection conn = null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLTLNV","sa","123456Ab");
            if(conn != null){
                System.out.println("Ket noi thanh cong");
            }
        }catch(Exception ex){
          System.out.print(ex.toString());
        }
        return conn;
    }
}

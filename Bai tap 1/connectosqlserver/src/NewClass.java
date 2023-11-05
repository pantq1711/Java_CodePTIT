/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.sql.*;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NewClass {

    public static void main(String[] args) {
        String server = "Anphan1711\\MSSQLSERVER01";
        String user = "sa";
        String pass = "123456";
        String db = "Trading2022";
        var port = 1433;
        String url = "jdbc:sqlserver://" + server + ":" + port + "\\" + 
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(user);
        ds.setPassword(pass);
        ds.setDatabaseName(db);
        ds.setPortNumber(port);
        try (Connection conn = ds.getConnection()) {
            System.out.println("ok");
            System.out.println(conn.getCatalog());
        } catch (SQLServerException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {

    private static Connection conn;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String dbUser = "sa";
                String dbPass = "123456";
                String dbUrl = "jdbc:sqlserver://localhost:1433;"
                        + "databaseName=DuAn1_QuanLyThuVien;encrypt=true;trustServerCertificate=true;";

                conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);

                System.out.println("Ket noi thanh cong!");
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return JdbcUtil.conn;
    }
}

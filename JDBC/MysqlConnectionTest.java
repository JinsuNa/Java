package mysql;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConnectionTest {
    String dbDriver = "com.mysql.cj.jdbc.Driver";
    String dburl = "jdbc:mysql://localhost:3306/idolgroup";
    String dbUser = "root";
    String dbPassword = "1111";

    Connection dbConn = null;

    public void dbConnection() {
        Connection connection = null;
        try {
            Class.forName(dbDriver);
            connection = DriverManager.getConnection(dburl, dbUser, dbPassword);
            System.out.println("DB 연결 성공");
        } catch (Exception e) {
            System.out.println("DB 연결 실패");
            e.printStackTrace();
        }
    }
}
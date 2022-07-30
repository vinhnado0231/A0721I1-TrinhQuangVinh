package repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseRepository {
    public static String urlJDBC = "jdbc:mysql://localhost:3306/case_study?useSSL";
    public static String usernameJDBC = "root";
    public static String passwordJDBC = "123456";
    private Connection connection;

    public DataBaseRepository() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection=DriverManager.getConnection(urlJDBC,usernameJDBC,passwordJDBC);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getAConnect() {
        return this.connection;
    }
}

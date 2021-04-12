package Utils;

import java.sql.*;

public class DBHandler {
    private static Connection connection;

    public static boolean openConnection() {
        try {
            connection = DriverManager.getConnection(Config.DBUrl, Config.DBUser, Config.DBPass);
            return true;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }
    }

    public static boolean closeConnection() {
        try {
            connection.close();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }
    }

    public static ResultSet execQuery(String query) {
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return resultSet;
    }

}



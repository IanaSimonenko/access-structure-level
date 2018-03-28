package DB;

import models.Accounting;

import java.sql.*;

public class JDBS {

    public static void main(String[] args) {

        Connection connection = null;

        String URL = "jdbc:postgresql://127.0.0.1:5432/room_structure";
        String NAME = "postgres";
        String PASSWORD = "2017";

        try {

            Class.forName("org.postgresql.Driver");
            System.out.println("Connected driver:)");

            connection = DriverManager.getConnection(URL, NAME, PASSWORD);
            System.out.println("Connected:)");

            Statement statement = null;
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(
                    "SELECT * FROM department_gen"
            );

            System.out.println("Output our statement!!!");
            while (resultSet.next()) {
                System.out.println(resultSet.getRow() + " " + resultSet.getInt("id") +
                resultSet.getString("name") + resultSet.getString("department") +
                        resultSet.getString("level"));
            }

            statement.executeUpdate(
                    "INSERT INTO department_gen VALUES('Oleg', 'IT', 'admin', '123456')"
            );

            statement.executeUpdate(
                    "UPDATE department_gen SET name = 'head_admin' where id = 1"
            );

            CallableStatement callableStatement = null;
            callableStatement = connection.prepareCall(
                    " { call Accounting.accessLevel(?) } "
            );


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}

package DB;

import models.Accounting;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class AccountingImplementsDAO implements AccountingStructureDAO {

    private DBConnection dbConnection;

    public AccountingImplementsDAO(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    @Override
    public void insert(Accounting object) {
        String query = "INSERT INTO department_gen (name, department) VALUES ("
                + object.getNameOfEmployee() + ", "
                + object.getOfDepartment() + ", "
                + ")";

        Connection connection = dbConnection.getConnection();
        Statement statement = null;

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.getMessage();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    @Override
    public List getAll() {
        return null;
    }

    @Override
    public void update(Accounting object) {

    }

    @Override
    public void delete(Accounting object) {

    }
}

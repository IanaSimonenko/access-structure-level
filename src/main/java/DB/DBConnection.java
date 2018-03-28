package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Logger;

public class DBConnection {

    //Logging all errors
    private final Logger LOGGER = Logger.getLogger(DBConnection.class.getName());

    private String url;
    private String username;
    private String password;
    private String driverClassName;
    private String charset;

    public DBConnection(String url, String username, String password, String driverClassName, String charset) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.driverClassName = driverClassName;
        this.charset = charset;
    }

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(driverClassName);

            //параметры соединения
            Properties connInfo = new Properties();
            connInfo.put("postgres", username);
            connInfo.put("2017", password);
            connInfo.put("useUnicode", "true");
            connInfo.put("characterEncoding", charset);

            try {
                connection = DriverManager.getConnection(url, connInfo);
            } catch (SQLException e) {
                LOGGER.info("SQL Error : " + e.getMessage());
            }
        } catch (ClassNotFoundException e) {
            LOGGER.info("Driver not found...");
        }
        return connection;
    }

}

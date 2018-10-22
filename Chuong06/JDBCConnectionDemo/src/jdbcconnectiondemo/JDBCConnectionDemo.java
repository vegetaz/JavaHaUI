package jdbcconnectiondemo;

/**
 *
 * @author veget
 */
public class JDBCConnectionDemo {

    public static void main(String[] args) {
        GetConnection connection = new GetConnection();
        connection.openConnection();
        connection.closeConnection();
    }

}

package jdbcconnectiondemo;

/**
 *
 * @author veget
 */
public class JDBCConnectionDemo {

    public static void main(String[] args) {
        GetConnection connection = new GetConnection();
        if (connection != null) {
            System.out.println("Connected!");
        } else {
            System.out.println("Not Connect!");
        }
        connection.closeConnection();
    }

}

package connection;

public class App {

    public static void main(String[] args) {

        ConnectionFactory connectionFactory = new ConnectionFactory();

        connectionFactory.openConnection();
        connectionFactory.executeSQL();
        connectionFactory.closeConnection();
    }
}

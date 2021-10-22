package connection;

public class ConnectionFactory {

    public void openConnection(){
        System.out.println("Abrindo conexão com o banco de dados...");
    }

    public void executeSQL(String sql){
        System.out.println("Executando SQL no BD");
    }

    public void closeConnection(long timeout){
        System.out.println("Fechando a conexão com o BD por timed out de " +timeout);
    }
}

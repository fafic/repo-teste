package connection;

public class ConnectionFactory {

    public void openConnection(){
        System.out.println("Abrindo conexão com o banco de dados...");
    }

    public void executeSQL(String sql){
        System.out.println("Execuntando SQL no BD");
    }

    public void closeConnection(){
        System.out.println("Fechando a conexão com o BD...");
    }
}

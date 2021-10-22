package connection;

public class GenericConveter {

    public String conveter(String json){
        return json.toUpperCase();
    }

    public String conveterToXml(String xml){
        return xml.toLowerCase();
    }

    public void teste(){
        System.out.println("teste");
    }
}

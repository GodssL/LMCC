import java.net.URL;  

public class Eye {
    public Eye(String seed){
        try{
            URL url = new URL(seed);
            String str = url.openStream().toString();
            System.out.println(str);
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
}

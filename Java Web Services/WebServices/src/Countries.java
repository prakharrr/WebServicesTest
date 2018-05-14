import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class Countries {

    public static void main(String[] args) {

        // 1. Create a client
        Client client = ClientBuilder.newClient();


        // 2. Set a target to client
        WebTarget webTarget = client.target("https://restcountries.eu/rest/v2/capital/delhi");

        // 3. Get Response
        System.out.println(
                webTarget.request(MediaType.APPLICATION_JSON).get(String.class)
        );


    }
}

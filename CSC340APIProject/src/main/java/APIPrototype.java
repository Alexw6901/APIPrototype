
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Alex Wesley
 */
public class APIPrototype {
    public static void main(String[] args){
        String url = "https://official-joke-api.appspot.com/random_joke";
        RestTemplate restTemplate = new RestTemplate();
        Object jSonQuote = restTemplate.getForObject(url, Object.class);

        //Print the whole response to console.
        String funny = restTemplate.getForObject(url, String.class);
        //Parse out the most important info from the response.
        JSONObject jo = new JSONObject(funny);
        //System.out.println(jo.toString());
        String punchline = jo.getString("punchline");
        String setup = jo.getString("setup");
        System.out.println("");
        System.out.println("");
        System.out.println("Joke of the day");
        System.out.println("---------------");
        System.out.println(setup);
        System.out.println(punchline);
        
        

}
    
}

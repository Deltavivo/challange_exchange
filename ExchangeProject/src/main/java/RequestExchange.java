import com.google.gson.Gson;
import model.Exchange;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequestExchange {
    public Double retornaParidade(String moeda1, String moeda2) throws IOException, InterruptedException {

        var endereco = "https://v6.exchangerate-api.com/v6/ceb7af825159c6bb11762811/pair/" + moeda1 +"/" + moeda2;


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        var moeda = gson.fromJson(response.body(), Exchange.class);
        return moeda.conversion_rate();
    }
}

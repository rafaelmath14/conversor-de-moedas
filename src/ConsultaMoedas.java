import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoedas {
    public RespostaApi consulta(String moeda) {

        String endereco = "https://v6.exchangerate-api.com/v6/4a8f1f49229ae8528d5b5aee/latest/" + moeda;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();


        try{
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), RespostaApi.class);
        }catch (RuntimeException | IOException | InterruptedException e ){
            throw new RuntimeException("Não foi possível verificar as informações com o servidor.");
        }
    }
}

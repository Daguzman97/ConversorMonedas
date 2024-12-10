package modelos;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApi {

    public Resultado buscarMoneda(String moneda1, String moneda2, double cant ){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/4a77c699f505fc53a16886c3/pair/"+moneda1+"/"+moneda2+"/"+cant);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),Resultado.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontre esa Moneda");
        }

    }



}

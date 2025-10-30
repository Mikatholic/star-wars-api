import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaPelicula {
    URI direccion = URI.create("https://swapi.dev/api/films/" + numeroDePelicula);

    Pelicula buscaPelicula(int numeroDePelicula){
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri()
                .build();

        HttpResponse<String> response = client
                .send(request, HttpRequest.BodyHandlers.ofString());

        return new Gson().fromJson(response.body(), Pelicula.class);
    }
}

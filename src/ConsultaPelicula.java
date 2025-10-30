import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class ConsultaPelicula {
    URI direccion = URI.create("https://swapi.dev/api/films/" + numeroDePelicula);

    Pelicula buscaPelicula(int numeroDePelicula){
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri()
                .build();
    }
}

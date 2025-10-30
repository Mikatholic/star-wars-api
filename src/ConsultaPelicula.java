import java.net.http.HttpClient;

public class ConsultaPelicula {

    Pelicula buscaPelicula(int numeroDePelicula){
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://foo.com/"))
                .build();
    }
}

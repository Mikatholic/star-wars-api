public class Main {
    public static void main(String[] args) {
        ConsultaPelicula consulta = new ConsultaPelicula();
        Pelicula pelicula = consulta.buscaPelicula(9);
        System.out.println(pelicula);
    }
}

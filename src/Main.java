import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaPelicula consulta = new ConsultaPelicula();
        System.out.println("Escriba el número de la película que quiere consultar");
        try{
            var numeroDePelicula = Integer.valueOf(lectura.nextLine());
            Pelicula pelicula = consulta.buscaPelicula(numeroDePelicula);
            System.out.println(pelicula);
            GeneradorDeArchivo generador = new GeneradorDeArchivo();
        } catch (NumberFormatException e) {
            System.out.println("Numero no encontrado " + e.getMessage());
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicación");
        }
    }
}

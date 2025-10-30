import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaPelicula consulta = new ConsultaPelicula();
        try{
            Pelicula pelicula = consulta.buscaPelicula(9);
            System.out.println(pelicula);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicación");
        }
    }
}

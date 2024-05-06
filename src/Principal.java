import Modelo.Pelicula;
import Modelo.Serie;
import java.util.Scanner;

public class Principal {
    public void muestraElMenu(){

        int opcion = 0;
        String nombre="";
        int fechaDeLanzamiento;
        int duracionEnMinutos, temporadas,capitulos;
        int totalMinutos=0;

        Scanner teclado = new Scanner(System.in);
        while(opcion != 9) {

            String menu = """
                       ** Bienvenido(a) a Screenmatch**
                     1) Registra nueva pelicula.  
                     2) Registrar nueva serie.
                     3) Calculadora de tiempo.
                     9) Salir.     
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:

                    System.out.println("Ingrese el nombre de la pelicula: ");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la pelicula: ");
                    fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duración en minutos de la pelicula: ");
                    duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();

                    Pelicula peliculaUsuario = new Pelicula();
                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setTiempoDeDuracionEnMinutos(fechaDeLanzamiento);
                    peliculaUsuario.setFechaDeLanzamiento(duracionEnMinutos);
                    peliculaUsuario.setPlanBasicoIncluido(true);
                    peliculaUsuario.muestraFichaTecnica();
                    break;

                case 2:
                    System.out.println("Ingrese el nombre de la serie: ");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la serie: ");
                    fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese el numero de temporadas: ");
                    temporadas = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese el numero de capitulos: ");
                    capitulos = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duración en minutos  de cada capitulo de la serie: ");
                    duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();

                    Serie serieUsuario = new Serie();

                    serieUsuario.setNombre(nombre);
                    serieUsuario.setTemporadas(temporadas);
                    serieUsuario.setEpisodiosPorTemporadas(capitulos);
                    serieUsuario.setDuracionEnMinutosPorEpisodios(duracionEnMinutos);
                    serieUsuario.setPlanBasicoIncluido(true);
                    serieUsuario.muestraFichaTecnica();

                   totalMinutos= capitulos*temporadas*duracionEnMinutos;


                    break;
                case 3:
                    float dias = totalMinutos / 1440;
                    float minutosRestantes = totalMinutos % 1440;
                    float horas = minutosRestantes / 60;
                    if(totalMinutos !=0 ){
                        System.out.println("El tiempo que tomara ver la serie es: "+ dias+" dias "+horas+" horas" );

                    }
                    else
                        System.out.println("Necesitas registrar una serie antes.");
                     break;

                case 9:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("opcion no valida");

            }


        }
    }

}

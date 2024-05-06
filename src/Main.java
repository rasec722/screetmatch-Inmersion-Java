import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int fechaPelicula = 1999;
        int fechaReciente = 2023;
        double evaluacion =4.5;
        double mediaEvaluacion = (4.5+4.8+3)/3;
        double mediaEvaluacionUsuario = 0;
        boolean incluyePlanBasico = true;
        String nombre = "Pelicula n";
        String sinopsis = "";
        Scanner sc = new Scanner(System.in);


        System.out.println("Pelicula: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaPelicula);
        System.out.println("Valoracion de la pelicula: " + evaluacion);
        System.out.println("Permiso de acceso a la pelicula:"+ incluyePlanBasico);
        System.out.println("Media de evaluacion: " + mediaEvaluacion);

        if(fechaPelicula >= fechaReciente){
            System.out.println("Pelicula popular");
        }else{
            System.out.println("Pelicula retro que vale la pena ver");
        }
        /*for(int i=0; i <3; i++){
            System.out.println("Ingresa la nota que le das a la pelicula N: ");
            double notaUsuario = sc.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario+notaUsuario;
        }*/

        //Misma instruccion de arriba, utilizando ciclo while.

        int i=1;
        while (i <= 3){
            System.out.println("Ingresa la nota que le das a la pelicula N: ");
            double notaUsuario = sc.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario+notaUsuario;
            i++;
        }
        System.out.println("La media de la pelicula por el usuario:"+ mediaEvaluacionUsuario/3);


    }





}
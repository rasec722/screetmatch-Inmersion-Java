package Modelo;
import java.util.Scanner;


public class Titulo {
    Scanner teclado = new Scanner(System.in);
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public double getEvaluacion() {
        return evaluacion;
    }


    public boolean getPlanBasicoIncluido() {
        return PlanBasicoIncluido;
    }

    public void setPlanBasicoIncluido(boolean planBasicoIncluido) {
        PlanBasicoIncluido = planBasicoIncluido;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getTiempoDeDuracionEnMinutos() {
        return tiempoDeDuracionEnMinutos;
    }

    public void setTiempoDeDuracionEnMinutos(int tiempoDeDuracionEnMinutos) {
        this.tiempoDeDuracionEnMinutos = tiempoDeDuracionEnMinutos;
    }

    private int fechaDeLanzamiento;
    private double evaluacion;
    private boolean PlanBasicoIncluido;
    private String sinopsis;
    private int tiempoDeDuracionEnMinutos;

    public void muestraFichaTecnica(){
        System.out.println("***Ficha técnica****");
        System.out.println("Nombre del titulo: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Duracion: "+getTiempoDeDuracionEnMinutos()  + " minutos");
        System.out.println("Esta incluido en el plan básico: " + PlanBasicoIncluido);
       // System.out.println("Sinopsis de la pelicula: " + sinopsis);
    }
  //Intento fallido de simplificar el codigo
   /* public void ingresandoDatos(){
        System.out.println("Ingrese el nombre de la pelicula: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el año de lanzamiento de la pelicula: ");
        int fechaDeLanzamiento = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese la duración en minutos de la pelicula: ");
        int duracionEnMinutos = teclado.nextInt();
        teclado.nextLine();

    }*/

}

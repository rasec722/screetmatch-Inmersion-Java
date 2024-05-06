package Modelo;

public class Serie extends Titulo{
    private int temporadas;
    private int episodiosPorTemporadas;
    private int duracionEnMinutosPorEpisodios;


    @Override
    public int getTiempoDeDuracionEnMinutos() {
        return duracionEnMinutosPorEpisodios*episodiosPorTemporadas*temporadas;
    }


    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporadas() {
        return episodiosPorTemporadas;
    }

    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }

    public int getDuracionEnMinutosPorEpisodios() {
        return duracionEnMinutosPorEpisodios;
    }

    public void setDuracionEnMinutosPorEpisodios(int duracionEnMinutosPorEpisodios) {
        this.duracionEnMinutosPorEpisodios = duracionEnMinutosPorEpisodios;
    }
}

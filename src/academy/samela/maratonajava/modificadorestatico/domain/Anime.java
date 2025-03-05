package academy.samela.maratonajava.modificadorestatico.domain;

public class Anime {
    private String name;
    private static int[] episodes;

// o bloco de inicializacao estático só irá inicializar uma vez
    static {
        System.out.println("dentro do bloco de inicializacao");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }
// mostra o array
    public Anime() {
        for (int episodio: Anime.episodes){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }
    public int[] getEpisodios() {
        return episodes;
    }
}


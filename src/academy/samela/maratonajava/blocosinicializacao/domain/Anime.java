package academy.samela.maratonajava.blocosinicializacao.domain;

public class Anime {
    private String name;
    private int[] episodes;
/*
Bloco de inicialização pode ser colocado em qualquer lugar, mas geralmente é usado no começo.
chamado de bloco de inicialização de instância por ser executado todas as vezes que o objeto é criado.
É executado antes do construtor.
 */
    {
        System.out.println("dentro do bloco de inicialização");
        episodes = new int[50];
        for (int i = 0; i < episodes.length; i++) episodes[i] = i + 1;
    }

    // constructor só com o name
    public Anime(String name) {
        this.name = name;
    }

    // construtor para mostrar o array do bloco de inicialização
    public Anime() {
        for (int episodio: this.episodes){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return name;
    }
    public int[] getEpisodes() {
        return episodes;
    }
}


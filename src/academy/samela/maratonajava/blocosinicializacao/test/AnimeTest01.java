package academy.samela.maratonajava.blocosinicializacao.test;

import academy.samela.maratonajava.blocosinicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        Anime animeName = new Anime("Sailor Moon");
        System.out.println(animeName.getNome());
    }
}

package academy.samela.maratonajava.sobrecargametodos.test;

import academy.samela.maratonajava.sobrecargametodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Sakura Card Captor","TV",70,"Romance");
        anime.print();
    }
}

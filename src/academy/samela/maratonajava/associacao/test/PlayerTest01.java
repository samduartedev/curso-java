package academy.samela.maratonajava.associacao.test;

import academy.samela.maratonajava.associacao.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player player1 = new Player("Messi");
        Player player2 = new Player("Kaka");
        Player player3 = new Player("Mbappe");
        Player[] players = {player1,player2,player3};

        for (Player player : players) {
            player.print();
        }


    }
}

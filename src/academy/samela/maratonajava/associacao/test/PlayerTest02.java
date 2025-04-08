package academy.samela.maratonajava.associacao.test;

import academy.samela.maratonajava.associacao.domain.Player;
import academy.samela.maratonajava.associacao.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player1 = new Player("Pelé");
        Player player2 = new Player("Mbappe");
        Player player3 = new Player("Messi");
        Team team = new Team("Brasil");

        //associacao unidirecional um pra muitos

        player1.setTeam(team);
        player2.setTeam(team);
        player3.setTeam(team);
        player1.print();
        player2.print();
        player3.print();
    }
}

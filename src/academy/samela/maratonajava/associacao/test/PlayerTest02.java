package academy.samela.maratonajava.associacao.test;

import academy.samela.maratonajava.associacao.domain.Player;
import academy.samela.maratonajava.associacao.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player1 = new Player("Pelé");
        Team team = new Team("Brasil");

        //associacao unidirecional um pra muitos

        player1.setTeam(team);
        player1.print();
    }
}

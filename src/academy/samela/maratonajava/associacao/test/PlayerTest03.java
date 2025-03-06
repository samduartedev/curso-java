package academy.samela.maratonajava.associacao.test;

import academy.samela.maratonajava.associacao.domain.Player;
import academy.samela.maratonajava.associacao.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {

        //associacao bidirecional
        Player player = new Player("Pele");
        Player player2 = new Player("Kaka");
        Team team = new Team("Brasil");
        Player[] players = {player,player2};

        player.setTeam(team);
        player2.setTeam(team);

        team.setPlayers(players);

        System.out.println("---- Jogador ---- ");

        player.print();
        player2.print();

        System.out.println("---- Time ----");

        team.print();
    }
}

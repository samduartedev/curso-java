package academy.samela.maratonajava.associacao.test;

import academy.samela.maratonajava.associacao.domain.Player;
import academy.samela.maratonajava.associacao.domain.Team;

import java.util.Scanner;

public class KeyboardReadingTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome de um jogador: ");
        Player player = new Player(scanner.nextLine());
        Player[] players = {player};
        System.out.println("Digite o nome do time: ");
        Team team = new Team(scanner.nextLine());

        player.setTeam(team);
        team.setPlayers(players);

        System.out.println("O nome do jogador é " + player.getName());
        System.out.println("Ele joga no " + team.getName());




    }
}

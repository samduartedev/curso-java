package academy.samela.maratonajava.associacao.domain;

public class Team {
    private String name;
    private Player[] players;


    public Team(String name) {
        this.name = name;
    }

    public Team(Player[] players) {
        this.players = players;
    }

    public void print(){
        System.out.println(this.name);
        if (players == null) return;
        for (Player player : players) {
            System.out.println(player.getName());
        }

    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

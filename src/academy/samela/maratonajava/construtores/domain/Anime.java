package academy.samela.maratonajava.construtores.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String gender;
    private String studio;

    // construtor é iniciado antes de qualquer metodo, pode ser usado para obrigar um parametro
    public Anime(String name, String type, int episodes, String gender){
        this(); //chama o constructor vazio
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.gender = gender;
    }
/*
é possível utilizar sobrecarga de construtores. Para isso, utiliza-se o this()
 */
    public Anime(String name, String type, int episodes, String gender, String studio){
        this(name,type,episodes,gender); //chama o constructor com os parametros
        this.studio = studio;
    }

    // constructor vazio
    public Anime(){

    }

    public void Print(){
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.gender);
        System.out.println(this.studio);
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type = type;
    }
    public int getEpisodes(){
        return this.episodes;
    }
    public void setEpisodes(int episodes){
        this.episodes = episodes;
    }
}

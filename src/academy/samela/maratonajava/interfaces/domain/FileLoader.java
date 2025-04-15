package academy.samela.maratonajava.interfaces.domain;

public class FileLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }
    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no arquivo");
    }
}

package academy.samela.maratonajava.enumeracao.domain;

public enum ClientType {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");


    private String relatoryName;
    private int value; //não pode vir antes das constantes
    ClientType(int value, String relatoryName) {
        this.value = value;
        this.relatoryName = relatoryName;
    }

    public static ClientType clientTypeByRelatoryName(String relatoryName){
        for (ClientType clientType : values()) {
            if (clientType.getRelatoryName().equals(relatoryName)){
                return clientType;
            }
        }
        return null;
    }

    public String getRelatoryName() {
        return relatoryName;
    }

    public int getValue() {
        return value;
    }


}

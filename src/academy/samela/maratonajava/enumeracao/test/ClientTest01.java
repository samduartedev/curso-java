package academy.samela.maratonajava.enumeracao.test;

import academy.samela.maratonajava.enumeracao.domain.Client;
import academy.samela.maratonajava.enumeracao.domain.ClientType;
import academy.samela.maratonajava.enumeracao.domain.PaymentType;

public class ClientTest01 {
    public static void main(String[] args) {
        Client client = new Client("Jorge", ClientType.PESSOA_FISICA, PaymentType.DEBIT);
        Client client2 = new Client("Coca-Cola", ClientType.PESSOA_JURIDICA, PaymentType.CREDIT);
        System.out.println(client);
        System.out.println(client2);
        System.out.println(PaymentType.DEBIT.calculateDiscount(100));
        System.out.println(PaymentType.CREDIT.calculateDiscount(100));
        ClientType clientType = ClientType.valueOf("PESSOA_FISICA");
        System.out.println(clientType.getRelatoryName());
        ClientType clientType2 = ClientType.clientTypeByRelatoryName("Pessoa Física");
        System.out.println(clientType2);

    }
}

package academy.samela.maratonajava.associacao.test;

import java.util.Scanner;

public class KeyboardReadingTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("⏭―――――――――――――――――――――――――――――――――――");
        System.out.println("ＢＥＭ ＶＩＮＤＯ ＡＯ ＧＲＡＮＤＥ ＳＯＦＴＷＡＲＥ ＤＯ ＦＵＴＵＲＯ");
        System.out.println("―――――――――――――――――――――――――――――――――――⏭");

        while (true){
            System.out.println("Digite sua pergunta e eu responderei SIM ou NÃO  ⎸ ◕‿◕ ⎸ ");
            System.out.println("Digite 'sair' para encerrar (｡>﹏<｡) ");
            String question = input.nextLine();

            if (question.equals("sair")) break;

            else if (question.charAt(0) == ' '){
                System.out.println("SIM (^o^)");
                System.out.println("\n");
            } else {
                System.out.println("NÃO ಠ_ಠ");
                System.out.println("\n");
            }
        }
        System.out.println("Volte Sempre (✿◠‿◠)");
    }
}

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        System.out.println("\uD83C\uDFAE ====== Jogo de Adivinhação ======\uD83C\uDFAE");
        System.out.println("\uD83E\uDD14 Tente adivinhar o número que estou pensando, entre 1 e 100!");
        System.out.println("⏳======= Você tem 5 tentativas ==========================⏳");

        // cria um objeto random para gerar números aleatórios.
        int numeroSecreto = random.nextInt(100) + 1; //Gera um número aleatório entre 0 e 99. e o +1 Ajusta para gerar números entre 1 e 100.

        int tentativa = 0;
        int numeroJogador;
        boolean acertou = false;
        final int TENTATIVAS_MAXIMA = 5; // número maximo de tenativas, valor da variável não pode ser alterado

        //loop até o jogador acertar
        while (!acertou && tentativa < TENTATIVAS_MAXIMA) {
            System.out.println("\uD83C\uDFAF Digite seu palpite: ");
            numeroJogador = scanner.nextInt();
            tentativa++;
            if (numeroJogador == numeroSecreto) {
                System.out.println("\uD83C\uDF89 Parabéns! Você acertou o número em " + tentativa + " tentativas.\uD83C\uDFC6");
                acertou = true;

            } else if (numeroJogador < numeroSecreto) {
                System.out.println("O número é maior que " + numeroJogador + ".");
            } else {
                System.out.println("O número é menor que " + numeroJogador + ".");
            }
            if (!acertou && tentativa < TENTATIVAS_MAXIMA) {
                System.out.println("Você tem " + (TENTATIVAS_MAXIMA - tentativa) + " tentativas restantes.");
            }
        }
        if (!acertou) {
            System.out.println("\uD83D\uDCA5 Você perdeu! :( . O número era: " + numeroSecreto);
        }
        System.out.println("\uD83D\uDC4F Obrigado por jogar! :)");
        System.out.println("========================================");
        scanner.close();
    }
}
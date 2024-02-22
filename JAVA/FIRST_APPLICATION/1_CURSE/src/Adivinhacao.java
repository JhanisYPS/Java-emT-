/*Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.

Dicas:

    Para gerar um número aleatório em Java: new Random().nextInt(100);
    Utilize o Scanner para obter os dados do usuário;
    Utilize uma variável para contar as tentativas;
    Utilize um loop para controlar as tentativas;
    Utilize a instrução break; para interromper o loop. */

import java.util.Random;
import java.util.Scanner; // import the Scanner class

public class Adivinhacao {

    // método responsável pelo sorteio dos números inteiros de 0 a 100
    static int sorteador() {
        int numeroSorteado = new Random().nextInt(100);
        return numeroSorteado;
    }

    // saudação ao usuário da aplicação
    static void introducao() {
        System.out.println("====== Jogo da Adivinhação ======");
        System.out.println("Bem-vind@ ao jogo da adivinhação!");
        System.out.println("Um número entre 0 e 100 será sorteado");
        System.out.println("será que você é capaz de acertar?");
        System.out.println("============= Regras =============");
        System.out.println("As regras são simples, você deve ");
        System.out.println("escolher um número inteiro entre ");
        System.out.println("0 - 100. Vamos informar se seu palpite");
        System.out.println("é maior ou menor do que o número sorteado.");
        System.out.println("Você terá 5 vidas, a cada erro 1 será perdida");
        System.out.println("Vamos começar?");

    }

    // Neste método perguntamos a ele se deseja jogar, continuar jogando ou parar.
    // Fiz um unico método para ser utilizado no inicio do jogo e nas possíveis
    // repetições
    static String inputUsuarioQuerJogar() {
        System.out.println("Digite S para SIM e N para NÃO");
        try (Scanner usuarioQuerJogar = new Scanner(System.in)) {
            String respUsuarioQuerJogar = usuarioQuerJogar.nextLine();
            // com a função toUpperCase transforma toda string em caixa alta
            // com a função trim elimino espaço em branco no início e no final da string
            respUsuarioQuerJogar = respUsuarioQuerJogar.toUpperCase().trim();

            return respUsuarioQuerJogar;
        }
    }

    // Caso o usuário digite um texto diferente de S ou N o jogo é encerrado como se
    // a resposta de jogar fosse negativa
    static boolean validarRespostaUsuario(String resposta) {
        switch (resposta) {
            case "S":
                return true;
            case "N":
                return false;
            default:
                return false;
        }
    }

    static int inputPalpiteUsuario() {
        // Solicita entrada de dado do usuário no prompt de comando
        System.out.println("====== Palpite do Usuário ======");
        System.out.println("Digite seu palpite:");
        Scanner palpiteUsuario = new Scanner(System.in);
        int palpiteUser = palpiteUsuario.nextInt();
        return palpiteUser;
        
    }

    static boolean saoIguais(int numero1, int numero2) {
        // Compara se dois números inteiros são iguais
        if (numero1 == numero2) {
            return true;
        } else {
            return false;
        }

    }

    static boolean palpiteMaior(int palpite, int sorteado) {
        // Verifica se o palpite é maior ou menor que o sorteado
        if (palpite > sorteado) {
            return true;

        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        int vidas = 5;
        boolean continua = true;

        do {
            int valorSorteado = sorteador();
            introducao();

            while (vidas > 0) {
                int palpiteUsuario = inputPalpiteUsuario();

                if (saoIguais(valorSorteado, palpiteUsuario)) {
                    System.out.println("Parabéns! Você acertou o número.");
                    break; // Sai do loop se o usuário acertar
                } else {
                    System.out.println("Ops! Seu palpite está errado.");
                    vidas--;

                    if (vidas > 0) {
                        System.out.println("Você ainda tem " + vidas + " vidas. Tente novamente.");
                        if (palpiteMaior(palpiteUsuario, valorSorteado)) {
                            System.out.println("O seu palpite é maior que o número sorteado");
                        } else {
                            System.out.println("O seu palpite é menor que o número sorteado");
                        }
                    } else {
                        System.out.println("Você perdeu todas as vidas. O número sorteado era: " + valorSorteado);
                    }
                }
            }

            System.out.println("Deseja jogar novamente? (S/N)");
            String resposta = inputUsuarioQuerJogar();
            continua = validarRespostaUsuario(resposta);

        } while (continua);
    }
}

import java.util.Scanner; // import the Scanner class

public class ConversorTemperatura {
    static double inputUsuario(){
        //Solicita entrada de dado do usuário no prompt de comando
        System.out.println("====== Calculadora Celcius-Fahrenheit ======");
        System.out.println("Insira a Temperatura em °C: ");
        try (Scanner temperaturaUsuario = new Scanner(System.in)) {
            double temperaturaCelsius = temperaturaUsuario.nextDouble();

            return temperaturaCelsius;
        }
    }

    static int calculoConversao(double temp){
        //Calculo de conversão de temperatura de °C para F
        int temperaturaFahrenheit = (int) (temp * 1.8) + 32;

        return temperaturaFahrenheit;
    }

    static void imprimeResultado(int tempConvertida){
        //Texto de resposta da conversão
        System.out.println(String.format("O resultado da conversão em Fahrenheit é aproximadamente %d",tempConvertida ));
    }

    public static void main(String[] args) {
        //Estou chamando os métodos criados simultaneamente
        int temperatura = calculoConversao(inputUsuario());
        imprimeResultado(temperatura);
    }

    

}
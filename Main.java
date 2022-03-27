
import java.util.Date; // Pacote para trabalhar com tipo de dado Data em Java
import java.util.concurrent.TimeUnit; // Usado para conversoes de Datas

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bem-vindo ao Sistema de Parqueamento");
        Date dataDeEntrada = new Date(); // instinciamos a data, por padräo quando nao passamos uma data como argumento
                                         // atribui a data actual

        System.out.println("Data de entrada: ");
        System.out.println(dataDeEntrada); // imprimimos a data de entrada

        System.out.println("Aguardando Saida....");
        System.out.println("Clique enter para sair");

        Scanner scanner = new Scanner(System.in); // inicializar stream de entrada
        scanner.nextLine(); // Aguardando interacao do utilizador
        scanner.close(); // encerrar stream

        System.out.println("Confirmacao de saida...");

        Date dataDeSaida = new Date(); // Capturar data de saida

        System.out.println("Data de Saida: ");
        System.out.println(dataDeSaida); // Imprimir data de saida

        long diffencaBruta = dataDeSaida.getTime() - dataDeEntrada.getTime(); // Calculamos a diferença da datas

        TimeUnit conversorDeTempo = TimeUnit.MINUTES; // Instinciamos o conversor de datas para retornar a data em minutos

        long diferancaConvertidaEmMinutos = conversorDeTempo.convert(diffencaBruta, TimeUnit.MILLISECONDS);

        System.out.println("Duraçäo do estacionamento em minutos: " + diferancaConvertidaEmMinutos);



    }
}
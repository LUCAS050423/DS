
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 
        // Criando 2 inst�ncias de Carro
        System.out.println("Digite os dados para o primeiro carro:");
        Carro carro1 = criarCarro(scanner);
 
        System.out.println("Digite os dados para o segundo carro:");
        Carro carro2 = criarCarro(scanner);
 
        // Criando 2 inst�ncias de Moto
        System.out.println("Digite os dados para a primeira moto:");
        Moto moto1 = criarMoto(scanner);
 
        System.out.println("Digite os dados para a segunda moto:");
        Moto moto2 = criarMoto(scanner);
 
        // Imprimindo a ficha t�cnica de cada ve�culo
        System.out.println("\nFicha t�cnica dos ve�culos:");
        carro1.imprimirFicha();
        carro2.imprimirFicha();
        moto1.imprimirFicha();
        moto2.imprimirFicha();
 
        scanner.close();
    }
 
    // M�todo para criar um Carro
    private static Carro criarCarro(Scanner scanner) {
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Valor Tabela: ");
        double valorTabela = scanner.nextDouble();
        scanner.nextLine();  // Consumir a nova linha
        System.out.print("Cor: ");
        String cor = scanner.nextLine();
        System.out.print("Combust�vel: ");
        String combustivel = scanner.nextLine();
 
        return new Carro(modelo, valorTabela, cor, combustivel);
    }
 
    // M�todo para criar uma Moto
    private static Moto criarMoto(Scanner scanner) {
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Valor Tabela: ");
        double valorTabela = scanner.nextDouble();
        scanner.nextLine();  // Consumir a nova linha
        System.out.print("Cor: ");
        String cor = scanner.nextLine();
        System.out.print("Combust�vel: ");
        String combustivel = scanner.nextLine();
 
        return new Moto(modelo, valorTabela, cor, combustivel);
    }
}
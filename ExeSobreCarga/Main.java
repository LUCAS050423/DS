
import java.util.*;

 

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int  soma = 1, subtracao = 2, operacao, num1, num2;
        double num3, num4;

        // Testando a classe Calculadora

        Calc calc = new Calc();

 

        System.out.println("Você deseja fazer que operação, digite 1 para inteiros e 2 para decimais: ");

        operacao = in.nextInt();

 

        if (operacao <= soma) {
        	
            System.out.println("Digite o primeiro numero: ");

            num1 = in.nextInt();
            
            System.out.println("Digite o segundo numero: ");

            num2 = in.nextInt();

            // soma de inteiros

            calc.soma(num1, num2);

            System.out.println("Soma de inteiros: " + calc.getResultado());

            // soma de decimais

            calc.subtracao(num1, num2);

            System.out.println("Subitração dos inteiros: " + calc.getResultado());
            

 

        } else if(subtracao >= soma) {

            // soma de decimais

            System.out.println("Digite o primeiro numero: ");

             num3 = in.nextDouble();
             
             System.out.println("Digite o segundo numero: ");

             num4 = in.nextDouble();
        	 calc.soma(num3, num4);
        	 
             

             System.out.println("Soma de decimais: " + calc.getResultado());

             // soma de decimais

             calc.subtracao(num3,num4);

             System.out.println("Subitraçãoo de decimais: " + calc.getResultado());
             


        }
        

        int[] numeros = {1, 2, 3, 4, 5};
        calc.soma(numeros);
        System.out.println("Soma de array: 1, 2, 3, 4, 5 = " + calc.getResultado());

        


    }
}
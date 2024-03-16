package introdução;
import java.util.*;

public class SalarioFuncionario {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		Funcionario primeiroFuncionario = new Funcionario();
		System.out.println("Insira o Salario Bruto de Pedro");
		primeiroFuncionario.SalarioBruto = in.nextDouble();
		System.out.println("O seu salario liquido é: "+primeiroFuncionario.salario());
		
		
		System.out.println("Insira o valor que deve ser atribuido ao salario de Pedro");
		double valor = in.nextDouble();
		primeiroFuncionario.aumentoSalario(valor);
		System.out.println("O salario bruto de Pedro agora é: "+primeiroFuncionario.SalarioLiquido);

		Funcionario segundoFuncionario = new Funcionario();
		System.out.println("Insira o Salario Bruto de Vagner");
		segundoFuncionario.SalarioBruto = in.nextDouble();
		System.out.println("O seu salario liquido é: "+segundoFuncionario.salario());
		
		
		System.out.println("Insira o valor que deve ser atribuido ao salario de Vagner");
		valor = in.nextDouble();
		segundoFuncionario.aumentoSalario(valor);
		System.out.println("O salario bruto de Vagner agora é: "+segundoFuncionario.SalarioLiquido);

	}

}

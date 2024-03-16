package introdução;

public class Funcionario {
	double SalarioLiquido;
	double SalarioBruto;
	double Imposto = 0.30;
	String Nome;
	
	double salario() {
		SalarioLiquido = SalarioBruto - (SalarioBruto*Imposto);
		return SalarioLiquido;
	}
	double aumentoSalario(double aumento) {
		
		SalarioLiquido = SalarioBruto + aumento;
		
		return SalarioLiquido;
	}

}

package introdução;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		Quadrado primeiroQuadrado = new Quadrado();
		System.out.println("Insira a altura do quadrado");
		primeiroQuadrado.Altura = in.nextDouble();
		System.out.println("Insira a base do quadrado");
		primeiroQuadrado.Base = in.nextDouble();
		System.out.println("A area do primeiro quadrado é: "+primeiroQuadrado.calcular());
		
		Quadrado segundoQuadrado = new Quadrado();
		System.out.println("Insira a altura do quadrado");
		segundoQuadrado.Altura = in.nextDouble();
		System.out.println("Insira a base do quadrado");
		segundoQuadrado.Base = in.nextDouble();
		System.out.println("A area do segundo quadrado é: "+segundoQuadrado.calcular());

	}

}

import java.util.List;

public class Calc {

    // Atributos

    private String nome;

    private double resultado;

    

    // Métodos get e set

    public String getNome() {

        return nome;

    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public double getResultado() {

        return resultado;

    }

    public void setResultado(double resultado) {

        this.resultado = resultado;

    }

 

    // Método de soma inteiros e decimais

    public void soma(int n1, int n2) {

        resultado = n1 + n2;

    }

    public void soma(double n1, double n2){

        resultado = n1 + n2;

    }
    

// Método de subtracao inteiros e decimais

public void subtracao(int n1, int n2) {

    resultado = n1 - n2;

}

public void subtracao(double n1, double n2){

    resultado = n1 - n2;

}
public void soma(int[] array) {
    resultado = 0;
    for (int num : array) {
        resultado += num;
    }
}


}



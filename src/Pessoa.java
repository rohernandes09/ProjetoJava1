/*2. Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que calcula e escreve:
a. a maior e a menor altura do grupo;
b. média de altura dos homens;
c. o número de mulheres.*/
import java.util.ArrayList;

public class Pessoa {
    private float altura;
    private boolean sexo; // true = homem, false = mulher
    private String nome;

    public Pessoa(float altura, boolean sexo, String nome) {
        this.altura = altura;
        this.sexo = sexo;
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public boolean isHomem() {
        return sexo;
    }

    public String getNome() {
        return nome;
    }

    // Método estático para calcular média de altura dos homens
    public static float mediaAlturaHomens(ArrayList<Pessoa> pessoas) {
        float soma = 0;
        int contador = 0;

        for (Pessoa p : pessoas) {
            if (p.isHomem()) {
                soma += p.getAltura();
                contador++;
            }
        }

        return (contador > 0) ? soma / contador : 0;
    }

    public static int contarMulheres(ArrayList<Pessoa> pessoas) {
        int contador = 0;
        for (Pessoa p : pessoas) {
            if (!p.isHomem()) {
                contador++;
            }
        }
        return contador;
    }

    // Método estático para encontrar maior e menor altura
    public static float[] maiorMenorAltura(ArrayList<Pessoa> pessoas) {
        float maior = pessoas.get(0).getAltura();
        float menor = pessoas.get(0).getAltura();

        for (Pessoa p : pessoas) {
            if (p.getAltura() > maior) maior = p.getAltura();
            if (p.getAltura() < menor) menor = p.getAltura();
        }

        return new float[]{maior, menor};
    }
}



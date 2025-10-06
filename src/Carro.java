public class Carro {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double velocidadeAtual;

    public Carro(String marca, String modelo, int anoFabicacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabicacao;
        this.velocidadeAtual = 0.0;

    }



    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void acelerar(double incremento) {
        if (incremento > 0) {
            this.velocidadeAtual += incremento;
            System.out.println("O carro " + this.modelo + " acelerou para " + this.velocidadeAtual + " km/h.");
        } else {
            System.out.println("Incremento deve ser um valor positivo.");
        }
    }

    public void frear(double decremento) {
        if (decremento > 0) {
            this.velocidadeAtual -= decremento;
            if (this.velocidadeAtual < 0) {
                this.velocidadeAtual = 0;
            }
            System.out.println("O carro freiou para " + this.velocidadeAtual + "km/h");
        } else {
            System.out.println("Decrementeo precisa ser um valor positivo ");
        }

    }
}


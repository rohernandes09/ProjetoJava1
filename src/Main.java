import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        double c = 20;
        Temperatura temperatura = new Temperatura();

        double K = temperatura.cToK(c);
        System.out.println(K);
        double F = temperatura.cToF(c);
        System.out.println(F);
        double Re = temperatura.cToRe(c);
        System.out.println(Re);
        double Ra = temperatura.cToRa(c);
        System.out.println(Ra);

        ArrayList<Pessoa> grupo = new ArrayList<>();
        grupo.add(new Pessoa(1.75f, true, "João"));
        grupo.add(new Pessoa(1.95f, true, "JoãoCarlos"));
        grupo.add(new Pessoa(1.55f, true, "JoãoMiguel"));
        grupo.add(new Pessoa(1.855f, true, "JoãoLucas"));
        grupo.add(new Pessoa(1.60f, false, "Maria"));
        grupo.add(new Pessoa(1.80f, true, "Carlos"));
        grupo.add(new Pessoa(1.70f, false, "MariaFlavia"));
        grupo.add(new Pessoa(1.80f, false, "MariaAlice"));
        grupo.add(new Pessoa(1.65f, false, "MariaCristina"));
        grupo.add(new Pessoa(1.55f, false, "MariaFrancisca"));



        System.out.println("Média de altura dos homens: " + Pessoa.mediaAlturaHomens(grupo));
        System.out.println("Número de mulheres: " + Pessoa.contarMulheres(grupo));

        float[] alturas = Pessoa.maiorMenorAltura(grupo);
        System.out.println("Maior altura: " + alturas[0]);
        System.out.println("Menor altura: " + alturas[1]);



        Carro meuCarro = new Carro("Volkswagen", "Gol G5", 2011);

        // Exibindo informações básicas
        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Ano: " + meuCarro.getAnoFabricacao());
        System.out.println("Velocidade atual: " + meuCarro.getVelocidadeAtual() + " km/h");

        // Testando aceleração
        meuCarro.acelerar(30);
        meuCarro.acelerar(20);

        // Testando frenagem
        meuCarro.frear(15);
        meuCarro.frear(50); // Deve zerar a velocidade

        // Velocidade final
        System.out.println("Velocidade final: " + meuCarro.getVelocidadeAtual() + " km/h");


    }
}
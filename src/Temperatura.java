/*1. Escreva um programa que, com base em uma temperatura em graus Celsius, a converta e exiba em
Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273,15; Re=C*0,8; Ra = C * 1,8 + 32 + 459,67
 */
public class Temperatura {

    public double cToK(double c ){
         double K = c + 273.15 ;
         return K;
    }
    public double cToF(double c){
       double F = c * 1.8;

    return F ;
    }
    public double cToRe(double c){
        double Re = c * 0.8;

    return Re;
    }
    public double cToRa(double c){
        double Ra = c * 1.8 + 32 + 459.67;
        return Ra;
    }


}


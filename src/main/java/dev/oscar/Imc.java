package dev.oscar;

public class Imc {
    public static double calculateImc(double peso, double estatura){
        return peso/Math.pow(estatura, 2);
    }
 
    public static String nivelPeso(double IMC) {
        if (IMC < 16) {
            return "La persona tiene delgadez severa";
        } else if ( IMC < 17) {
            return "La persona tiene delgadez moderada";
        } else if (IMC < 18.5) {
            return "La persona tiene delgadez leve";
        } else if (IMC < 25) {
            return "La persona tiene peso normal";
        } else if (IMC < 30) {
            return "La persona tiene sobrepeso";
        } else if (IMC < 35) {
            return " La persona tiene obesidad leve";
        } else if (IMC < 40) {
            return "La persona tiene obesidad moderada";
        } else {
            return "La persona tiene obesidad mórbida";
        }
    }
 

 public static void main(String args[]) {
    double peso = 64; 
    double estatura = 1.72;  
    double IMC = calculateImc(peso,estatura);
  
   
    System.out.println("La persona tiene una masa = " + peso + "kilogramos y estatura = " + estatura + " metros"); 
     System.out.println(nivelPeso(IMC));
        } 
}

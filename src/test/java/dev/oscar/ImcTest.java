package dev.oscar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ImcTest {
    @Test
    void testCalculateImc() {
        double peso1 = 64;
        double estatura1 = 1.72;
        double expectedImc1 = 21.6349;
        assertEquals(expectedImc1, Imc.calculateImc(peso1, estatura1), 0.01);
        
    }

   

    @Test
    void testNivelPeso() {
        double imc1 = 15;
        String expectedNivelPeso1 = "La persona tiene delgadez severa";
        assertEquals(expectedNivelPeso1, Imc.nivelPeso(imc1));
        
       
        double imc2 = 16.5;
        String expectedNivelPeso2 = "La persona tiene delgadez moderada";
        assertEquals(expectedNivelPeso2, Imc.nivelPeso(imc2));
        
      
        double imc3 = 17.5;
        String expectedNivelPeso3 = "La persona tiene delgadez leve";
        assertEquals(expectedNivelPeso3, Imc.nivelPeso(imc3));
        
       
        double imc4 = 22;
        String expectedNivelPeso4 = "La persona tiene peso normal";
        assertEquals(expectedNivelPeso4, Imc.nivelPeso(imc4));
        
       
        double imc5 = 28;
        String expectedNivelPeso5 = "La persona tiene sobrepeso";
        assertEquals(expectedNivelPeso5, Imc.nivelPeso(imc5));
        
        
        double imc6 = 32;
        String expectedNivelPeso6 = " La persona tiene obesidad leve";
        assertEquals(expectedNivelPeso6, Imc.nivelPeso(imc6));
        
      
        double imc7 = 37;
        String expectedNivelPeso7 = "La persona tiene obesidad moderada";
        assertEquals(expectedNivelPeso7, Imc.nivelPeso(imc7));
        
       
        double imc8 = 42;
        String expectedNivelPeso8 = "La persona tiene obesidad mórbida";
        assertEquals(expectedNivelPeso8, Imc.nivelPeso(imc8));
    }
}

package Easy;

import easy.Exercicio07;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteExercicio07 {

    static Exercicio07 exercicio07;

    @BeforeClass
    public static void before() {
        exercicio07 = new Exercicio07();
    }


    @Test
    public void testPrimeiraFaixa() {
        Exercicio07 exercicio07 = new Exercicio07();
        Assert.assertEquals("78.375", String.valueOf(exercicio07.calcularInss(1045.00)));

    }

    @Test
    public void testeSegundaFaixa() {
        Exercicio07 exercicio07 = new Exercicio07();
        Assert.assertEquals("94.0509", String.valueOf(exercicio07.calcularInss(1045.01)));

    }

    @Test
    public void testeTerceiraFaixa() {
        Exercicio07 exercicio07 = new Exercicio07();
        Assert.assertEquals("250,7532", String.valueOf(exercicio07.calcularInss(2089.61)));


    }

    @Test
    public void testeQuartaFaixa() {
        Exercicio07 exercicio07 = new Exercicio07();
        Assert.assertEquals("438.8174", String.valueOf(exercicio07.calcularInss(3134.41)));

    }

    @Test
    public void testeQuintaFaixa() {
        Exercicio07 exercicio07 = new Exercicio07();
        Assert.assertEquals("854.14", String.valueOf(exercicio07.calcularInss(6101.07)));

    }

}
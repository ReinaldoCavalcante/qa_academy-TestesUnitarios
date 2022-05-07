package Medium;

import medium.Exercicio10;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteExercicio10 {
    Exercicio10 exercicio10;

    @Before
    public void before (){
        exercicio10 = new Exercicio10();
    }

    @Test
    public void testeFibonacciSemVetor(){
        Assert.assertEquals( 34,exercicio10.calcularFibonacci(10));


    }


}

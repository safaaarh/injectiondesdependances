package metier;

import org.junit.Assert;
import org.junit.Test;

public class Calcultest {
    private Calcul calcul;
    @Test
    public void testsomme(){
        calcul=new Calcul();
        double a=5;
        double b=9;
        double exepted=14;
        double res=calcul.somme(a,b);
        Assert.assertTrue(res==exepted);
    }
}

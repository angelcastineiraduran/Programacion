package boletin21_1;
import java.util.Arrays;


public class Metodos {
    
    private int arraySeis[] = new int[6];
    
    public void arrayAleatoria (){
        for(int i = 0; i < arraySeis.length; i++){
            arraySeis [i] = (int) (Math.floor(Math.random() * (1 - 50 + 1) + 50));
            System.out.println("elemento " + i + "= " + arraySeis[i]);
        }
    }
    
    
}

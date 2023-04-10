package exemploxenerico;

public class ExemploXenerico {

    public static void main(String[] args) {
        
        ClaseGenerica <Integer> obx = new ClaseGenerica<>();
        obx.setDato(4);
        
        ClaseGenerica <Xogador> obx2 = new ClaseGenerica<>();
        Xogador x = new Xogador ("aspas", 4);
        obx2.setDato(x);
        System.out.println(obx2.getDato());
        
    
    }
    
}

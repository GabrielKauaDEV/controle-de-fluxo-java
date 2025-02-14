public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero=1 ; numero<=8 ; numero++){
            if(numero == 6){
                break;
            }
            if(numero == 4){
                continue;
            }
            System.out.println(numero);
        }
        
    }
}

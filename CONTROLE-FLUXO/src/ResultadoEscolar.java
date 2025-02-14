public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        if (nota >=7 ) {
            System.out.println("Aprovado");
        }
        else if (nota >=5 && nota < 7) {
            System.out.println("Recuperação");
        }
        else {
            System.out.println("Reprovado");
        }

        int math = 7;
        String resultado = math >= 7 ? "Aprovado" : math >=5 && math < 7 ? "Recuperaçao" : "Reprovado";
        System.out.println(resultado);
    }
}

public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"Gabriel", "Jonas", "Andressa", "Duda"};

        for(int x=0 ; x<alunos.length; x++){
            System.out.println("O aluno no indice " + x + " é " + alunos[x]);
        }

        String professores[] = {"Marta", "Vinicius", "Claúdia", "Vanuza"};

        for(String professor : professores){
            System.out.println("O professor é: " + professor);
        }
    }
}

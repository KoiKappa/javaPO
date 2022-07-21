package src;


public class App {
    public static void main(String[] args) throws Exception {
        Pessoa objetoPessoa = new Pessoa ();
        String mostrandodados = objetoPessoa.mostrandoDados();
        System.out.println (mostrandodados);
        int mostrandoidade = objetoPessoa.calcularIdade();
        System.out.println(mostrandoidade);
    }
}

package Faculdade;

public class App {
    public static void main(String[] args) throws Exception {
        Aluno objetoAluno = new Aluno();
        objetoAluno.matricula = 54;
        objetoAluno.nome = "Matheus Grolla";
        objetoAluno.nota01 = 85;
        objetoAluno.nota02 = 75;
        objetoAluno.notatrabalho = 60;
        double media = objetoAluno.media();
        System.out.println(media);
        double mediafinal = objetoAluno.mediaFinal();
        System.out.println(mediafinal);
        System.out.println(objetoAluno.nome+" "+objetoAluno.matricula+" "+"  "+media);


        
    }
}

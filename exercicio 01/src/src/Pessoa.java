package src;

public class Pessoa {
        private String nome = "Matheus";
        private String data = "24/06/1997"; 
        private int ano = 1997; 
        private double altura = 1.80;
        
        public String  mostrandoDados () {
            String mostrardados = (nome+"  "+data+"  "+altura); 
            return mostrardados;  

        } 
        public int calcularIdade () {
            int calcularidade = (2022-ano);
            return calcularidade; 
        
    

            
    }
}


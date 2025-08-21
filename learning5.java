//Questão de concurso que eu queria rodar

public class learning5 {

    public static class Produto {

        public double preco;

        public double calcularDesconto(double percentual) {

            return preco * (percentual / 100);
        }
    }

    public static void main(String[] args){
        Produto p = new Produto();
        p.preco = 200;
        double a = p.calcularDesconto(10);
        System.out.println(a);
    }
}
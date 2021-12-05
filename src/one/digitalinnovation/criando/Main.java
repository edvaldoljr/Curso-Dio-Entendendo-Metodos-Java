package one.digitalinnovation.criando;

public class Main {
    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício Calculadora");
        Calculadora.soma(3,6);
        Calculadora.subtracao(9,1.8);
        Calculadora.multiplicacao(7,8);
        Calculadora.divisao(5,2.5);

        //Mensagem
        System.out.println("Exercício Mensagem");
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(2);

        //Empréstimo
        System.out.println("Exercício Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000,5);
    }
}

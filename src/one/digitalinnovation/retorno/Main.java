package one.digitalinnovation.retorno;

/**
 * Classe de exemplo para o exercício da Aula 3 de Métodos.
 */

public class Main {

    public static void main(String[] args) {
        //Retornos
        System.out.println("Exercícios Retornos");

        double areaQuadro = Quadrilatero.area(3);
        System.out.println("Área do quadrado: " + areaQuadro);

        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println("Área do retangulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Área do trapezio: " + areaTrapezio);
    }


}

public class Exercicio6 {
    public static void main(String[] args) {
        int primeiroValor = 0;
        int segundoValor = 1;
        System.out.println(primeiroValor);
        System.out.println(segundoValor);
        int soma = primeiroValor + segundoValor;
        System.out.println(soma);
        do{
            primeiroValor = segundoValor;
            segundoValor = soma;
            soma = primeiroValor + segundoValor;
            System.out.println(soma);
        } while(soma <= 100);
    }
}

public class Exercicio4 {
    public static void main(String[] args) {
        for (int n = 1; n <= 10; n++){
            System.out.println("Fatorial de "+n+" é: "+ fatorial(n));
        }
    }

    public static int fatorial(int valor){
        if (valor == 0){
            return 1;
        }else{
            return valor * fatorial(valor -1);
        }
    }
}

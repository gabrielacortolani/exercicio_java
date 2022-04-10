public class Exercicio5 {
    public static void main(String[] args) {
        for (long n = 1; n <= 20; n++){
            System.out.println("Fatorial de "+n+" é: "+ fatorial(n));
        }
    }

    public static long fatorial(long valor){
        if (valor == 0){
            return 1;
        }else{
            return valor * fatorial(valor -1);
        }
    }
}

public class Exercicio7 {
    public static void main(String[] args) {
        int x = 13;
        imprime(x);
    }

    public static void imprime(int x){
        int y;
        if (x % 2 == 0){
            y = x/2;
        }else{
            y = 3*x +1;
        }
        x = y;
        if (x == 1){
            System.out.print(x);
        }else{
            System.out.print(x+" -> ");
            imprime(x);
        }
        
    }
}

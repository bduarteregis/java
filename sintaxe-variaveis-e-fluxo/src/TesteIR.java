public class TesteIR {

    public static void main(String[] args) {

        double salario = 3300.0;

        if (salario >= 1900.0 || salario <= 2800.0) {
        	System.out.println("Sua alíquota é de 7,5%. Você deve deduzir " + (salario * 0.075));
        } else if (salario >= 2800.01 || salario <= 3751.0) {
        	System.out.println("Sua alíquota é de 15%. Você deve deduzir " + (salario * 0.15));
        } else if (salario >= 3751.01 || salario <= 4664.0) {
        	System.out.println("Sua alíquota é de 22,5%. Você deve deduzir "+ (salario * 0.225));
        }
    }
}
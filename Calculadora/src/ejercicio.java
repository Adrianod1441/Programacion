import java.util.Scanner;

public class ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int operandoA=-1;
		int operandoB;
		String operacion;
		int resultado = 0;
				
		Scanner keyboard = new Scanner(System.in);
		while(operandoA!=0){

			System.out.println("escriba el primer operando");
			operandoA = Integer.parseInt(keyboard.nextLine());
			
			System.out.println("escriba la operacion que quieras realizar(+,-,*,/)");
			operacion = keyboard.nextLine();
			
			System.out.println("escriba el segundo operando");
			operandoB = Integer.parseInt(keyboard.nextLine());
			
			if(operacion.equals("+")) {
				resultado = operandoA + operandoB;
			}
			
			else if(operacion.equals("-")) {
				resultado = operandoA - operandoB;
			}
			
			else if(operacion.equals("*")) {
				resultado = operandoA * operandoB;
			}
			
			else if(operacion.equals("/")) {
				resultado = operandoA / operandoB;
			}
			
			if(operacion.equals("+")||operacion.equals("-")||operacion.equals("*")||operacion.equals("/")) {
				System.out.println(operandoA+ operacion+ operandoB+ "="+ resultado);		
			}
			
			else {
				System.out.println("has escrito una operacion no valida");
			}
		
		}
		
		
		
		
		
		
	}

}

public class Altura {
	public static void main(String[] algs) {
		double altJoao=134, altPedro=145;
		int i=1;
		while (altJoao<=altPedro) {
			altPedro=altPedro + 2.0;
			altJoao=altJoao + 2.5;
			i++;
			//o programa vai calcular a idade de pedro +2.0, vai ficar se repetindo até focar "<=" que altura de João
		}
		
		System.out.println("João só ficará maior que Pedro daqui "+i+" anos.");
		System.out.println("oi");
	}

}

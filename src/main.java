public class main {

	public static void main(String[] args) {

		System.out.println("Adicao: " + adicao(-3, 5));
		System.out.println("Adicao: " + adicao(-3, -5));
		System.out.println("Adicao: " + adicao(3, -5));

		System.out.println("Subtracao: " + subtracao(-3, 5));
		System.out.println("Subtracao: " + subtracao(-3, -5));
		System.out.println("Subtracao: " + subtracao(3, -5));

		System.out.println("Multiplicacao: " + multiplicacao(-3, -5));
		System.out.println("Multiplicacao: " + multiplicacao(3, -5));
		System.out.println("Multiplicacao: " + multiplicacao(-3, 5));
		System.out.println("Multiplicacao: " + multiplicacao(3, 5));
		System.out.println("Multiplicacao: " + multiplicacao(0, 5));
		System.out.println("Multiplicacao: " + multiplicacao(3, 0));
		System.out.println("Multiplicacao: " + multiplicacao(0, 0));
		System.out.println("Multiplicacao: " + multiplicacao(23, 45));

		divisao(10, -2);
		divisao(-10, -2);
		divisao(-10, 2);
		divisao(10, 0);
		divisao(0, 10);
		divisao(0, 0);
		divisao(1, -2);
		

	}

	public static int adicao(int x, int y) {
		int aux = x + y;
		return aux;
	}

	public static int subtracao(int x, int y) {
		int aux = x - y;
		return aux;
	}

	public static int multiplicacao(int x, int y) {
		boolean positivoX = true;
		boolean positivoY = true;

		int aux = 0;

		if ((y == 0) || (x == 0)) {
			return 0;
		}

		if (x < 0) {
			positivoX = false;
		}

		if (y < 0) {
			positivoY = false;
		}

		if (positivoX == positivoY) {
			for (int i = 1; i <= Math.abs(y); i++) {
				aux = aux + Math.abs(x);
			}
		} else if (positivoX) {
			for (int i = 1; i <= Math.abs(x); i++) {
				aux = aux + y;
			}
		} else {
			for (int i = 1; i <= Math.abs(y); i++) {
				aux = aux + x;
			}
		}

		return aux;

	}

	public static void divisao(int x, int y) {

		int aux = 0;
		boolean positivoX = true;
		boolean positivoY = true;
		int num = Math.abs(x);
		int quo = Math.abs(y);

		if ((y == 0) && (x == 0)) {
			System.out.println("Valor indeterminado");
		} else if (y == 0) {
			System.out.println("Erro: Divisao por zero");
		} else if (num < quo) {
			System.out.println("Divisao: " + aux);
		} else {
			if (x < 0) {
				positivoX = false;
			}

			if (y < 0) {
				positivoY = false;
			}

			if (positivoX == positivoY) {
				while (num >= quo) {
					num = num - quo;
					aux = aux + 1;
				}
				System.out.println("Divisao: " + aux);
			} else {
				while (num >= quo) {
					num = num - quo;
					aux = aux - 1;
				}
				System.out.println("Divisao: " + aux);
			}
		}
	}

}

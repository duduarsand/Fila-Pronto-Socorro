import java.util.PriorityQueue;
import java.util.Queue;

public class ProntoSocorro {

	public static void main(String[] args) {
		Queue<Paciente> p = new PriorityQueue<>(new PacienteComparator());
		for (int i = 0; i <= 5; i++) {
			adicionaPacienteAleatorio(p);
		}

		for (int minuto = 1; !p.isEmpty(); minuto++) {
			System.out.println("Minuto " + minuto + ":");
			System.out.println("Fila: " + p);

			adicionaPacienteAleatorio(p);

			if (minuto == 5) {
				Paciente proximaPessoa = p.poll();
				System.out.println("Atendendo: " + proximaPessoa);
				minuto = 0;
			}

			System.out.println();

			try {
				Thread.sleep(60000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void adicionaPacienteAleatorio(Queue<Paciente> p) {
		String[] nomes = { "João", "Matheus" };
		Paciente d = new Paciente(nomes[(int) Math.random() * nomes.length], (int) (Math.random() * 3) + 1,
				(int) (Math.random() * 100));
		p.add(d);
	}

}

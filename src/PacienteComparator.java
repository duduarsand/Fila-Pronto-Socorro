import java.util.Comparator;

public class PacienteComparator implements Comparator<Paciente> {

	@Override
	public int compare(Paciente p1, Paciente p2) {
		return p1.getPrioridade() < p2.getPrioridade() ? 1 : -1;
	}

}

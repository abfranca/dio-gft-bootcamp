import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Dev {

	private String nome;
	private Set<Atividade> atividadesEmAndamento;
	private Set<Atividade> atividadesConcluidas;

	public Dev(String nome) {
		this.nome = nome;
		this.atividadesEmAndamento = new HashSet<Atividade>();
		this.atividadesConcluidas = new HashSet<Atividade>();
	}

	public String toString() {
		return "Nome: " + this.nome + "\n" + "Atividades Matriculadas: " + this.atividadesEmAndamento.size() + "\n"
				+ "Atividades Concluídas: " + this.atividadesConcluidas.size() + "\n" + "XP Adiquirido: "
				+ this.calcularXP();
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Atividade> getAtividadesEmAndamento() {
		return this.atividadesEmAndamento;
	}

	public Set<Atividade> getAtividadesConcluidas() {
		return this.atividadesConcluidas;
	}

	public void inscreverBootcamp(Bootcamp bootcamp) {
		Iterator<Atividade> atividadesI = bootcamp.getAtividades().iterator();
		Atividade atividade;
		while (atividadesI.hasNext()) {
			atividade = atividadesI.next();
			if (!this.atividadesConcluidas.contains(atividade)) {
				this.atividadesEmAndamento.add(atividade);
			}
		}
		bootcamp.inscreverDev(this);
	}

	public void progredir() {
		if (!this.atividadesEmAndamento.isEmpty()) {
			Atividade atividade = this.atividadesEmAndamento.iterator().next();
			this.atividadesConcluidas.add(atividade);
			this.atividadesEmAndamento.remove(atividade);
		}
	}

	public int calcularXP() {
		int total = 0;
		if (!this.atividadesConcluidas.isEmpty()) {
			Iterator<Atividade> atividadesI = this.atividadesConcluidas.iterator();
			while (atividadesI.hasNext()) {
				total += atividadesI.next().getXP();
			}
		}
		return total;
	}

}

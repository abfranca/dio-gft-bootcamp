import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Bootcamp {

	private String nome;
	private String descricao;
	private LocalDate inicio;
	private LocalDate fim;
	private Set<Atividade> atividades;
	private Set<Dev> devs;

	public Bootcamp(String nome, String descricao, String inicio, String fim, Set<Atividade> atividades) {
		this.nome = nome;
		this.descricao = descricao;
		this.inicio = LocalDate.parse(inicio);
		this.fim = LocalDate.parse(fim);
		this.atividades = atividades;
		this.devs = new HashSet<Dev>();
	}

	public String toString() {
		Iterator<Atividade> atividadesI = this.atividades.iterator();
		int cargaHoraria = 0;
		while (atividadesI.hasNext()) {
			cargaHoraria += atividadesI.next().getCargaHoraria();
		}
		return "Nome: " + this.nome + "\n" + "Descrição: " + this.descricao + "\n" + "Início: " + this.inicio.toString()
				+ "\n" + "Fim: " + this.fim.toString() + "\n" + "Atividades: " + this.atividades.size() + "\n"
				+ "Carga Horária: " + cargaHoraria + "\n" + "Devs Matriculados: " + this.devs.size();
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getInicio() {
		return this.inicio;
	}

	public void setInicio(String data) {
		this.inicio = LocalDate.parse(data);
	}

	public LocalDate getFim() {
		return this.fim;
	}

	public void setFim(String data) {
		this.fim = LocalDate.parse(data);
	}

	public Set<Atividade> getAtividades() {
		return this.atividades;
	}

	public Set<Dev> getDevs() {
		return this.devs;
	}

	public void inscreverDev(Dev dev) {
		this.devs.add(dev);
	}

}

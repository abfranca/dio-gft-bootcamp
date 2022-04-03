import java.time.LocalDate;

public class Mentoria extends Atividade {

	private LocalDate data;

	public Mentoria(String titulo, String descricao, int cargaHoraria, String data) {
		super(titulo, descricao, cargaHoraria);
		this.data = LocalDate.parse(data);
	}

	public LocalDate getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = LocalDate.parse(data);
	}

	public int getXP() {
		return this.cargaHoraria * 15;
	}

}

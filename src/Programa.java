import java.util.HashSet;
import java.util.Set;

public class Programa {

	public static void main(String[] args) {

		Set<Atividade> atvs = new HashSet<Atividade>();
		atvs.add(new Atividade("Atividade Teste", "Descrição teste.", 4));
		atvs.add(new Mentoria("Atividade Teste", "Descrição teste.", 2, "2022-03-15"));
		Bootcamp bc = new Bootcamp("Bootcamp de Teste", "Descrição teste.", "2022-03-01", "2022-04-03", atvs);

		System.out.println("-- Bootcamp criado --");
		System.out.println(bc.toString());
		System.out.printf("\n----------\n");
		
		Dev dev1 = new Dev("Ronaldo");
		Dev dev2 = new Dev("Carla");
		
		System.out.println("-- Devs criados --");
		System.out.println(dev1.toString());
		System.out.printf("\n----------\n");
		System.out.println(dev2.toString());
		System.out.printf("\n----------\n");
		
		dev1.inscreverBootcamp(bc);
		dev2.inscreverBootcamp(bc);
		
		System.out.println("-- Devs inscritos --");
		System.out.println(bc.toString());
		System.out.printf("\n----------\n");
		System.out.println(dev1.toString());
		System.out.printf("\n----------\n");
		System.out.println(dev2.toString());
		System.out.printf("\n----------\n");
		
		dev1.progredir();
		dev1.progredir();
		dev2.progredir();

		System.out.println("-- Progresso dos Devs --");
		System.out.println(dev1.toString());
		System.out.printf("\n----------\n");
		System.out.println(dev2.toString());
		System.out.printf("\n----------\n");
		
	}

}

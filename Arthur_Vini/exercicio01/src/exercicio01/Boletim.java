/*Nomes: Arthur Meira e Vinícius. T. Colombo  
  Turma: 3-53*/

package exercicio01;

public class Boletim {

	public static void main(String[] args) {
		Aluno a1 = new Aluno ();
		a1.nomeAluno ="Joãozinho ";
	    a1.n1 = 8 ;
	    a1.n2 = 7 ;
	    a1.n3 = 6.5f;
	    a1.n4 = 9;
	    a1.disciplina = "Física";
	    a1.media = (a1.n1 + a1.n2 + a1.n3 + a1.n4) / 4;
	    
	    Professor p1 = new Professor();
	    p1.nome = "Lucas";
	    p1.disciplina = "Física";
	    
	    
	    System.out.println("O aluno " + a1.nomeAluno + ", " + "teve a média de " + a1.media + " "
	    		+ "na disciplina de " + a1.disciplina + " professor " + p1.nome);

	}

}

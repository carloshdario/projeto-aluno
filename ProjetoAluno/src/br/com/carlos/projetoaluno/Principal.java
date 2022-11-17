package br.com.carlos.projetoaluno;

public class Principal {

	public static void main(String[] args) {
		
		Alunos aluno = new Alunos();
		aluno.setId(1);
		aluno.setNome();
		aluno.curso = new Curso();
		aluno.curso.setNomeCurso("Desenvolvimento de Sistema");
		aluno.curso.setDisciplina("Java");
		aluno.curso.setTurma("B");
		
		System.out.printf("O aluno %s, da turma %s do curso %s, adora a disciplina %s."+"\n", aluno.getNome(), aluno.curso.getTurma(),aluno.curso.getNomeCurso(),aluno.curso.getDisciplina());
		
		
		Professor prof = new Professor();
		prof.setId(2);
		prof.setNome();
		prof.curso = new Curso();
		prof.curso.setDisciplina("Java");
		prof.curso.setNomeCurso("Desenvolvimento de Sistemas");
		prof.curso.setTurma("B");
		
		System.out.printf("O professor %s, dá aula na Disciplina %s, para a turma %s do curso de %s ", prof.getNome(), prof.curso.getDisciplina(), prof.curso.getTurma(), prof.curso.getNomeCurso());
		
		
	}

}

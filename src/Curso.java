
public class Curso {
	
	private String id;
	private String nome;
	private String codCurso;
	private String nomeCoordenador;
	private String qtdAlunos;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(String codCurso) {
		this.codCurso = codCurso;
	}

	public String getNomeCoordenador() {
		return nomeCoordenador;
	}

	public void setNomeCoordenador(String nomeCoordenador) {
		this.nomeCoordenador = nomeCoordenador;
	}

	public String getQtdAlunos() {
		return qtdAlunos;
	}

	public void setQtdAlunos(String qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", nome=" + nome + ", codCurso=" + codCurso + ", nomeCoordenador=" + nomeCoordenador
				+ ", qtdAlunos=" + qtdAlunos + "]";
	}
	

}

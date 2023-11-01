import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

public class ControllerCurso {

	private StringProperty id = new SimpleStringProperty("");
	private StringProperty nome = new SimpleStringProperty("");
	private StringProperty codCurso = new SimpleStringProperty("");
	private StringProperty nomeCoordenador = new SimpleStringProperty("");
	private StringProperty qtdAlunos = new SimpleStringProperty("");

	private List<Curso> lista = new ArrayList<>();

	public void salvar(Curso c) {
		lista.add(c);
	}

	public Curso pesquisar(String texto) {
		for (Curso c : lista) {
			if (c.getNome().contains(texto)) {
				return c;
			}
		}
		return null;
	}

	public void salvarCurso() {
		salvar(toEntity());
		clearBoundary();
	}

	public Curso toEntity() {
		Curso c = new Curso();
		c.setId(id.get());
		c.setNome(nome.get());
		c.setCodCurso(codCurso.get());
		c.setNomeCoordenador(nomeCoordenador.get());
		c.setQtdAlunos(qtdAlunos.get());
		return c;
	}

	public void clearBoundary() {
		id.set("");
		nome.set("");
		codCurso.set("");
		nomeCoordenador.set("");
		qtdAlunos.set("");
	}

	public void procurar() {
		Curso c = pesquisar(nome.get());
		fromEntity(c);
	}

	public void fromEntity(Curso c) {
		if (c != null) {
			id.set(c.getId());
			nome.set(c.getNome());
			codCurso.set(c.getCodCurso());
			nomeCoordenador.set(c.getNomeCoordenador());
			qtdAlunos.set(c.getQtdAlunos());
		} else {
			Alert a = new Alert(AlertType.INFORMATION, "Curso não encontrado", new ButtonType("Ok"));
			a.show();
		}

	}

	public String getId() {
		return this.id.get();
	}

	public void setId(String id) {
		this.id.set(id);
	}

	public StringProperty idProperty() {
		return this.id;
	}

	public String getNome() {
		return this.nome.get();
	}

	public void setNome(String nome) {
		this.nome.set(nome);
	}

	public StringProperty nomeProperty() {
		return this.nome;
	}

	public String getCodCurso() {
		return this.codCurso.get();
	}

	public void setCodCurso(String codCurso) {
		this.codCurso.set(codCurso);
	}

	public StringProperty codCursoProperty() {
		return this.codCurso;
	}

	public String getNomeCoordenador() {
		return this.nomeCoordenador.get();
	}

	public void setNomeCoordenador(String nomeCoordenador) {
		this.nomeCoordenador.set(nomeCoordenador);
	}

	public StringProperty nomeCoordenadorProperty() {
		return this.nomeCoordenador;
	}

	public String getQtdAlunos() {
		return this.qtdAlunos.get();
	}

	public void setQtdAlunos(String qtdAlunos) {
		this.qtdAlunos.set(qtdAlunos);
	}

	public StringProperty qtdAlunosProperty() {
		return this.qtdAlunos;
	}

}

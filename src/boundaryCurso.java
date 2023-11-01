import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class boundaryCurso extends Application{
	
	private TextField txtId;
	private TextField txtNome;
	private TextField txtCodCurso;
	private TextField txtNomeCoordenador;
	private TextField txtQtdAlunos;
	
	private ControllerCurso control = new ControllerCurso();

	@Override
	public void start(Stage stage) throws Exception {
		GridPane panel = new GridPane();
		panel.setVgap(30);
		panel.setHgap(30);
		
		Scene scn = new Scene(panel, 800, 600);
		
		 Label lblNome = new Label("Nome do curso: ");
		 txtNome = new TextField();
		 panel.add(lblNome, 1, 1);
		 panel.add(txtNome, 2, 1);
		 
		 Label lblId = new Label("Id do Curso: ");
		 txtId = new TextField();
		 panel.add(lblId, 1, 2);
		 panel.add(txtId, 2, 2);
		 
		 Label lblCodCurso = new Label("Cod. do Curso: ");
		 txtCodCurso = new TextField();
		 panel.add(lblCodCurso, 1, 3);
		 panel.add(txtCodCurso, 2, 3);
		 
		 Label lblNomeCoordenador = new Label("Nome do Coordenador do Curso: ");
		 txtNomeCoordenador = new TextField();
		 panel.add(lblNomeCoordenador, 1, 4);
		 panel.add(txtNomeCoordenador, 2, 4);
		 
		 Label lblQtdAlunos = new Label("Nome do Coordenador do Curso: ");
		 txtQtdAlunos = new TextField();
		 panel.add(lblQtdAlunos, 1, 4);
		 panel.add(txtQtdAlunos, 2, 4);
		 
		 Button btnSalvar = new Button("Salvar");
		 panel.add(btnSalvar, 1, 5);
	     Button btnPesquisar = new Button("Pesquisar");
	     panel.add(btnPesquisar, 2, 5);
	     
	     Bindings.bindBidirectional(control.idProperty(), txtId.textProperty());
	     Bindings.bindBidirectional(control.nomeProperty(), txtNome.textProperty());
	     Bindings.bindBidirectional(control.codCursoProperty(), txtCodCurso.textProperty());
	     Bindings.bindBidirectional(control.nomeCoordenadorProperty(), txtNomeCoordenador.textProperty());
	     Bindings.bindBidirectional(control.qtdAlunosProperty(), txtQtdAlunos.textProperty());
	     
	     btnSalvar.setOnMouseClicked( 
	             e-> { 
	                 control.salvarCurso();
	             }
	         );

	         btnPesquisar.setOnMousePressed(
	             e -> { 
	                 control.procurar();
	             }
	         );
		 
		 stage.setScene(scn);
		 stage.setTitle("Registro Cursos");
		 stage.show();
		 
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}

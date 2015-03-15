package converter.view;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class FormController extends Application {

    public Button importButton;
    public Button processButton;
    public Button exportButton;
    public TextArea inputTextArea;
    public TextArea outputTextArea;
    private Stage stage;

    /**
     * точка входа в приложение
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        String fxmlFile = "/Form/Form.fxml";
        FXMLLoader loader = new FXMLLoader();
        Parent root = (Parent) loader.load(getClass().getResourceAsStream(fxmlFile));
        stage.setTitle("Doc converter");
        stage.setScene(new Scene(root));
        this.stage = stage;
        this.stage.show();
    }

    /**
     * Этот метод вызывается по нажатию кнопки import
     * @param actionEvent
     * @throws IOException
     */
    public void importButtonPressed(ActionEvent actionEvent) throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("doc files", "*.docx", "*.doc", "*.odt"));
        File selectedFile = fileChooser.showOpenDialog(stage);
        if (selectedFile != null) {
            System.out.println(selectedFile.getAbsolutePath());
            XWPFDocument docx = new XWPFDocument(new FileInputStream(selectedFile));
            XWPFWordExtractor we = new XWPFWordExtractor(docx);
            String text = we.getText();
            inputTextArea.setText(text);
        }
    }

    /**
     * Этот метод вызывается по нажатию кнопки process
     * @param actionEvent
     * @throws IOException
     */
    public void processButtonPressed(ActionEvent actionEvent) {
        outputTextArea.setText("some processed text here");
    }

    /**
     * Этот метод вызывается по нажатию кнопки export
     * @param actionEvent
     * @throws IOException
     */
    public void exportButtonPressed(ActionEvent actionEvent) {

    }
}

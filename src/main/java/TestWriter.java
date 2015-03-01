import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestWriter {

    public static void main(String[] args) throws IOException {
        XWPFDocument document = new XWPFDocument();
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun tmpRun = paragraph.createRun();
        tmpRun.setText("test text");
        tmpRun.setFontSize(20);
        FileOutputStream fos = new FileOutputStream(new File("testFile.docx"));
        document.write(fos);
        fos.close();
//      ??
    }
}
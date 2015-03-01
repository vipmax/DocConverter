import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestReader {
    public static void main(String[] args) throws IOException {
        XWPFDocument docx = new XWPFDocument(new FileInputStream(new File("testFile.docx")));
        XWPFWordExtractor we = new XWPFWordExtractor(docx);
        System.out.println(we.getText());
    }
}
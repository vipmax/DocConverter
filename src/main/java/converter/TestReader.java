package converter;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestReader {
    public static void main(String[] args) throws IOException {
//        getText(/**/);
    }

    public static String getText(File file) throws IOException {
        XWPFDocument docx = new XWPFDocument(new FileInputStream(file));
        XWPFWordExtractor we = new XWPFWordExtractor(docx);

        return we.getText();
    }

}
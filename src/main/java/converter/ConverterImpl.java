package converter;

import converter.Converter;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by max on 15.03.2015.
 */
public class ConverterImpl implements Converter {



    @Override
    public File convert(File file) throws IOException {
        System.out.println("Convert  " + file.getAbsolutePath());
        if (file.getName().endsWith(".doc") || file.getName().endsWith(".docx")) {


            XWPFDocument docx = new XWPFDocument(new FileInputStream(file));
            XWPFWordExtractor we = new XWPFWordExtractor(docx);
            String text = we.getText();
            System.out.println(text);

            //some convert here

//            return new File()
        }

        if (file.getName().endsWith(".odt")) {

        }

        return null;
    }

    @Override
    public File unConvert(File file) {
        return null;
    }
}

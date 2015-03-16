package converter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by max on 01.03.2015.
 */
public interface Converter {
    /**
     * Из подробного файла в сокращенный файл
     * @param file файл который будет отконвертирован
     * @return
     */
    File convert(File file) throws IOException;

    /**
     * Из сокращенного файла в подробный файл
     * @param file
     * @return
     */
    File unConvert(File file);

}

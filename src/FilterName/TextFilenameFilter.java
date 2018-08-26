package FilterName;

import java.io.File;
import java.io.FilenameFilter;

public class TextFilenameFilter implements FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {
        if (name.endsWith(".txt")) {
            return true;
        }
        return false;
    }
}

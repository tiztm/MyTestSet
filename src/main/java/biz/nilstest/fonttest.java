package biz.nilstest;

import java.awt.*;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2017/4/28.
 */
public class fonttest {

    public static void main(String[] args) throws IOException, FontFormatException {
        File fs = new File("I:\\linkfonts\\fonts");
        File[] files = fs.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.endsWith("ttf")) return true;
                return false;
            }
        });
        for (File file : files) {
//            TTFParser parser = new TTFParser();
//            parser.parse(file.getAbsolutePath());
//            System.out.println("font name: " + parser.getFontName());

            Font f = Font.createFont(Font.TRUETYPE_FONT, file);
            String name = f.getName();
            System.out.println(name);
        }
    }
}

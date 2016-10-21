package biz.mysteam.util;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/10/19.
 */
public class ResourceUtil {

    /**
     * 第一：前面有 “   / ”
     * “ / ”代表了工程的根目录，例如工程名叫做myproject，“ / ”代表了myproject
     * me.class.getResourceAsStream("/com/x/file/myfile.xml");
     * 第二：前面没有 “   / ”
     * 代表当前类的目录
     * me.class.getResourceAsStream("myfile.xml");
     * me.class.getResourceAsStream("file/myfile.xml");
     * @param filePath
     * @return
     * @throws IOException
     */
    public static BufferedImage getImage(String filePath) throws IOException {
        //返回读取指定资源的输入流
        InputStream is=ResourceUtil.class.getResourceAsStream(filePath);

        BufferedImage bi = ImageIO.read(is);

        return bi;
    }
}

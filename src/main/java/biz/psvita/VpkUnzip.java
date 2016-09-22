package biz.psvita;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/9/1.
 */
public class VpkUnzip {


    public static String filePath = "D:\\111\\PCSH00119_FULLGAME_01.00.vpk";

    private static final String ebootName = "eboot.bin";

    private static final String scesysName = "sce_sys";

    private static final String iconName = "icon0.png";

    public static void Copy(String oldPath, String newPath) {
        try {
            int bytesum = 0;
            int byteread = 0;
            File oldfile = new File(oldPath);
            if (oldfile.exists()) {
                InputStream inStream = new FileInputStream(oldPath);
                FileOutputStream fs = new FileOutputStream(newPath);
                byte[] buffer = new byte[1444];
                int length;
                while ((byteread = inStream.read(buffer)) != -1) {
                    bytesum += byteread;
                    fs.write(buffer, 0, byteread);
                }
                inStream.close();
            }
        } catch (Exception e) {
            System.out.println("error  ");
            e.printStackTrace();
        }
    }


    public static int unzipFile() {
        File unzipFile = new File(filePath);


        if (!unzipFile.exists())
            return 1;

        String destDir = unzipFile.getParent();

        String name = unzipFile.getName();
        name = name.substring(0, name.lastIndexOf("."));

        //destDir = destDir;

        String destVpkFile = destDir + File.separator + name + File.separator + name + "_unpack" + ".vpk";

        String iconDest = destDir + File.separator + name + File.separator+"icon.png";
        destDir = destDir + File.separator + name + File.separator + name + "_unpack";
        try {
            zipUtil.unZip(filePath, destDir);
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }


        String ebootFile = destDir + File.separator + ebootName;

        String scesysFile = destDir + File.separator + scesysName;

        String iconFile = scesysFile + File.separator + iconName;


        Copy(iconFile,iconDest);


                String targetPathName = destDir + File.separator + "target" + File.separator;

        File targetPath = new File(targetPathName);


        targetPath.mkdir();

        File srcDir = new File(scesysFile);
        srcDir.renameTo(new File(targetPathName + srcDir.getName()));


        srcDir = new File(ebootFile);
        srcDir.renameTo(new File(targetPathName + srcDir.getName()));

        try {
            zipUtil.zip(targetPathName, destVpkFile);
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }

        return 0;
    }
}

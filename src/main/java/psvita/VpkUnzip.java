package psvita;

import java.io.File;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/9/1.
 */
public class VpkUnzip {


    public static String filePath = "D:\\111\\PCSH00119_FULLGAME_01.00.vpk";

    private static final String ebootName = "eboot.bin";

    private static final String scesysName = "sce_sys";


    public static int unzipFile() {
        File unzipFile = new File(filePath);


        if (!unzipFile.exists())
            return 1;

        String   destDir = unzipFile.getParent();

        String name = unzipFile.getName();
        name = name.substring(0,name.lastIndexOf("."));

        //destDir = destDir;

        String destVpkFile =destDir+File.separator+name+File.separator+name+"_unpack"+".vpk";


        destDir = destDir+File.separator+name+File.separator+name+"_unpack";
        try{
        zipUtil.unZip(filePath,destDir);} catch (Exception e) {
        e.printStackTrace();
        return 1;
    }


        String ebootFile = destDir+File.separator+ebootName;

        String scesysFile = destDir+File.separator+scesysName;


        String targetPathName = destDir+File.separator+"target"+File.separator;

        File targetPath = new File(targetPathName);


        targetPath.mkdir();

        File srcDir = new File(scesysFile);
        srcDir.renameTo(new File(targetPathName + srcDir.getName()));


        srcDir = new File(ebootFile);
        srcDir.renameTo(new File(targetPathName + srcDir.getName()));

        try {
            zipUtil.zip(targetPathName,destVpkFile);
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }

        return 0;
    }
}

package psvita;

import java.io.File;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/9/1.
 */
public class VpkUnzip {


    private static final String filePath = "D:\\PSV\\VPK\\111.vpk";


    //;
    //
    private static final String ebootName = "eboot.bin";

    private static final String scesysName = "sce_sys";

    public static void main(String[] args) {


        File unzipFile = new File(filePath);
        String   destDir = unzipFile.getParent();

        String name = unzipFile.getName();
        name = name.substring(0,name.lastIndexOf("."));

        String destVpkFile =destDir+File.separator+name+File.separator+unzipFile.getName();

        destDir = destDir+File.separator+name+File.separator+name;

        zipUtil.unZip(filePath,destDir);




                String ebootFile = destDir+File.separator+ebootName;

        String scesysFile = destDir+File.separator+scesysName;



        zipUtil.zip(ebootFile,scesysFile,destVpkFile);






    }
}

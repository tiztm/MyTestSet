package psvita;

        import java.io.File;
        import java.io.FileOutputStream;
        import java.io.InputStream;
        import java.util.Enumeration;

        import org.apache.tools.ant.Project;
        import org.apache.tools.ant.taskdefs.Zip;
        import org.apache.tools.ant.types.FileSet;
        import org.apache.tools.zip.ZipEntry;
        import org.apache.tools.zip.ZipFile;

public class zipUtil {


    public static void zip(String srcDirName,String destFile) throws Exception{

        File srcDir = new File(srcDirName);
        if (!srcDir.exists())
            throw new Exception(srcDirName + "不存在！");



        Project prj = new Project();
        Zip zip = new Zip();
        zip.setProject(prj);
        zip.setDestFile(new File(destFile));
        FileSet fileSet = new FileSet();

        fileSet.setProject(prj);
        fileSet.setDir(srcDir);

        zip.addFileset(fileSet);

        zip.execute();



        deleteDir(srcDir);
    }

    /**
     * 递归删除目录下的所有文件及子目录下所有文件
     * @param dir 将要删除的文件目录
     * @return boolean Returns "true" if all deletions were successful.
     *                 If a deletion fails, the method stops attempting to
     *                 delete and returns "false".
     */
    private static boolean deleteDir(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            //递归删除目录中的子目录下
            for (int i=0; i<children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }
        // 目录此时为空，可以删除
        return dir.delete();
    }



    public static void unZip(String zipFileName, String destDir)throws Exception {
        File unzipFile = new File(zipFileName);
        if (destDir == null || destDir.trim().length() == 0) {
            destDir = unzipFile.getParent();
            String name = unzipFile.getName();
            name = name.substring(0,name.lastIndexOf("."));
            destDir = destDir+File.separator+name+File.separator+name;

        }



        ZipFile zipFile = null;
        try {
            zipFile = new ZipFile(unzipFile, "GBK");
            Enumeration entries = zipFile.getEntries();
            while(entries.hasMoreElements()) {
                ZipEntry entry = (ZipEntry) entries.nextElement();
                File destFile = new File(destDir, entry.getName());

                if (entry.isDirectory()) {// 是目录，则创建之
                    destFile.mkdirs();
                } else {// 是文件
// 如果指定文件的父目录不存在,则创建之.
                    File parent = destFile.getParentFile();
                    if (parent != null && !parent.exists()) {
                        parent.mkdirs();
                    }

//执行解压
                    InputStream inputStream = zipFile.getInputStream(entry);
                    FileOutputStream fileOut = new FileOutputStream(destFile);
                    byte[] buf = new byte[1024];
                    int readedBytes;
                    while ((readedBytes = inputStream.read(buf)) > 0) {
                        fileOut.write(buf, 0, readedBytes);
                    }
                    fileOut.close();
                    inputStream.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw  e;
        } finally {
            try {
                if(zipFile != null){
                    zipFile.close();
                }
            } catch (Exception e) {
            }
        }
    }
}
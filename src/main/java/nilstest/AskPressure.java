package nilstest;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStream;
        import java.io.InputStreamReader;
        import java.io.OutputStream;
        import java.net.HttpURLConnection;
        import java.net.URL;

public class AskPressure {
    private static String url = "http://www.eqiyun.cn/";
    private static Integer error = 0;
    private static Integer threads = 800;
    private static Long startTime;
    public static void main(String[] args) {

        WorkThread[] workThreads = new WorkThread[threads];
        for(int i = 0; i < threads; i++){
            workThreads[i] = new WorkThread();
        }

        startTime = System.currentTimeMillis();

        for(int i = 0; i < threads; i++){
            workThreads[i].start();
        }

    }

    private static class WorkThread extends Thread {
        public void run(){
            long start = System.currentTimeMillis();
            long end = 0;
            try {

                for (int i = 0; i <100 ; i++) {
                    URL u = new URL(url);
                    HttpURLConnection  urlConn = (HttpURLConnection)u.openConnection();
                    urlConn.setUseCaches(false);
                    urlConn.setRequestProperty("Content-type", "text/html; charset=UTF-8");
                    urlConn.connect();
                    //System.out.printf( "小博士页面编码: %s\n", urlConn.getContentEncoding());
                    InputStream is = urlConn.getInputStream();
                    StringBuffer buffer = new StringBuffer();
                    readToBuffer(buffer, is);
                    end = System.currentTimeMillis();
                    System.out.printf("OK!");
                }


            } catch (Exception e) {
                synchronized(error){
                    error ++;
                }
                e.printStackTrace();
            }

            synchronized(threads){
                threads --;
                System.out.printf("还有%d个未完线程, 耗时%d毫秒\n", threads, (System.currentTimeMillis() - startTime));
                if(threads == 0){
                    System.out.printf("总耗时：%d毫秒\n", (System.currentTimeMillis() - startTime));
                    System.out.printf("连接失败：%d\n", error);
                }
            }
        }

        public void readToBuffer(StringBuffer buffer, InputStream is)
                throws IOException {
            String line; // 用来保存每行读取的内容
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(is));
            line = reader.readLine(); // 读取第一行
            while (line != null) { // 如果 line 为空说明读完了
                buffer.append(line); // 将读到的内容添加到 buffer 中
                buffer.append("\n"); // 添加换行符
                line = reader.readLine(); // 读取下一行
            }
        }
    }
}
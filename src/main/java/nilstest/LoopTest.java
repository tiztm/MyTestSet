package nilstest;

import com.rui.utils.DateSpanUtil;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by nilszhang on 2016/3/3.
 */
public class LoopTest {


    public static void main(String[] args) throws Exception {

        int all = 1*100*1024;
        Map<Integer,String> dMap = new HashMap<Integer, String>();
        Map<Integer,String> bMap = new HashMap<Integer, String>();
        for (int i = 0; i < all; i++) {
            dMap.put(i,"AAA"+i);
            bMap.put(i,"BBB"+i);
        }

        DateSpanUtil d = new DateSpanUtil();
        for (int i = 0; i < all; i++) {

        }


        d.getSpanDate();
    }
}

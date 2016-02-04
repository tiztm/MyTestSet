import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.rui.utils.DateSpanUtil;
import com.rui.utils.RandomStringUtil;


public class PiPeiCeShiMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateSpanUtil dsu = new DateSpanUtil();
		Map<String, String> m = new HashMap<String, String>();
		for (int i = 0; i < 1000000; i++) {
			
			m.put(RandomStringUtil.getRandomString(25), RandomStringUtil.getRandomString(32));
		}
		dsu.getSpanDate();
		Set<String> keySet = m.keySet();

		dsu.getSpanDate();
		for (String string : keySet) {
			m.get(string);
			dsu.getSpanDate();
		}
		
		
	}

}

import java.util.ArrayList;
import java.util.List;

public class T {
	public static void main(String[] args) {
		List<String> s = new ArrayList<String>();
		List<? extends Object> o = new ArrayList<Object>();
		o = s;
//		o.add("");
	}
}

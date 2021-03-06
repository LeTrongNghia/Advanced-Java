package Task3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Le Trong Nghia
 * @date Sep 19, 2016
 * @version 1.0
 * @description this is main class
 */
public class SortListString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String[] strings = {"xin", "chao", "cac", "ban", "toi", "ten", "la", "le", "trong", "nghia"};
			List<String> list = Arrays.asList(strings);
			
			System.out.println("-----------------List String----------------");
			list.forEach(i -> System.out.println(i + " "));
			
			System.out.println("------ List by sort allow short to long-------");
			Collections.sort(list, (String s1, String s2) -> s1.length() - s2.length());
			list.forEach(i -> System.out.println(i + " "));
			
			System.out.println("------ List by sort allow long to short-------");
			Collections.sort(list, (String s1, String s2) -> s2.length() - s1.length());
			list.forEach(i -> System.out.println(i + " "));
			
			System.out.println("------ List by sort allow alphabet-------");
			Collections.sort(list, (String s1, String s2) -> s1.compareTo(s2));
			list.forEach(i -> System.out.println(i + " "));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}

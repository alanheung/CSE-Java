import java.util.Set;

import com.mongodb.DB;
import com.mongodb.Mongo;


public class MongoDocs {

	public static void main(String[] args) throws Exception {
		Mongo m = new Mongo("localhost");
		DB db = m.getDB("Docs");
		Set<String> colls = db.getCollectionNames();
		System.out.println("Collections:");
		for (String s : colls) {
			System.out.println(s);
		}    
	}
}

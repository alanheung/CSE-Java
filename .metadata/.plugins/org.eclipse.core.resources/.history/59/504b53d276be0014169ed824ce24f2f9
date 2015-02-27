import java.util.Set;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;

public class Mongo2 {
  public static void main(String[] args) throws Exception {
    Mongo m = new Mongo("localhost");
    DB db = m.getDB("lib");
    Set<String> colls = db.getCollectionNames();
    System.out.println("Collections:");
    for (String s : colls) {
      System.out.println(s);
    }
    
    DBCollection collection = db.getCollection("book");

    BasicDBObject doc = new BasicDBObject();   
    doc.put("name", "Math 1");
    doc.put("price", 21.99);
    collection.insert(doc);
    
    BasicDBObject doc2 = new BasicDBObject();
    doc2.put("name", "Math 2");
    doc2.put("price", 30.99);
    collection.insert(doc2);
    
    BasicDBObject doc3 = new BasicDBObject();
    doc3.put("name", "Math 3");
    doc3.put("price", 35.99);
    collection.insert(doc3);
 

    System.out.println("One Document:");
    DBObject readDoc = collection.findOne();
    System.out.println(readDoc);
    
    System.out.println("All Documents:");
    DBCursor cur = collection.find();
    while (cur.hasNext()) {
      System.out.println(cur.next());
    } 
  }
}


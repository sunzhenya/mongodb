package com.kuvplus.test;

/**
 * @param args
 */

// TODO Auto-generated method stub
//mongodb java 调用例子2010-08-04 21:33  需要下载 mongo db 的jar包，我用的是1.4

import com.mongodb.*;
import com.mongodb.util.JSON;

import java.net.UnknownHostException;
import java.util.List;
import java.util.Set;

public class mongodbtest {

	public static void main(String[] args) throws UnknownHostException {

		Mongo m = new Mongo("198.56.183.239", 27017);	
		// 获取数据库对象,如果没mydb数据库，自动创建一个
		DB db = m.getDB("kuvplus");
		// 删除数据库对象
		/* m.dropDatabase("test"); */
		// 验证数据库用户名密码
		boolean auth = db.authenticate("kuvplus", "kuvplus".toCharArray());
		System.out.println("-----------" + auth);
		Set<String> colls = db.getCollectionNames();
		for (String s : colls) {
			System.out.println(s);
		}
		DBCollection coll = db.getCollection("article");
		System.out.println("集合"+coll);
		DBCursor d = coll.find();
		while (d.hasNext()) {
			 System.out.println(d.next());
		}
		System.out.println(d.count());
		System.out.println(d.getCursorId());
		System.out.println(JSON.serialize(d));
		/*DBObject user = new BasicDBObject();
		user.put("title", "孙振亚");
		user.put("content", "程序员");
		System.out.println("---"+coll.save(user));*/
		
		/*
		 * 
		 * DBCursor cur = users.find(); while (cur.hasNext()) {
		 * System.out.println(cur.next()); } System.out.println("000"+users);
		 */
		// 获取所有数据库名称列表
		/*
		 * for (String s : m.getDatabaseNames()) { System.out.println(s); }
		 */

		/*
		 * //增加一个用户,密码需转换成字符数据 // db.addUser("admin", "123456".toCharArray());
		 * // System.out.println(db.authenticate("admin",
		 * "123456".toCharArray()));
		 * 
		 * //验证数据库用户名密码 boolean auth = db.authenticate("admin",
		 * "123456".toCharArray()); /// System.out.println("-----------"+auth);
		 * 
		 * //得到一个集合，可对这个集合进行CRUD操作 DBCollection coll =
		 * db.getCollection("adminCollection"); // DBCollection coll =
		 * db.getCollection("userCollection");
		 * 
		 * //统计adminCollection集合中文档数量
		 * System.out.println("adminCollection object count-----"
		 * +coll.getCount());
		 * 
		 * //用到内部文档组装数据，然后用集合的insert方法插入 DBObject object = new BasicDBObject();
		 * object.put("picName", "d:\\pic\\test\\jpg");
		 * object.put("content","ssssssssss"); coll.insert(object); for (int i =
		 * 0; i < 10 ; i++) { coll.insert(new BasicDBObject().append("i", i)); }
		 * 
		 * 
		 * //使用findOne()查找集合中第一个文档 DBObject myDoc = coll.findOne();
		 * System.out.println("the first result----" + myDoc);
		 * 
		 * //查询,相当于字段--值的关系 DBObject dbObject = new BasicDBObject();
		 * dbObject.put("picName", "d:\\pic\\test\\jpg"); //
		 * dbObject.put("_id","c5605578414d384b5e4cc200"); DBCursor curs =
		 * coll.find(dbObject); while (curs.hasNext()) {
		 * System.out.println("query result-------" +
		 * curs.next().get("_id").toString()); }
		 * 
		 * //删除集合中所有的数据 DBObject toRemoveObject = new BasicDBObject();
		 * dbObject.put("i", 0); coll.remove(toRemoveObject);
		 * 
		 * //删除集合中某个文档数据 // DBObject toRemoveObject = new BasicDBObject();
		 * toRemoveObject.put("i", 5); DBObject ob =
		 * coll.findOne(toRemoveObject); if (ob != null) {
		 * System.out.println("---to remove-------" + ob); coll.remove(ob); }
		 * 
		 * // coll.remove(new BasicDBObject().append("i", 1));
		 * 
		 * //使用光标（cursor）来获取当前集合中全部文档 DBCursor cur = coll.find(); while
		 * (cur.hasNext()) { System.out.println("------" + cur.next()); }
		 * 
		 * //为当前集合相应属性创建索引,指定升序（1）或降序（-1）。 coll.createIndex(new
		 * BasicDBObject("user", 1));
		 * 
		 * //获取索引列表 List<DBObject> indexList = coll.getIndexInfo(); for
		 * (DBObject o : indexList) { System.out.println("index ---------" + o);
		 * }
		 * 
		 * //用DBObject存储JAVA对象 DBCollection collection =
		 * db.getCollection("MemberCollection"); //创建Java中的对象
		 */
	}
}

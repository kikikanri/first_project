package todo.dao;

import net.java.ao.EntityManager;

public class BaseDao {

	private static BaseDao instance = new BaseDao();

	private EntityManager manager;

	private BaseDao(){

		manager =
			new EntityManager("jdbc:mysql://localhost/todo", "root", "wings");
	}

	// インスタンス取得メソッド
	public static BaseDao getInstance() {
		return instance;
	}

	 public EntityManager getEntityManager(){
		return this.manager;
	}
}

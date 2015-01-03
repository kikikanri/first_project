package todo.dao;

import java.sql.SQLException;

public class TodoDao  {

	public boolean entry(String userid, String str){

		try {
			TodoList todo = BaseDao.getInstance().getEntityManager().create(TodoList.class);

			todo.setTodo(str);
			todo.setUserid(userid);

			todo.save();

			return true;

		} catch (SQLException e) {
		    System.out.println(e.getMessage());
		}
		return false;
	}

	// 全データ取得
	public TodoList[] getAll(String userid) {

		try {
			return BaseDao.getInstance()
				.getEntityManager().find(TodoList.class, "userid=? and valid=?", userid, 1);

		} catch (SQLException e) {
		    System.out.println(e.getMessage());
		}
		return null;
	}

	// データ更新
	public void setFinish(String id)  {

		TodoList todo = BaseDao.getInstance().getEntityManager().get(TodoList.class,Integer.valueOf(id));

		todo.setValid(0);
		todo.save();
	}

}

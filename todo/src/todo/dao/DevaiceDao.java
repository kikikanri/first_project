package todo.dao;

import java.sql.SQLException;

public class DevaiceDao  {

	public boolean entry(String userid, String str){

		try {
			DevaiceList devaice = BaseDao.getInstance().getEntityManager().create(DevaiceList.class);

			devaice.setTodo(str);
			devaice.setUserid(userid);

			devaice.save();

			return true;

		} catch (SQLException e) {
		    System.out.println(e.getMessage());
		}
		return false;
	}

	// 全データ取得
	public DevaiceList[] getAllDevices() {

		try {
			return BaseDao.getInstance()
				.getEntityManager().find(DevaiceList.class, "userid=?");

		} catch (SQLException e) {
		    System.out.println(e.getMessage());
		}
		return null;
	}

	// データ更新
	public void setFinish(String id)  {

		DevaiceList todo = BaseDao.getInstance().getEntityManager().get(DevaiceList.class,Integer.valueOf(id));

		todo.setValid(0);
		todo.save();
	}

}

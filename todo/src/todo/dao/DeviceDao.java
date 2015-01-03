package todo.dao;

import java.sql.SQLException;

public class DeviceDao  {

//	public boolean entry(String userid, String str){
//
//		try {
//			DeviceList devaice = BaseDao.getInstance().getEntityManager().create(DeviceList.class);
//
//			devaice.setTodo(str);
//			devaice.setUserid(userid);
//
//			devaice.save();
//
//			return true;
//
//		} catch (SQLException e) {
//		    System.out.println(e.getMessage());
//		}
//		return false;
//	}

	// 全データ取得
	public DeviceList[] getAllDevice() {

		try {
			return BaseDao.getInstance()
				.getEntityManager().find(DeviceList.class, "userid=?");

		} catch (SQLException e) {
		    System.out.println(e.getMessage());
		}
		return null;
	}

//	// データ更新
//	public void setFinish(String id)  {
//
//		DeviceList todo = BaseDao.getInstance().getEntityManager().get(DeviceList.class,Integer.valueOf(id));
//
//		todo.setValid(0);
//		todo.save();
//	}

}

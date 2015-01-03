package todo.dao;

import java.sql.SQLException;

public class DevicesDao  {

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
	public Devices[] getAllDevice() {

		try {
			return BaseDao.getInstance()
				.getEntityManager().find(Devices.class);

		} catch (SQLException e) {
			e.printStackTrace();
		    System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
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

package todo.dao;

import java.sql.SQLException;
import java.util.Date;

public class DevicesDao  {

	public boolean entry(String deviceid, String devicenm, String os, String office, String other1){

		try {
			Date createdate = new Date();
			Date updatedate = new Date();

			Devices device = BaseDao.getInstance().getEntityManager().create(Devices.class);

			device.setNo(deviceid);
			device.setDevicenm(devicenm);
			device.setOs(os);
			device.setOffice(office);
			device.setOther1(other1);
			device.setCreateDate(createdate);
			device.setUpdateDate(updatedate);

			device.save();

			return true;

		} catch (SQLException e) {
		    System.out.println(e.getMessage());
		}
		return false;
	}

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
//		Devices todo = BaseDao.getInstance().getEntityManager().get(Devices.class,Integer.valueOf(id));
//
//		todo.setValid(0);
//		todo.save();
//	}

}

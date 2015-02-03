package todo.dao;

import java.sql.SQLException;
import java.util.Date;

import net.java.ao.EntityManager;
import net.java.ao.Query;

public class DevicesDao  {

	// 追加
	public boolean entry(String deviceid, String devicenm, String os, String office, String other1){

		try {
			Date createdate = new Date();
			Date updatedate = new Date();

			Devices device = BaseDao.getInstance().getEntityManager().create(Devices.class);

			device.setDeviceid(deviceid);
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
		    e.printStackTrace();
		} catch (Exception ee){
			ee.printStackTrace();
		}
		return false;
	}

	// 更新
	public boolean update(String deviceid, String devicenm, String os, String office, String other1){

		try {

			Date createdate = new Date();
			Date updatedate = new Date();

			EntityManager manager = BaseDao.getInstance().getEntityManager();
			Devices[] device = manager.find(Devices.class, Query.select().where("deviceid = ?", deviceid));
			device[0].setDeviceid(deviceid);
			device[0].setDevicenm(devicenm);
			device[0].setOs(os);
			device[0].setOffice(office);
			device[0].setOther1(other1);
			device[0].setCreateDate(createdate);
			device[0].setUpdateDate(updatedate);

			device[0].save();

		} catch (SQLException e) {
		    System.out.println(e.getMessage());
		    e.printStackTrace();
		} catch (Exception ee){
			ee.printStackTrace();
		}
		return false;

	}

	// 削除(物理削除)
	public boolean delete(String deviceid) throws SQLException{

		try {

			EntityManager manager = BaseDao.getInstance().getEntityManager();
			Devices[] devices = manager.find(Devices.class, Query.select().where("deviceid = ?", deviceid));
			manager.delete(devices);

			return true;

		} catch (SQLException e) {
		    System.out.println(e.getMessage());
		    e.printStackTrace();
		} catch (Exception ee){
			ee.printStackTrace();
		}
		return false;
	}

	// 検索
	public Devices[] getAllDevice() throws SQLException{

		try {

			EntityManager manager = BaseDao.getInstance().getEntityManager();

			//return BaseDao.getInstance().getEntityManager().find(Devices.class, Query.select().where("deleteflg = ?", "0"));
			return BaseDao.getInstance().getEntityManager().find(Devices.class);

		} catch (SQLException e) {
		    System.out.println(e.getMessage());
		    e.printStackTrace();
		} catch (Exception ee){
			ee.printStackTrace();
		}
		return null;

	}

	// 検索(deviceid)
	public boolean isDeviceIDExist(String deviceid) throws SQLException{

		try {

			EntityManager manager = BaseDao.getInstance().getEntityManager();

			Devices[] deviceids = BaseDao.getInstance().getEntityManager().find(Devices.class, Query.select().where("deviceid = ?", deviceid));

			if(deviceids.length > 0){
				return true;
			}else{
				return false;
			}

		} catch (SQLException e) {
		    System.out.println(e.getMessage());
		    e.printStackTrace();
		} catch (Exception ee){
			ee.printStackTrace();
		}
		return false;

	}


}

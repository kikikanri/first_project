package todo.dao;

import java.sql.SQLException;
import java.util.Date;

import net.java.ao.EntityManager;
import net.java.ao.Query;

public class ResourcesDao  {

	// 追加
	public boolean entry(String user, Date takeoutdate, String schedulereturndate,
			String deviceid, String devicenm){

		try {
			Date createdate = new Date();
			Date updatedate = new Date();

			Resources resources = BaseDao.getInstance().getEntityManager().create(Resources.class);

			resources.setUser(user);
			resources.setTakeoutDate(takeoutdate);
			resources.setScheduleReturnDate(schedulereturndate);
			resources.setDeviceid(deviceid);
			resources.setDevicenm(devicenm);
			resources.setCreateDate(createdate);
			resources.setUpdateDate(updatedate);

			resources.save();

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
	public boolean update(int no, String returndate){

		try {

			Date updatedate = new Date();

			EntityManager manager = BaseDao.getInstance().getEntityManager();
			Resources[] resources = manager.find(Resources.class, Query.select().where("no = ?", no));
			resources[0].setReturnDate(returndate);
			resources[0].setReturnFlg("1");
			resources[0].setUpdateDate(updatedate);

			resources[0].save();

		} catch (SQLException e) {
		    System.out.println(e.getMessage());
		    e.printStackTrace();
		} catch (Exception ee){
			ee.printStackTrace();
		}
		return false;

	}

	// 削除(物理削除)
	public boolean delete(String no) throws SQLException{

		try {

			EntityManager manager = BaseDao.getInstance().getEntityManager();
			Resources[] resources = manager.find(Resources.class, Query.select().where("no = ?", no));
			manager.delete(resources);

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
	public Resources[] getAllResources() throws SQLException{

		try {

			EntityManager manager = BaseDao.getInstance().getEntityManager();

			return BaseDao.getInstance().getEntityManager().find(Resources.class);

		} catch (SQLException e) {
		    System.out.println(e.getMessage());
		    e.printStackTrace();
		} catch (Exception ee){
			ee.printStackTrace();
		}
		return null;

	}

}

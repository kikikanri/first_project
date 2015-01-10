package todo.dao;

import java.sql.SQLException;

public class ResourcesDao  {
//	public boolean entry(String resourceid, String resourcenm, String os, String office, String other1){
//
//		try {
//			Date createdate = new Date();
//			Date updatedate = new Date();
//
//			Resources resource = BaseDao.getInstance().getEntityManager().create(Resources.class);
//
//			resource.setNo(resourceid);
//
//			resource.setCreateDate(createdate);
//			resource.setUpdateDate(updatedate);
//
//			resource.save();
//
//			return true;
//
//		} catch (SQLException e) {
//		    System.out.println(e.getMessage());
//		}
//		return false;
//	}

	// 全データ取得
	public Resources[] getAllresource() {

		try {
			return BaseDao.getInstance()
				.getEntityManager().find(Resources.class);

		} catch (SQLException e) {
			e.printStackTrace();
		    System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

//	// データ更新
//	public void setFinish(String resourceid, String os, String office, String other1)  {
//
//		Date updatedate = new Date();
//		Resources resource = BaseDao.getInstance().getEntityManager()
//				.get(Resources.class,Integer.valueOf(resourceid));
//
//		resource.setUpdateDate(updatedate);
//
//		resource.save();
//	}
}

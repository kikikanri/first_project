package todo.dao;

import java.util.Date;

import net.java.ao.Entity;
import net.java.ao.schema.Default;
import net.java.ao.schema.PrimaryKey;

public interface Resources extends Entity  {

	public int getID();

	@PrimaryKey
	@Default("")
	public String getNo();
	public void setNo(String no);

	@Default("")
	public String getUser();
	public void setUser(String user);

	@Default("")
	public Date getTakeoutdate();
	public void setTakeoutdate(Date takeoutdate);

	@Default("")
	public Date getSchedulereturndate();
	public void setSchedulereturndate(Date schedulereturndate);

	@Default("")
	public String getDeviceid();
	public void setDeviceid(String deviceid);

	@Default("")
	public String getDevicenm();
	public void setDevicenm(String devicenm);

	@Default("")
	public Date getReturndate();
	public void setReturndate(Date returndate);

	@Default("0")
	public int getReturnFlg();
	public void setReturnFlg(String retunflg);

	@Default("")
	public Date getCreateDate();
	public void setCreateDate(Date createdate);

	@Default("CURRENT_TIMESTAMP")
	public Date getUpdateDate();
	public void setUpdateDate(Date updatedate);

	@Default("0")
	public int getDeleteFlg();
	public void setDeleteFlg(String deleteflg);

}

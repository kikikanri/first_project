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
	public String getTakeoutdate();
	public void setTakeoutdate(String takeoutdate);

	@Default("")
	public String getSchedulereturndate();
	public void setSchedulereturndate(String schedulereturndate);

	@Default("")
	public String getDeviceid();
	public void setDeviceid(String deviceid);

	@Default("")
	public String getDevicenm();
	public void setDevicenm(String devicenm);

	@Default("")
	public String getReturndate();
	public void setReturndate(String returndate);

	@Default("")
	public String getRreturnflg();
	public void setRreturnflg(String returnflg);

	@Default("")
	public Date getCreateDate();
	public void setCreateDate(Date createdate);

	@Default("CURRENT_TIMESTAMP")
	public Date getUpdateDate();
	public void setUpdateDate(Date updatedate);

	@Default("")
	public String getDeleteflg();
	public void setDeleteflg(String deleteflg);
}

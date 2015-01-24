package todo.dao;

import java.util.Date;

import net.java.ao.Entity;
import net.java.ao.schema.Default;
import net.java.ao.schema.PrimaryKey;

public interface Devices extends Entity  {

	public int getID();

	@PrimaryKey
	@Default("")
	public String getNo();
	public void setNo(String no);

	@Default("")
	public String getDeviceid();
	public void setDeviceid(String deviceid);

	@Default("")
	public String getDevicenm();
	public void setDevicenm(String devicenm);

	@Default("")
	public String getOs();
	public void setOs(String os);

	@Default("")
	public String getOffice();
	public void setOffice(String office);

	@Default("")
	public String getOther1();
	public void setOther1(String other1);

	@Default("")
	public Date getCreateDate();
	public void setCreateDate(Date createdate);

	@Default("CURRENT_TIMESTAMP")
	public Date getUpdateDate();
	public void setUpdateDate(Date updatedate);


}

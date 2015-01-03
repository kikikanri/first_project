package todo.dao;

import net.java.ao.Entity;
import net.java.ao.schema.Default;
import net.java.ao.schema.PrimaryKey;

public interface Devices extends Entity  {

	public int getID();

	@PrimaryKey
	@Default("")
	public String getNo();
	public void setNo(String no);

	@PrimaryKey
	@Default("")
	public String getDeviceid();
	public void setDeviceid(String deviceid);

	@Default("")
	public String getDevicenm();
	public void setDevicenm(String deviceid);

	@Default("")
	public String getOs();
	public void setOs(String os);

	@Default("")
	public String getOffice();
	public void setOffice(String office);

//	@Default("CURRENT_TIMESTAMP")
//	public Date getDeadline();
//	public void setDeadline(Date deadline);
//
//	@Default("")
//	public String getTodo();
//	public void setTodo(String todo);
//
//	@Default("1")
//	public int getValid();
//	public void setValid(int valid);

}

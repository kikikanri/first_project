package todo.dao;

import net.java.ao.Entity;
import net.java.ao.schema.Default;

public interface DeviceList extends Entity  {

	@Default("")
	public String getDeviceid();
	public void setDeviceid(String userid);

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

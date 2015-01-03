package todo.dao;

import java.util.Date;

import net.java.ao.Entity;
import net.java.ao.schema.*;

public interface TodoList extends Entity  {

	@Default("")
	public String getUserid();
	public void setUserid(String userid);

	@Default("CURRENT_TIMESTAMP")
	public Date getDeadline();
	public void setDeadline(Date deadline);

	@Default("")
	public String getTodo();
	public void setTodo(String todo);

	@Default("1")
	public int getValid();
	public void setValid(int valid);

}

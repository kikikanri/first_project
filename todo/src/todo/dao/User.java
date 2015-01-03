package todo.dao;
import net.java.ao.Entity;
import net.java.ao.schema.Default;
import net.java.ao.schema.Unique;

public interface User extends Entity {

	@Unique
	@Default("")
	public String getUserid();
	public void setUserid(String userid);

	@Default("")
    public String getPassword();
	public void setPassword(String password);

	@Default("")
    public String getUsername();
	public void setUsername(String username);
}

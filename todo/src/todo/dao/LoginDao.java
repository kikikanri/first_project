package todo.dao;

import java.sql.SQLException;

public class LoginDao  {

	private String username;

	public boolean confirm(String userid, String password){

		try {
			User[] user = BaseDao.getInstance().getEntityManager().find(User.class,
					"userid=? and password=?",userid,password );

			if ( user.length>0 ){

				this.username = user[0].getUsername();

				return true;
			}

		} catch (SQLException e) {
		    System.out.println(e.getMessage());
		}
		return false;
	}

	public boolean add(String userid, String password,String username){

		try {
			if ( BaseDao.getInstance().getEntityManager().count(
					User.class,"userid=?",userid ) == 0 ){
				User user = BaseDao.getInstance()
					.getEntityManager().create(User.class);
				user.setUserid(userid);
				user.setPassword(password);
				user.setUsername(username);
				user.save();
				return true;
			}

		} catch (SQLException e) {
		    System.out.println(e.getMessage());
		}
		return false;
	}

	public String getUsername(){
		return this.username;
	}

}

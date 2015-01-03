package todo.dao;

import java.sql.SQLException;

import net.java.ao.EntityManager;

public class Migrate {

	public static void main(String[] args) {

		try {
			EntityManager manager =
				new EntityManager("jdbc:mysql://localhost/todo", "root", "wings");

			// テーブル作成
			manager.migrate(TodoList.class, User.class);

		} catch (SQLException e) {
		    System.out.println(e.getMessage());
		}


	}

}

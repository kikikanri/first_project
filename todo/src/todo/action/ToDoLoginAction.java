package todo.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.InterceptorRefs;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import todo.dao.LoginDao;

@InterceptorRefs( {
	@InterceptorRef(value = "scopedModelDriven", params = { "scope","session" }),
	@InterceptorRef("defaultStack")
})
@Results({
	@Result(name = "input", location = "login.jsp"),
    @Result(name = "todo", location = "todo", type = "chain")

})
public class ToDoLoginAction extends ToDoBaseAction {

	private static final long serialVersionUID = 1L;

	// バリデーション
	@Override
	public void validate() {

		// ログイン済み?
		if (this.user.getState() == 1) return;

		if (this.user.getUserid() == null
				|| (this.user.getUserid().length() == 0 && this.user
						.getPassword().length() == 0)) {
			addActionError("ログインしてください");
			return;
		}

		if (this.user.getUserid().length() == 0) {
			addActionError("ユーザーIDを入力してください。");
		}
		if (this.user.getPassword().length() == 0) {
			addActionError("パスワードを入力してください。");
		}
	}

	//
	@Action("/login")
	public String excute() throws Exception {

		LoginDao login = new LoginDao();
System.out.println("by itabashi 実行テスト");
		if (login.confirm(this.user.getUserid(), this.user.getPassword())) {

			this.user.setUsername(login.getUsername());

			this.user.setState(1);
		}
		else {
			addActionError("ユーザーIDの登録がないか、パスワードが異なっています。");
			this.user.setPassword("");
	   		return "input";
		}
   		return "todo";
	}
}

package todo.action;

import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.InterceptorRefs;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@InterceptorRefs({
	@InterceptorRef(value="scopedModelDriven",params={"scope","session"}),
	@InterceptorRef("defaultStack")
})
@Results({
	  @Result(name="input", location="usrentry.jsp"),
	  @Result(name="success", location ="usrentry.jsp" )
})
public class ToDoUserEntryAction extends ToDoBaseAction {

	private static final long serialVersionUID = 1L;

	@Override
	public void validate() {

//		if (this.user.getUserid() == null
//				|| (this.user.getUserid().length() == 0 &&
//					this.user.getPassword().length() == 0 &&
//					this.user.getUsername().length() == 0)) {
//			addActionError("ユーザー情報を入力してください");
//			return;
//		}
//
//		if (this.user.getUserid().length() == 0) {
//			addActionError("ユーザーIDを入力してください。");
//		}
//		if (this.user.getPassword().length() == 0) {
//			addActionError("パスワードを入力してください。");
//		}
//		if (this.user.getUsername().length() == 0) {
//			addActionError("ユーザー名を入力してください。");
//		}
	}

//	@Action(value="/usrentryexec")
//	public String usrentry() throws Exception {
//
//		this.user.setUsername( FixString.encoding(this.user.getUsername()));
//
//		LoginDao login = new LoginDao();
//
//		if (login.add(this.user.getUserid(), this.user.getPassword(),this.user.getUsername())) {
//			addActionMessage("ユーザーの登録を完了しました。");
//			this.user.setState(1);
//		}
//		else {
//			addActionMessage("このユーザーIDはすでに登録されていますので、別のIDを入力してください。");
//			this.user.setUserid("");
//			this.user.setPassword("");
//			this.user.setUsername("");
//		}
//		return "success";
//	}

}

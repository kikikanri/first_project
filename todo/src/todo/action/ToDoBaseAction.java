package todo.action;

import todo.dao.LoginModel;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;

public class ToDoBaseAction extends ActionSupport implements
		ScopedModelDriven<LoginModel> {

	private static final long serialVersionUID = 1L;

	protected LoginModel user; // LoginModelクラス
	private String scopeKey; // セッションでのModelオブジェクト識別キー

	@Override
	public void validate() {

		// ログイン済み?
		if (this.user.getState() != 1) {
			addActionError("ログインしてください");
		}
	}

	@Override
	public LoginModel getModel() {
		return user;
	}

	@Override
	public void setModel(LoginModel model) {
		this.user = model;
	}

	@Override
	public String getScopeKey() {
		return this.scopeKey;
	}

	@Override
	public void setScopeKey(String key) {
		this.scopeKey = key;
	}

}

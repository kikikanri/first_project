package todo.action;

import todo.dao.DeviceModel;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;

public class ToDoBaseAction extends ActionSupport implements
		ScopedModelDriven<DeviceModel> {

	private static final long serialVersionUID = 1L;

	protected DeviceModel user; // LoginModelクラス
	private String scopeKey; // セッションでのModelオブジェクト識別キー

	@Override
	public void validate() {

//		// ログイン済み?
//		if (this.user.getState() != 1) {
//			addActionError("ログインしてください");
//		}
	}

	@Override
	public DeviceModel getModel() {
		return user;
	}

	@Override
	public void setModel(DeviceModel model) {
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

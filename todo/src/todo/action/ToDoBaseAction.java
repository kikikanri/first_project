package todo.action;

import todo.dao.DevicesModel;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;

public class ToDoBaseAction extends ActionSupport implements
		ScopedModelDriven<DevicesModel> {

	private static final long serialVersionUID = 1L;

	protected DevicesModel dev; // LoginModelクラス
	private String scopeKey; // セッションでのModelオブジェクト識別キー

	@Override
	public void validate() {

	}

	@Override
	public DevicesModel getModel() {
		return dev;
	}

	@Override
	public void setModel(DevicesModel model) {
		this.dev = model;
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

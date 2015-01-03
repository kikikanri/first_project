package todo.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.InterceptorRefs;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import todo.dao.Devices;
import todo.dao.DevicesDao;

@InterceptorRefs({
	@InterceptorRef(value="scopedModelDriven",params={"scope","session"}),
	@InterceptorRef("defaultStack")
})
@Results({
	  @Result(name="input", location="login.jsp"),
	  @Result(name="success", location ="list.jsp" )
})
public class ToDoAction extends ToDoBaseAction {

	private static final long serialVersionUID = 1L;

//	private String todoStr;		// To-Do追加データ用
//	private String todoid[];	// To-Do更新用

//	// To-Do一覧
//	public DeviceList[] getDeviceList() {
//		DeviceDao dev = new DeviceDao();
//   	    return dev.getAllDevice();
//	}

	public Devices[] getDeviceList() {
		DevicesDao dev = new DevicesDao();
   	    return dev.getAllDevice();
	}

	// メイン画面
	@Action("/admin")
	public String excute() throws Exception {
   		return "success";
	}

//	// ToDo追加
//	@Action("/entryexec")
//	public String entryexec() throws Exception {
//
//		if ( this.getTodoStr()==null ||
//				this.getTodoStr().length()==0)
//	   		return "success";
//
//		if (this.getTodoStr().length()>80) {
//			addActionMessage("文字数オーバーです");
//	   		return "success";
//		}
//		this.setTodoStr( FixString.encoding(this.getTodoStr()));
//
//	    TodoDao todo = new TodoDao();
//	    todo.entry( this.user.getUserid(), this.getTodoStr() );
//	    this.setTodoStr("");
//   		return "success";
//	}

//	// ToDo更新
//	@Action("/finish")
//	public String finish() throws Exception {
//
//	    TodoDao todo = new TodoDao();
//	    if (this.getTodoid() != null ) {
//	    	for ( String id : this.getTodoid() ) {
//	    		todo.setFinish(id);
//	    	}
//	    }
//   		return "success";
//	}
//
//	// データ更新用
//	public void setTodoid( String [] todoid ) {
//		this.todoid = todoid;
//	}
//	public String [] getTodoid() {
//		return this.todoid;
//	}
//
//	// データ追加用
//	public String getTodoStr() {
//		return this.todoStr;
//	}
//	public void setTodoStr(String str) {
//	    this.todoStr = str;
//	}

}

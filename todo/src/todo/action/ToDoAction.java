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

	private String deviceid;
	private String devicenm;
	private String os;
	private String office;
	private String other1;

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
	@Action("/entryexec")
	public String entryexec() throws Exception {

	    DevicesDao todo = new DevicesDao();

	    todo.entry( this.getDeviceid(), this.getDevicenm(), this.getOs(), this.getOffice(), this.getOther1() );
   		return "success";
	}

	public String getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}

	public String getDevicenm() {
		return devicenm;
	}

	public void setDevicenm(String devicenm) {
		this.devicenm = devicenm;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getOther1() {
		return other1;
	}

	public void setOther1(String other1) {
		this.other1 = other1;
	}

//	// ToDo更新
//	@Action("/finish")
//	public String finish() throws Exception {
//
//	    DevicesDao todo = new DevicesDao();
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

}

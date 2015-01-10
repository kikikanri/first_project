package todo.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.InterceptorRefs;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import todo.dao.Resources;
import todo.dao.ResourcesDao;

import com.opensymphony.xwork2.ActionSupport;

@InterceptorRefs({
	@InterceptorRef(value="scopedModelDriven",params={"scope","session"}),
	@InterceptorRef("defaultStack")
})
@Results({
	  @Result(name="input", location="login.jsp"),
	  @Result(name="success", location ="list.jsp" )
})
public class ResourcesAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getTakeoutdate() {
		return takeoutdate;
	}

	public void setTakeoutdate(String takeoutdate) {
		this.takeoutdate = takeoutdate;
	}

	public String getSchedulereturndate() {
		return schedulereturndate;
	}

	public void setSchedulereturndate(String schedulereturndate) {
		this.schedulereturndate = schedulereturndate;
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

	public String getReturndate() {
		return returndate;
	}

	public void setReturndate(String returndate) {
		this.returndate = returndate;
	}

	public String getReturnflg() {
		return returnflg;
	}

	public void setReturnflg(String returnflg) {
		this.returnflg = returnflg;
	}

	public String getCreatedate() {
		return createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

	public String getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}

	public String getDeleteflg() {
		return deleteflg;
	}

	public void setDeleteflg(String deleteflg) {
		this.deleteflg = deleteflg;
	}

	private String no;
	private String user;
	private String takeoutdate;
	private String schedulereturndate;
	private String deviceid;
	private String devicenm;
	private String returndate;
	private String returnflg;
	private String createdate;
	private String updatedate;
	private String deleteflg;

//	// To-Do一覧
//	public DeviceList[] getDeviceList() {
//		DeviceDao dev = new DeviceDao();
//   	    return dev.getAllDevice();
//	}

	public Resources[] getResourcesList() {
		ResourcesDao dev = new ResourcesDao();
   	    return dev.getAllresource();
	}

	// メイン画面
	@Action("/resources")
	public String excute() throws Exception {
   		return "success";
	}

//	// ToDo追加
//	@Action("/entryexec")
//	public String entryexec() throws Exception {
//
//	    DevicesDao todo = new DevicesDao();
//
//	    todo.entry( this.getDeviceid(), this.getCreatedate(), this.getOs(), this.getOffice(), this.getOther1() );
//   		return "success";
//	}

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

package todo.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.InterceptorRefs;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import todo.dao.Devices;
import todo.dao.DevicesDao;

import com.opensymphony.xwork2.ActionSupport;

@InterceptorRefs({
	@InterceptorRef(value="scopedModelDriven",params={"scope","session"}),
	@InterceptorRef("defaultStack")
})
@Results({
	  @Result(name="success", location ="list.jsp" ),
	  @Result(name = "top",
	  	type = "redirectAction",
	            params = {
                "actionName" , "admin"
          }
	  	),
})
public class ToDoAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String deviceid;
	private String devicenm;
	private String os;
	private String office;
	private String other1;

	public Devices[] getDeviceList() throws Exception{
		DevicesDao dev = new DevicesDao();
   	    return dev.getAllDevice();
	}

	// メイン画面
	@Action("/admin")
	public String excute() throws Exception {
   		return "success";
	}

	// 追加
	@Action("/entryexec")
	public String entryexec() throws Exception {

	    DevicesDao todo = new DevicesDao();

	    if(todo.isDeviceIDExist(this.getDeviceid())){
	    	// メッセージセット
	    	addActionError("IDありますよ");
	    	addActionMessage("IDありますよ");
	    	return "success";
	    }

	    todo.entry( this.getDeviceid(), this.getDevicenm(), this.getOs(), this.getOffice(), this.getOther1() );
   		return "top";
	}

	// 更新
	@Action("/updateexec")
	public String updateexec() throws Exception {

	    DevicesDao todo = new DevicesDao();

	    todo.update( this.getDeviceid(), this.getDevicenm(), this.getOs(), this.getOffice(), this.getOther1() );
   		return "top";
	}

	// 削除
	@Action("/deleteexec")
	public String deleteexec() throws Exception {

	    DevicesDao todo = new DevicesDao();

	    todo.delete( this.getDeviceid());
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

}

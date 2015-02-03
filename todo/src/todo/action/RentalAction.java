package todo.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import todo.dao.Devices;
import todo.dao.DevicesDao;
import todo.dao.Resources;
import todo.dao.ResourcesDao;

import com.opensymphony.xwork2.ActionSupport;

@Results({
	  @Result(name="success", location ="rentallist.jsp" ),
	  @Result(name = "top",
	  	type = "redirectAction",
	            params = {
                "actionName" , "main"
          }
	  	),
})
public class RentalAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String user;
	private String takeoutdate;
	private String schedulereturndate;
	private String deviceid;
	private String returndate;

	public Resources[] getResourceList() throws Exception{
		ResourcesDao res = new ResourcesDao();
   	    return res.getAllResources();
	}

	public Devices[] getDeviceList() throws Exception{
		DevicesDao dev = new DevicesDao();
   	    return dev.getAllDevice();
	}

	// メイン画面
	@Action("/main")
	public String excute() throws Exception {
   		return "success";
	}

//	// 追加
//	@Action("/rentryexec")
//	public String entryexec() throws Exception {
//
//    	this.setDeviceid(FixString.encoding(deviceid));
//    	this.setDevicenm(FixString.encoding(devicenm));
//    	this.setOs(FixString.encoding(os));
//    	this.setOffice(FixString.encoding(office));
//    	this.setOther1(FixString.encoding(other1));
//
//    	if(!checkInputForm()){
//    		return "success";
//    	}
//
//
//	    DevicesDao todo = new DevicesDao();
//
//	    if(todo.isDeviceIDExist(this.getDeviceid())){
//	    	// メッセージセット
//	    	addActionError("端末IDは既に存在しています。");
//
//	    	return "success";
//	    }
//
//	    boolean result = todo.entry( this.getDeviceid(), this.getDevicenm(), this.getOs(), this.getOffice(), this.getOther1() );
//   		return "top";
//	}
//
//	// 更新
//	@Action("/rupdateexec")
//	public String updateexec() throws Exception {
//
//    	this.setDeviceid(FixString.encoding(deviceid));
//    	this.setDevicenm(FixString.encoding(devicenm));
//    	this.setOs(FixString.encoding(os));
//    	this.setOffice(FixString.encoding(office));
//    	this.setOther1(FixString.encoding(other1));
//
//	    DevicesDao todo = new DevicesDao();
//
//	    boolean result = todo.update( this.getDeviceid(), this.getDevicenm(), this.getOs(), this.getOffice(), this.getOther1() );
//   		return "top";
//	}
//
//	// 削除
//	@Action("/rdeleteexec")
//	public String deleteexec() throws Exception {
//
//    	this.setDeviceid(FixString.encoding(deviceid));
//
//	    DevicesDao todo = new DevicesDao();
//
//	    boolean result = todo.delete( this.getDeviceid());
//   		return "top";
//	}
//
//	// checkForm
//	private boolean checkInputForm() throws Exception {
//
//		// deviceid
//		if(StringUtils.isNullOrEmpty(deviceid)){
//			addActionError("端末NOは入力必須です。");
//			return false;
//		}
//
//
//		return true;
//	}

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

	public String getReturndate() {
		return returndate;
	}

	public void setReturndate(String returndate) {
		this.returndate = returndate;
	}

}

package todo.action;

import java.text.DateFormat;
import java.util.Date;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import todo.dao.Devices;
import todo.dao.DevicesDao;
import todo.dao.Resources;
import todo.dao.ResourcesDao;
import todo.tool.DateUtil;
import todo.tool.FixString;

import com.mysql.jdbc.StringUtils;
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

	private String no;
	private String user;
	private String takeoutdate;
	private String schedulereturndate;
	private String deviceid;
	private String devicenm;
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
	@Action("/rentryexec")
	public String entryexec() throws Exception {

    	if(!checkInputForm()){
    		return "success";
    	}

		this.setUser(FixString.encoding(user));
    	this.setTakeoutdate(FixString.encoding(takeoutdate));
    	this.setSchedulereturndate(FixString.encoding(schedulereturndate));
    	this.setDeviceid(FixString.encoding(deviceid));

	    DevicesDao dev = new DevicesDao();
	    String devicenm = dev.getDevicenm(deviceid);
	    this.setDevicenm(devicenm);

    	Date  takeoutDt = DateFormat.getDateInstance().parse(takeoutdate);
    	Date  schedulereturnDt = DateFormat.getDateInstance().parse(schedulereturndate);

	    ResourcesDao res = new ResourcesDao();

	    boolean result = res.entry( this.getUser(), takeoutDt, schedulereturnDt, this.getDeviceid(), this.getDevicenm());
   		return "top";
	}

	// 更新
	@Action("/rupdateexec")
	public String updateexec() throws Exception {

    	if(!checkUpdateForm()){
    		return "success";
    	}

    	this.setNo(FixString.encoding(no));

    	Date  returnDt = DateFormat.getDateInstance().parse(returndate);

	    ResourcesDao res = new ResourcesDao();

	    boolean result = res.update( this.getNo(), returnDt );
   		return "top";
	}

	// 削除
	@Action("/rdeleteexec")
	public String deleteexec() throws Exception {

    	this.setNo(FixString.encoding(no));

	    ResourcesDao res = new ResourcesDao();

	    boolean result = res.delete( this.getNo());
   		return "top";
	}

	// checkForm
	private boolean checkInputForm() throws Exception {

		boolean ret = true;
		// deviceid
		if(StringUtils.isNullOrEmpty(user)){
			addActionError("利用者は入力必須です。");
			ret = false;
		}
		if(StringUtils.isNullOrEmpty(takeoutdate)){
			addActionError("持ち出し日は入力必須です。");
			ret = false;
		}
		if(StringUtils.isNullOrEmpty(schedulereturndate)){
			addActionError("返却予定日は入力必須です。");
			ret = false;
		}
		if(StringUtils.isNullOrEmpty(deviceid)){
			addActionError("端末NOは入力必須です。");
			ret = false;
		}

		if(!DateUtil.isDate(takeoutdate)){
			addActionError("持ち出し日はyyyy/mm/ddの形で入力して下さい。");
			ret = false;
		}
		if(!DateUtil.isDate(schedulereturndate)){
			addActionError("返却予定日はyyyy/mm/ddの形で入力して下さい。");
			ret = false;
		}


		return ret;
	}

	// checkForm
	private boolean checkUpdateForm() throws Exception {

		boolean ret = true;
		// deviceid
		if(StringUtils.isNullOrEmpty(no)){
			addActionError("Noは入力必須です。");
			ret = false;
		}
		if(StringUtils.isNullOrEmpty(returndate)){
			addActionError("返却日は入力必須です。");
			ret = false;
		}
		if(!DateUtil.isDate(returndate)){
			addActionError("返却日はyyyy/mm/ddの形で入力して下さい。");
			ret = false;
		}
		return ret;
	}

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

}

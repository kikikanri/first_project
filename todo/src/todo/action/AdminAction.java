package todo.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import todo.dao.Devices;
import todo.dao.DevicesDao;
import todo.tool.FixString;

import com.mysql.jdbc.StringUtils;
import com.opensymphony.xwork2.ActionSupport;

@Results({
	  @Result(name="success", location ="list.jsp" ),
	  @Result(name = "top",
	  	type = "redirectAction",
	            params = {
                "actionName" , "admin"
          }
	  	),
})
public class AdminAction extends ActionSupport {

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

    	this.setDeviceid(FixString.encoding(deviceid));
    	this.setDevicenm(FixString.encoding(devicenm));
    	this.setOs(FixString.encoding(os));
    	this.setOffice(FixString.encoding(office));
    	this.setOther1(FixString.encoding(other1));

    	if(!checkInputForm()){
    		return "success";
    	}


	    DevicesDao todo = new DevicesDao();

	    if(todo.isDeviceIDExist(this.getDeviceid())){
	    	// メッセージセット
	    	addActionError("端末IDは既に存在しています。");

	    	return "success";
	    }

	    boolean result = todo.entry( this.getDeviceid(), this.getDevicenm(), this.getOs(), this.getOffice(), this.getOther1() );
   		return "top";
	}

	// 更新
	@Action("/updateexec")
	public String updateexec() throws Exception {

    	this.setDeviceid(FixString.encoding(deviceid));
    	this.setDevicenm(FixString.encoding(devicenm));
    	this.setOs(FixString.encoding(os));
    	this.setOffice(FixString.encoding(office));
    	this.setOther1(FixString.encoding(other1));

	    DevicesDao todo = new DevicesDao();

	    boolean result = todo.update( this.getDeviceid(), this.getDevicenm(), this.getOs(), this.getOffice(), this.getOther1() );
   		return "top";
	}

	// 削除
	@Action("/deleteexec")
	public String deleteexec() throws Exception {

    	this.setDeviceid(FixString.encoding(deviceid));

	    DevicesDao todo = new DevicesDao();

	    boolean result = todo.delete( this.getDeviceid());
   		return "top";
	}

	// checkForm
	private boolean checkInputForm() throws Exception {

		// deviceid
		if(StringUtils.isNullOrEmpty(deviceid)){
			addActionError("端末NOは入力必須です。");
			return false;
		}


		return true;
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

package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the devices database table.
 * 
 */
@Entity
@Table(name="devices")
@NamedQuery(name="Device.findAll", query="SELECT d FROM Device d")
public class Device implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DevicePK id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_DATE")
	private Date createDate;

	@Column(name="DELETE_FLG")
	private byte deleteFlg;

	@Column(name="DEVICE_NM")
	private String deviceNm;

	private String office;

	private String os;

	private String other1;

	private String other10;

	private String other11;

	private String other12;

	private String other2;

	private String other3;

	private String other4;

	private String other5;

	private String other6;

	private String other7;

	private String other8;

	private String other9;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	public Device() {
	}

	public DevicePK getId() {
		return this.id;
	}

	public void setId(DevicePK id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public byte getDeleteFlg() {
		return this.deleteFlg;
	}

	public void setDeleteFlg(byte deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	public String getDeviceNm() {
		return this.deviceNm;
	}

	public void setDeviceNm(String deviceNm) {
		this.deviceNm = deviceNm;
	}

	public String getOffice() {
		return this.office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getOs() {
		return this.os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getOther1() {
		return this.other1;
	}

	public void setOther1(String other1) {
		this.other1 = other1;
	}

	public String getOther10() {
		return this.other10;
	}

	public void setOther10(String other10) {
		this.other10 = other10;
	}

	public String getOther11() {
		return this.other11;
	}

	public void setOther11(String other11) {
		this.other11 = other11;
	}

	public String getOther12() {
		return this.other12;
	}

	public void setOther12(String other12) {
		this.other12 = other12;
	}

	public String getOther2() {
		return this.other2;
	}

	public void setOther2(String other2) {
		this.other2 = other2;
	}

	public String getOther3() {
		return this.other3;
	}

	public void setOther3(String other3) {
		this.other3 = other3;
	}

	public String getOther4() {
		return this.other4;
	}

	public void setOther4(String other4) {
		this.other4 = other4;
	}

	public String getOther5() {
		return this.other5;
	}

	public void setOther5(String other5) {
		this.other5 = other5;
	}

	public String getOther6() {
		return this.other6;
	}

	public void setOther6(String other6) {
		this.other6 = other6;
	}

	public String getOther7() {
		return this.other7;
	}

	public void setOther7(String other7) {
		this.other7 = other7;
	}

	public String getOther8() {
		return this.other8;
	}

	public void setOther8(String other8) {
		this.other8 = other8;
	}

	public String getOther9() {
		return this.other9;
	}

	public void setOther9(String other9) {
		this.other9 = other9;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
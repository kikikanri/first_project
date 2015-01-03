package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the resources database table.
 * 
 */
@Entity
@Table(name="resources")
@NamedQuery(name="Resource.findAll", query="SELECT r FROM Resource r")
public class Resource implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int no;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_DATE")
	private Date createDate;

	@Column(name="DELETE_FLG")
	private byte deleteFlg;

	@Column(name="DEVICE_NM")
	private String deviceNm;

	@Temporal(TemporalType.DATE)
	@Column(name="RETURN_DATE")
	private Date returnDate;

	@Column(name="RETURN_FLG")
	private byte returnFlg;

	@Temporal(TemporalType.DATE)
	@Column(name="`SCHEDULE_RETURN DATE`")
	private Date scheduleReturn_date;

	@Temporal(TemporalType.DATE)
	@Column(name="TAKEOUT_DATE")
	private Date takeoutDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	@Column(name="USER_NM")
	private String userNm;

	public Resource() {
	}

	public int getNo() {
		return this.no;
	}

	public void setNo(int no) {
		this.no = no;
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

	public Date getReturnDate() {
		return this.returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public byte getReturnFlg() {
		return this.returnFlg;
	}

	public void setReturnFlg(byte returnFlg) {
		this.returnFlg = returnFlg;
	}

	public Date getScheduleReturn_date() {
		return this.scheduleReturn_date;
	}

	public void setScheduleReturn_date(Date scheduleReturn_date) {
		this.scheduleReturn_date = scheduleReturn_date;
	}

	public Date getTakeoutDate() {
		return this.takeoutDate;
	}

	public void setTakeoutDate(Date takeoutDate) {
		this.takeoutDate = takeoutDate;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUserNm() {
		return this.userNm;
	}

	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}

}
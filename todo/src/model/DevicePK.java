package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the devices database table.
 * 
 */
@Embeddable
public class DevicePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int no;

	@Column(name="DEVICE_ID")
	private String deviceId;

	public DevicePK() {
	}
	public int getNo() {
		return this.no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DevicePK)) {
			return false;
		}
		DevicePK castOther = (DevicePK)other;
		return 
			(this.no == castOther.no)
			&& this.deviceId.equals(castOther.deviceId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.no;
		hash = hash * prime + this.deviceId.hashCode();
		
		return hash;
	}
}
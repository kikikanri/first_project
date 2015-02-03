package todo.dao;

import java.util.Date;

import net.java.ao.Entity;
import net.java.ao.schema.Default;
import net.java.ao.schema.PrimaryKey;

public interface Devices extends Entity  {

	public int getID();

	@PrimaryKey
	@Default("")
	public String getNo();
	public void setNo(String no);

	@Default("")
	public String getDeviceid();
	public void setDeviceid(String deviceid);

	@Default("")
	public String getDevicenm();
	public void setDevicenm(String devicenm);

	@Default("")
	public String getOs();
	public void setOs(String os);

	@Default("")
	public String getOffice();
	public void setOffice(String office);

	@Default("")
	public String getOther1();
	public void setOther1(String other1);

	@Default("")
	public String getOther2();
	public void setOther2(String other2);

	@Default("")
	public String getOther3();
	public void setOther3(String other3);

	@Default("")
	public String getOther4();
	public void setOther4(String other4);

	@Default("")
	public String getOther5();
	public void setOther5(String other5);

	@Default("")
	public String getOther6();
	public void setOther6(String other6);

	@Default("")
	public String getOther7();
	public void setOther7(String other7);

	@Default("")
	public String getOther8();
	public void setOther8(String other8);

	@Default("")
	public String getOther9();
	public void setOther9(String other9);

	@Default("")
	public String getOther10();
	public void setOther10(String other10);

	@Default("")
	public String getOther11();
	public void setOther11(String other11);

	@Default("")
	public String getOther12();
	public void setOther12(String other12);

	@Default("")
	public Date getCreateDate();
	public void setCreateDate(Date createdate);

	@Default("CURRENT_TIMESTAMP")
	public Date getUpdateDate();
	public void setUpdateDate(Date updatedate);

	@Default("0")
	public int getDeleteFlg();
	public void setDeleteFlg(String deleteflg);
}

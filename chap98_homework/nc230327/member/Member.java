package chap98_homework.nc230327.member;

import java.util.Calendar;
import java.util.Date;

public class Member {
	private int no;
	private String id;
	private String name;
	private Date lastLoginDate;
	private String status = "Y";
	
	public Member(int no, String id, String name,
			Date lastLoginDate) {
		this.no = no;
		this.id = id;
		this.name = name;
		this.lastLoginDate = lastLoginDate;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getLastLoginDate() {
		return lastLoginDate;
	}
	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Member [no=" + no + ", id=" + id + ", name=" + name + ", lastLoginDate=" + lastLoginDate + ", status="
				+ status + "]";
	}

	public long getDiffDate() {
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		cal2.setTime(lastLoginDate);
		
		long diff = cal1.getTimeInMillis() - 
						cal2.getTimeInMillis();
		long diffDate = diff / (1000 * 60 * 60 * 24);
		
		return diffDate;
	}
}

package bzh.fucktheduck.sec.persistance.bean;

import java.util.Date;

public class VoteSession {

	private Integer id = null;
	
	private Date creationDate;
	
	private Date viewingDate;
	
	public VoteSession() {
	}
	
	public VoteSession(Date creationDate, Date viewingDate) {
		this.creationDate = creationDate;
		this.viewingDate = viewingDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getViewingDate() {
		return viewingDate;
	}

	public void setViewingDate(Date viewingDate) {
		this.viewingDate = viewingDate;
	}
	
	@Override
	public String toString() {
		return "VoteSession - creationDate : " + creationDate + ", viewingDate : " + viewingDate;
	}
}

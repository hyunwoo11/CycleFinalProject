package kh.com.a.model;

import java.io.Serializable;
import java.util.Date;

/*
CREATE TABLE POLL(
	POLLID NUMBER NOT NULL,
	ID VARCHAR2(50) NOT NULL,
	QUESTION VARCHAR2(1000) NOT NULL,
	SDATE DATE NOT NULL,
	EDATE DATE NOT NULL,
	ITEMCOUNT NUMBER NOT NULL,
	POLLTOTAL NUMBER NOT NULL,
	REGDATE DATE NOT NULL,
	CONSTRAINT POLL_PK PRIMARY KEY("POLLID")
);

CREATE SEQUENCE POLL_SEQ
START WITH 1 INCREMENT BY 1;

ALTER TABLE POLL ADD CONSTRAINT POLL_FK
FOREIGN KEY("ID")
REFERENCES MEMBER("ID");
*/


// 투표항목
public class PollDto implements Serializable {

	private int pollid;	// 투표번호  1, 2, 3
	private String id;	// 투표를 만든 사람의 아이디
	private String question;	// 질문
	private Date sdate;			// 시작일
	private Date edate;			// 종료일
	private int itemcount;		// 보기의 갯수
	private int polltotal;		// 질문에 대해서 투표한 사람수
	private Date regdate;		// 투표를 생성한 날짜
	
	private boolean vote;		// 투표를 했는지?
	
	public PollDto() {}

	public PollDto(int pollid, String id, String question, Date sdate, Date edate, int itemcount, int polltotal,
			Date regdate) {
		super();
		this.pollid = pollid;
		this.id = id;
		this.question = question;
		this.sdate = sdate;
		this.edate = edate;
		this.itemcount = itemcount;
		this.polltotal = polltotal;
		this.regdate = regdate;
	}

	public PollDto(String id, String question, Date sdate, Date edate, int itemcount, int polltotal) {
		super();
		this.id = id;
		this.question = question;
		this.sdate = sdate;
		this.edate = edate;
		this.itemcount = itemcount;
		this.polltotal = polltotal;
	}

	public PollDto(String id, String question, int itemcount) {
		super();
		this.id = id;
		this.question = question;
		this.itemcount = itemcount;
	}

	public int getPollid() {
		return pollid;
	}

	public void setPollid(int pollid) {
		this.pollid = pollid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Date getSdate() {
		return sdate;
	}

	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}

	public Date getEdate() {
		return edate;
	}

	public void setEdate(Date edate) {
		this.edate = edate;
	}

	public int getItemcount() {
		return itemcount;
	}

	public void setItemcount(int itemcount) {
		this.itemcount = itemcount;
	}

	public int getPolltotal() {
		return polltotal;
	}

	public void setPolltotal(int polltotal) {
		this.polltotal = polltotal;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "PollDto [pollid=" + pollid + ", id=" + id + ", question=" + question + ", sdate=" + sdate + ", edate="
				+ edate + ", itemcount=" + itemcount + ", polltotal=" + polltotal + ", regdate=" + regdate + "]";
	}

	public boolean isVote() {
		return vote;
	}

	public void setVote(boolean vote) {
		this.vote = vote;
	}
	
	
	
	
}





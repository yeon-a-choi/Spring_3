package com.ee.y3.board;

import java.util.Date;
import java.util.List;

public class BoardDTO {
	
	private long num;
	private String title;
	private String writer;
	private String contents;
	private long hit;
	private Date regdate;
	
	
	private List<BoardFileDTO> boardFiles = null;
	// get set
	public List<BoardFileDTO> getBoardFiles() {
		return boardFiles;
	}
	public void setBoardFiles(List<BoardFileDTO> boardFiles) {
		this.boardFiles = boardFiles;
	}
	
	
	//get set
	public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public long getHit() {
		return hit;
	}
	public void setHit(long hit) {
		this.hit = hit;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

}

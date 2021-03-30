package com.ee.y3.util;

public class Pager {
	
	private long curPage;
	private long startRow;
	private long lastRow;
	
	
	private long startNum;
	private long LastNum;
	
	private boolean pre;	//이전 block이 있으면 true 없으면 false
	private boolean next;	//다음 block이 있으면 true 없으면 false
	
	
	private String kind;	//검색할 컬럼명
	private String search;	//검색어
	


	//get set
	public long getStartRow() {
		return startRow;
	}
	public void setStartRow(long startRow) {
		this.startRow = startRow;
	}
	public long getLastRow() {
		return lastRow;
	}
	public void setLastRow(long lastRow) {
		this.lastRow = lastRow;
	}
	
	//초기값
	public long getCurPage() {
		
		if(this.curPage <1) {
			this.curPage = 1;
		}
		
		return curPage;
	}
	public void setCurPage(long curPage) {
		
		if(this.curPage <1) {
			this.curPage = 1;
		}
		
		this.curPage = curPage;
	}
	
	
	public long getStartNum() {
		return startNum;
	}
	public void setStartNum(long startNum) {
		this.startNum = startNum;
	}
	public long getLastNum() {
		return LastNum;
	}
	public void setLastNum(long lastNum) {
		LastNum = lastNum;
	}
	
	
	public boolean isPre() {
		return pre;
	}
	public void setPre(boolean pre) {
		this.pre = pre;
	}
	public boolean isNext() {
		return next;
	}
	public void setNext(boolean next) {
		this.next = next;
	}

	
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getSearch() {
		if(this.search == null) {
			this.search="";
		}
		return search;
	}
	public void setSearch(String search) {
		if(search == null) {
			search="";
		}
		this.search = search;
	}

	
}

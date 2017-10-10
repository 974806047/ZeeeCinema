package com.hzyc.Zee.bean;

public class Page {
	//��ǰҳ
	private int nowPage=1;
	//ÿҳ����
	private int perPageLine=2;
	//�ܼ�¼��
	private int total;
	//��ʼλ��
	private int startPosition;
	//��ҳ��
	private int pageNum;
	
	String where;
	
	
	public void initStartPosition(){
		startPosition = (nowPage-1)*perPageLine;
	}
	public void initPageNum(){
		pageNum = (total%perPageLine==0)? (total/perPageLine):(total/perPageLine+1);
	}
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	public int getPerPageLine() {
		return perPageLine;
	}
	public void setPerPageLine(int perPageLine) {
		this.perPageLine = perPageLine;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getStartPosition() {
		return startPosition;
	}
	public void setStartPosition(int startPosition) {
		this.startPosition = startPosition;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public String getWhere() {
		return where;
	}
	public void setWhere(String where) {
		this.where = where;
	}
	
	
	
	
	
	
	
}

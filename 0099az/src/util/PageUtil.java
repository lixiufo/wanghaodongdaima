package util;

public class PageUtil {
	
private int pageSize;//每页显示多少条
private int pageCount;//一共多少页
private int dataCount;//总数据数
private int pageNo;//当前页码
public int getPageSize() {
	return pageSize;
}
public void setPageSize(int pageSize) {
	this.pageSize = pageSize;
}
public int getPageCount() {
	//因为总页数分为两种情况 
			//1.刚好显示完的 比如 20 条数据 每页显示4 条 刚好显示5也
			//2.不能显示完的  比如 21条数据 每页显示4条  必须6也才可以显示完
	if(dataCount%pageSize==0) {
		pageCount=dataCount/pageSize;
	}else {
		pageCount=dataCount/pageSize+1;
	}
	return pageCount;
}
public void setPageCount(int pageCount) {
	this.pageCount = pageCount;
}
public int getDataCount() {
	return dataCount;
}
public void setDataCount(int dateCount) {
	this.dataCount = dateCount;
}
public int getPageNo() {
	return pageNo;
}
public void setPageNo(int pageNo) {
	this.pageNo = pageNo;
}
}

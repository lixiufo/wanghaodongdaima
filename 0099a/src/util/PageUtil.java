package util;

public class PageUtil {
	
private int pageSize;//ÿҳ��ʾ������
private int pageCount;//һ������ҳ
private int dataCount;//��������
private int pageNo;//��ǰҳ��
public int getPageSize() {
	return pageSize;
}
public void setPageSize(int pageSize) {
	this.pageSize = pageSize;
}
public int getPageCount() {
	//��Ϊ��ҳ����Ϊ������� 
			//1.�պ���ʾ��� ���� 20 ������ ÿҳ��ʾ4 �� �պ���ʾ5Ҳ
			//2.������ʾ���  ���� 21������ ÿҳ��ʾ4��  ����6Ҳ�ſ�����ʾ��
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

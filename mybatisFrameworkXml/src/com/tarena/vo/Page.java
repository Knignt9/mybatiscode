package com.tarena.vo;

import java.util.List;

public class Page {
	private int currentPage;//��ǰҳ
	private int previousPage;//ǰһҳ
	private int nextPage;//��һҳ
	private int totalCount;//�ܼ�¼��
	private int totalPage;//��ҳ��
	private int begin;//��ҳ��ʼֵ
	private int pageSize;//ÿҳ��¼��
	
	private List data;//��ǰҳ����
	
	private String keyword;//ģ���Ĺؼ��ֵ�����

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPreviousPage() {
		return previousPage;
	}

	public void setPreviousPage(int previousPage) {
		this.previousPage = previousPage;
	}

	public int getNextPage() {
		return nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getTotalPage() {
		totalPage=(totalCount%pageSize==0)? (totalCount/pageSize) : (totalCount/pageSize)+1;
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getBegin() {
		begin=(this.currentPage-1)*pageSize;
		return begin;
	}

	public void setBegin(int begin) {
		this.begin = begin;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List getData() {
		return data;
	}

	public void setData(List data) {
		this.data = data;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	
	
	
}

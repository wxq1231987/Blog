package com.wxq.blog.entity;

public class RecycleItem {
	private int itemId;
	private int articleId;
	private int recycleId;
	
	public RecycleItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RecycleItem(int itemId, int articleId, int recycleId) {
		super();
		this.itemId = itemId;
		this.articleId = articleId;
		this.recycleId = recycleId;
	}
	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	/**
	 * @param articleId the articleId to set
	 */
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	/**
	 * @param recycleId the recycleId to set
	 */
	public void setRecycleId(int recycleId) {
		this.recycleId = recycleId;
	}
	/**
	 * @return the itemId
	 */
	public int getItemId() {
		return itemId;
	}
	/**
	 * @return the articleId
	 */
	public int getArticleId() {
		return articleId;
	}
	/**
	 * @return the recycleId
	 */
	public int getRecycleId() {
		return recycleId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RecycleItem [itemId=" + itemId + ", articleId=" + articleId
				+ ", recycleId=" + recycleId + "]";
	}
	
}

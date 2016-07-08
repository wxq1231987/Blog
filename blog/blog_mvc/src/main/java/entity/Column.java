package com.wxq.blog.entity;

public class Column {
	private int columnId;
	private String description;
	private int userId;
	
	public Column() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Column(int columnId, String description, int userId) {
		super();
		this.columnId = columnId;
		this.description = description;
		this.userId = userId;
	}
	/**
	 * @param columnId the columnId to set
	 */
	public void setColumnId(int columnId) {
		this.columnId = columnId;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the columnId
	 */
	public int getColumnId() {
		return columnId;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Column [columnId=" + columnId + ", description=" + description
				+ ", userId=" + userId + "]";
	}
	
}

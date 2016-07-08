package com.wxq.blog.entity;

import java.util.Date;

public class Drafts {
	private int articleId;
	private int userId;
	private int columnId;
	private String label;
	private String title;
	private String content;
	private String digest;
	private Date dateline;
	private int pageViews;
	private String type;
	
	public Drafts() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Drafts(int articleId, int userId, int columnId, String label,
			String title, String content, String digest, Date dateline,
			int pageViews, String type) {
		super();
		this.articleId = articleId;
		this.userId = userId;
		this.columnId = columnId;
		this.label = label;
		this.title = title;
		this.content = content;
		this.digest = digest;
		this.dateline = dateline;
		this.pageViews = pageViews;
		this.type = type;
	}

	/**
	 * @param articleId the articleId to set
	 */
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @param columnId the columnId to set
	 */
	public void setColumnId(int columnId) {
		this.columnId = columnId;
	}
	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @param digest the digest to set
	 */
	public void setDigest(String digest) {
		this.digest = digest;
	}
	/**
	 * @param dateline the dateline to set
	 */
	public void setDateline(Date dateline) {
		this.dateline = dateline;
	}
	/**
	 * @param pageViews the pageViews to set
	 */
	public void setPageViews(int pageViews) {
		this.pageViews = pageViews;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the articleId
	 */
	public int getArticleId() {
		return articleId;
	}
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @return the columnId
	 */
	public int getColumnId() {
		return columnId;
	}
	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @return the digest
	 */
	public String getDigest() {
		return digest;
	}
	/**
	 * @return the dateline
	 */
	public Date getDateline() {
		return dateline;
	}
	/**
	 * @return the pageViews
	 */
	public int getPageViews() {
		return pageViews;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Article [articleId=" + articleId + ", userId=" + userId
				+ ", columnId=" + columnId + ", label=" + label + ", title="
				+ title + ", content=" + content + ", digest=" + digest
				+ ", pageViews=" + pageViews + ", type=" + type + "]";
	}
	
}

package com.wxq.blog.entity;

public class Recycle {
	private int recycleId;
	private int userId;
	
	public Recycle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Recycle(int recycleId, int userId) {
		super();
		this.recycleId = recycleId;
		this.userId = userId;
	}

	/**
	 * @param recycleId the recycleId to set
	 */
	public void setRecycleId(int recycleId) {
		this.recycleId = recycleId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the recycleId
	 */
	public int getRecycleId() {
		return recycleId;
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
		return "Recycle [recycleId=" + recycleId + ", userId=" + userId + "]";
	}
    
}

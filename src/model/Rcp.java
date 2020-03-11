package model;

import java.io.Serializable;
import java.util.Date;

public class Rcp implements Serializable {
	
	private int rcpNum;
	private String title;
	private String foodName;
	private String subtitle;
	private String ingredient;
	private String cookingTime;
	private String memId;
	private Date reg_date;
	private String thumbNail;
	private String hashtag;
	
	public int getRcpNum() {
		return rcpNum;
	}
	public void setRcpNum(int rcpNum) {
		this.rcpNum = rcpNum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public String getIngredient() {
		return ingredient;
	}
	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}
	public String getCookingTime() {
		return cookingTime;
	}
	public void setCookingTime(String cookingTime) {
		this.cookingTime = cookingTime;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public String getThumbNail() {
		return thumbNail;
	}
	public void setThumbNail(String thumbNail) {
		this.thumbNail = thumbNail;
	}
	public String getHashtag() {
		return hashtag;
	}
	public void setHashtag(String hashtag) {
		this.hashtag = hashtag;
	}
	
	@Override
	public String toString() {
		return "Rcp [rcpNum=" + rcpNum + ", title=" + title + ", foodName=" + foodName + ", subtitle=" + subtitle
				+ ", ingredient=" + ingredient  + ", cookingTime=" + cookingTime
				+ ", memId=" + memId + ", reg_date=" + reg_date + ", thumbNail=" + thumbNail
				+ ", HashTag=" + hashtag + "]";
	}
	
	
	
}

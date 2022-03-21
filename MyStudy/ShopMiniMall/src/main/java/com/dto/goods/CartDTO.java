package com.dto.goods;

import org.apache.ibatis.type.Alias;

@Alias("CartDTO")
public class CartDTO {

	private int num;
	private String userid;
	private String gCode;
	private String gName;
	private int gPrice;
	private String gSize;
	private String gColor;
	private int gAmount;
	private String gImage;
	public CartDTO() {
		// TODO Auto-generated constructor stub
	}
	public CartDTO(int num, String userid, String gCode, String gName, int gPrice, String gSize, String gColor,
			int gAmount, String gImage) {
		this.num = num;
		this.userid = userid;
		this.gCode = gCode;
		this.gName = gName;
		this.gPrice = gPrice;
		this.gSize = gSize;
		this.gColor = gColor;
		this.gAmount = gAmount;
		this.gImage = gImage;
	}
	public int getNum() {
		return num;
	}
	public String getUserid() {
		return userid;
	}
	public String getgCode() {
		return gCode;
	}
	public String getgName() {
		return gName;
	}
	public int getgPrice() {
		return gPrice;
	}
	public String getgSize() {
		return gSize;
	}
	public String getgColor() {
		return gColor;
	}
	public int getgAmount() {
		return gAmount;
	}
	public String getgImage() {
		return gImage;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public void setgCode(String gCode) {
		this.gCode = gCode;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	public void setgPrice(int gPrice) {
		this.gPrice = gPrice;
	}
	public void setgSize(String gSize) {
		this.gSize = gSize;
	}
	public void setgColor(String gColor) {
		this.gColor = gColor;
	}
	public void setgAmount(int gAmount) {
		this.gAmount = gAmount;
	}
	public void setgImage(String gImage) {
		this.gImage = gImage;
	}
	@Override
	public String toString() {
		return "CartDTO [num=" + num + ", userid=" + userid + ", gCode=" + gCode + ", gName=" + gName + ", gPrice="
				+ gPrice + ", gSize=" + gSize + ", gColor=" + gColor + ", gAmount=" + gAmount + ", gImage=" + gImage
				+ "]";
	}
}

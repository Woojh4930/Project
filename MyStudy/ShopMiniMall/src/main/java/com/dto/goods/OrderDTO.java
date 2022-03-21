package com.dto.goods;

import org.apache.ibatis.type.Alias;

@Alias("OrderDTO")
public class OrderDTO {
	private int num;
	private String userid;
	private String gCode;
	private String gName;
	private int gPrice;
	private String gSize;
	private String gColor;
	private int gAmount;
	private String gImage;
	private String orderName;
	private String post;
	private String addr1;
	private String addr2;
	private String phone;
	private String payMethod;
	private String orderDay;
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
	public String getOrderName() {
		return orderName;
	}
	public String getPost() {
		return post;
	}
	public String getAddr1() {
		return addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public String getPhone() {
		return phone;
	}
	public String getPayMethod() {
		return payMethod;
	}
	public String getOrderDay() {
		return orderDay;
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
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}
	public void setOrderDay(String orderDay) {
		this.orderDay = orderDay;
	}
	public OrderDTO(int num, String userid, String gCode, String gName, int gPrice, String gSize, String gColor,
			int gAmount, String gImage, String orderName, String post, String addr1, String addr2, String phone,
			String payMethod, String orderDay) {
		this.num = num;
		this.userid = userid;
		this.gCode = gCode;
		this.gName = gName;
		this.gPrice = gPrice;
		this.gSize = gSize;
		this.gColor = gColor;
		this.gAmount = gAmount;
		this.gImage = gImage;
		this.orderName = orderName;
		this.post = post;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.phone = phone;
		this.payMethod = payMethod;
		this.orderDay = orderDay;
	}
	public OrderDTO() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OrderDTO [num=" + num + ", userid=" + userid + ", gCode=" + gCode + ", gName=" + gName + ", gPrice="
				+ gPrice + ", gSize=" + gSize + ", gColor=" + gColor + ", gAmount=" + gAmount + ", gImage=" + gImage
				+ ", orderName=" + orderName + ", post=" + post + ", addr1=" + addr1 + ", addr2=" + addr2 + ", phone="
				+ phone + ", payMethod=" + payMethod + ", orderDay=" + orderDay + "]";
	}
	
	
	
}

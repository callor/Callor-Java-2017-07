package com.bit.vo;

public class BookVO {

	private String strTitle;
	private String strComp;
	private String strGenre;
	private int intPrice;
	
	public BookVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BookVO(String strTitle, String strComp, String strGenre, int intPrice) {
		super();
		this.strTitle = strTitle;
		this.strComp = strComp;
		this.strGenre = strGenre;
		this.intPrice = intPrice;
	}
	
	public String getStrTitle() {
		return strTitle;
	}
	public void setStrTitle(String strTitle) {
		this.strTitle = strTitle;
	}
	public String getStrComp() {
		return strComp;
	}
	public void setStrComp(String strComp) {
		this.strComp = strComp;
	}
	public String getStrGenre() {
		return strGenre;
	}
	public void setStrGenre(String strGenre) {
		this.strGenre = strGenre;
	}
	public int getIntPrice() {
		return intPrice;
	}
	public void setIntPrice(int intPrice) {
		this.intPrice = intPrice;
	}
	@Override
	public String toString() {
		return "BookVO [strTitle=" + strTitle + ", strComp=" + strComp + ", strGenre=" + strGenre + ", intPrice="
				+ intPrice + "]";
	}
	
	
	
}

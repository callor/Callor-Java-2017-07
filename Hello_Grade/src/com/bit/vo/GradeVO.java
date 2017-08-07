package com.bit.vo;

public class GradeVO extends Object {

	private String strNum;
	private String strName;
	
	private int intKor;
	private int intEng;
	private int intMath;
	private int intTotal;
	private int intAvg;
	
	// super 생성자
	// 클래스를 객체로 생성만 
	public GradeVO() {
	}
	
	// 맴버 생성자
	// 클래스를 객체로 생성하면서 맴버변수를 초기화 
	public GradeVO(String strNum,String strName,int intKor, 
			int intEng, int intMath) {
		this.strNum =  strNum;
		this.strName = strName;
		this.intKor = intKor;
		this.intEng = intEng;
		this.intMath = intMath;
	}
	
	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMath() {
		return intMath;
	}
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	public int getIntTotal() {
		return intTotal;
	}
	public void setIntTotal(int intTotal) {
		this.intTotal = intTotal;
	}
	public int getIntAvg() {
		return intAvg;
	}
	public void setIntAvg(int intAvg) {
		this.intAvg = intAvg;
	}

	@Override
	public String toString() {
		return "GradeVO [strNum=" + strNum + ", strName=" + strName + ", intKor=" + intKor + ", intEng=" + intEng
				+ ", intMath=" + intMath + ", intTotal=" + intTotal + ", intAvg=" + intAvg + "]";
	}
}









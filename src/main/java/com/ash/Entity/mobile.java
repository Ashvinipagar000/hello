package com.ash.Entity;

public class mobile {
    int mid;
    String mbrand;
    int mprice;
	public mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public mobile(int mid, String mbrand, int mprice) {
		super();
		this.mid = mid;
		this.mbrand = mbrand;
		this.mprice = mprice;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMbrand() {
		return mbrand;
	}
	public void setMbrand(String mbrand) {
		this.mbrand = mbrand;
	}
	public int getMprice() {
		return mprice;
	}
	public void setMprice(int mprice) {
		this.mprice = mprice;
	}
	@Override
	public String toString() {
		return "mobile [mid=" + mid + ", mbrand=" + mbrand + ", mprice=" + mprice + "]";
	}
    
}

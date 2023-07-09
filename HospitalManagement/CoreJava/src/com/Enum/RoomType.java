package com.Enum;

public enum RoomType {
	GENERAL(2000), SPECIAL(5000), SEMI_SPECIAL(3000), ICU(7000);

	private int rate;

	RoomType(int i) {
		// TODO Auto-generated constructor stub
		this.rate = i;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

}

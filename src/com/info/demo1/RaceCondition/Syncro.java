package com.info.demo1.RaceCondition;

public class Syncro {
	public static void main(String[] args) {
		First fnew = new First();
		Second ss = new Second(fnew, "welcome");
		//start() is already called in second class constructor
		Second ss1 = new Second(fnew, "new");
		Second ss2 = new Second(fnew, "programmer");
	}
}
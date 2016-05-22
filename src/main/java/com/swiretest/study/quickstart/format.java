package com.swiretest.study.quickstart;

import java.text.DecimalFormat;


public class format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat format = new DecimalFormat(",###,##0.00");
		
		System.out.println(format.format(0));
		
		System.out.println("abc");
		
//		this.depositTotal = format.format(depositTotal);

	}

}

package com.swiretest.study.quickstart;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class decimal {

	public static void main(String[] args) {

/*		 String str ="12312323423423.125283123";
		 
//		 str ="99999999999999999999999.99999999999999999999";
	     BigDecimal b = new BigDecimal(str);
	     
	     double t1 = 1125;
	     									 
	     //,���ָ���	  //0.�����##���λ�� ����0 Ч�����λ����0����
	     DecimalFormat d1 =new DecimalFormat("#,##0.##;(#)");
	     
	     DecimalFormat d2 = new DecimalFormat(",###,###.00");
	     
	     DecimalFormat d3 = new DecimalFormat();
	     
	  	 System.out.println(d1.format(b));
	  	 System.out.println(d2.format(b));	  	 
	  	 System.out.println(d3.format(b));
	  	 
	  	 
	  	 System.out.println(d1.format(t1));
	  	 System.out.println(d2.format(t1));
	  	 System.out.println(d3.format(t1));*/
		
		 BigDecimal bd=new BigDecimal(5456.678);
	     System.out.println(parseMoney(",###,###",bd)); //out: 123,456,789                         

	     System.out.println(parseMoney("##,####,###",bd)); //out: 123,456,789

	     System.out.println(parseMoney("######,###",bd)); //out: 123,456,789

	     System.out.println(parseMoney("#,##,###,###",bd)); //out: 123,456,789

	     System.out.println(parseMoney(",###,###.00",bd)); //out: 123,456,789.00

	     System.out.println(parseMoney(",###,##0.00",bd)); //out: 123,456,789.00

	     

	     BigDecimal bd2=new BigDecimal(0);
	     System.out.println(parseMoney(",###,###",bd2)); //out: 0

	     System.out.println(parseMoney(",###,###.00",bd2)); //out: .00

	     System.out.println(parseMoney(",###,##0.00",bd2)); //out: 0.00

	}
	
	public static String parseMoney(String pattern,BigDecimal bd){
		DecimalFormat df=new DecimalFormat(pattern);
		    return df.format(bd);
		}
	
	private String a;

}

package com.swiretest.study.quickstart;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("test Reandom");

		System.out.println("test2");

		System.out.println("test3");
		
		String a = Integer.toString(Long
				.valueOf(System.currentTimeMillis() % 5).intValue());

		System.out.println(a);

//		 Random random = newRandom();
//		 int result=random.nextInt(10000);
//		 System.out.println(result);

		String uniqueId = java.util.UUID.randomUUID().toString();

		System.out.println(uniqueId);
		
		System.out.println("test random");
	}

}

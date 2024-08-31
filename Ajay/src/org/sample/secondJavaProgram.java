package org.sample;

public class secondJavaProgram extends firstJavaProgram{
	
	public   void dummy() {
		// TODO Auto-generated method stub
		int d=2,e=0;
		e=super.add(1, 2);
		
		System.out.println(e+d);

	}

	public static void main(String[] args) {
		secondJavaProgram s = new secondJavaProgram();
		s.dummy();
	}
}

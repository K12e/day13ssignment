package Generics;

public class TestCaseAllGenricsConditions<A>{
	
	A a1;
	A a2;
	A a3;
	
	public<T extends Comparable<T>> void findmaximum(T t1,T t2, T t3) {
		
		if(t1.compareTo(t2)>0 && t1.compareTo(t3)>0) {
			System.out.println("T1 is Maximum = "+t1);
		}else if(t2.compareTo(t1)>0 && t2.compareTo(t3)>0) {
			System.out.println("T2 is Maximum ="+t2);
		}
		else{
		System.out.println("T3 is Maximum = "+t3);
		}	
	}
	
	public static void main(String[] args) {
		
		TestCaseAllGenricsConditions genericsClass= new TestCaseAllGenricsConditions();
		genericsClass.findmaximum("Apple","Peach","Banana");
		genericsClass.findmaximum(20,502,100);
		genericsClass.findmaximum(28.5,60.0,256.0);
	}
}
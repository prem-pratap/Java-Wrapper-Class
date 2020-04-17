/*Write a java program that generates the minimum and maximum value for each of the Numeric Wrapper classes (Byte, Short, Integer, Long, Float, Double)*/

public class Exercise1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Integer iobj=new Integer(10);
		System.out.println("Integer Range:\nmin: "+iobj.MIN_VALUE+"\nmax: "+iobj.MAX_VALUE);
		Double dobj=new Double("1.5");
		System.out.println("Double Range:\nmin: "+dobj.MIN_VALUE+"\nmax: "+dobj.MAX_VALUE);
		//Another method to access MaxValue and MinValue 
		System.out.println("Long Range:\nmin: "+Long.MIN_VALUE+"\nmax :"+Long.MAX_VALUE);
		Short sh=new Short((short) 100);
		System.out.println("Short Range:\nmin: "+sh.MIN_VALUE+"\nmax: "+sh.MAX_VALUE);
		Byte bobj=new Byte("20");
		System.out.println("Byte Range:\nmin: "+bobj.MIN_VALUE+"\nmax: "+bobj.MAX_VALUE);
		Float fobj=new Float(2.6);
		System.out.println("Short Range:\nmin: "+fobj.MIN_VALUE+"\nmax: "+fobj.MAX_VALUE);
	}

}

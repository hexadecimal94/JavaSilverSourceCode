
public class ThirdChapter4 {

	public static void main(String[] args) {
		int a = 10;
		//int c = ++a;
		//System.out.println("c: "+ c);
		int b = a++ + a + a-- - a-- + ++a;
		System.out.println("a++: " + a++);
		System.out.println("a--: " + a--);
		System.out.println(b);
	}

}

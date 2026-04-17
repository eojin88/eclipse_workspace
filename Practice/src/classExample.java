import java.util.Arrays;

class MyPoint {
    private int x;
    private int y;
    
    public void setX(int x) {
    	this.x = x;
    }
    public void setY(int y) {
    	this.y = y;
    }
    
    public int getX() {
    	return this.x;
    }
    public int getY() {
    	return this.y;
    }
}

public class classExample {
	
	static int a;

	public static void main(String[] args) {
		
		System.out.println(a);
		
		int[] abc = {4,5,2,100};
		Arrays.sort(abc);
		System.out.println(Arrays.toString(abc));
		
		MyPoint mp = new MyPoint();
		mp.setX(3);
		mp.setY(4);
		
		System.out.println(mp.getX() * mp.getY());
		
		classExample aaa = new classExample();
		aaa.test();
		
	}
	
	public void test() {
		System.out.println(this.toString());
		System.out.println(a);
	}

}
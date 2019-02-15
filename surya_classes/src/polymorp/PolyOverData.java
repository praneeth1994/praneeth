package polymorp;

public class PolyOverData {
	
	
	void sum(int a, int b){
		int c=a+b;
		System.out.println(c);
	}
	void sum(int a, int b, int c){
		int d=a+b+c;
	System.out.println(d);	
	}
	public static void main(String[] args) {
		PolyOverData o=new PolyOverData();
       o.sum(200, 588);
       o.sum(85, 58, 78);
       
	}

}

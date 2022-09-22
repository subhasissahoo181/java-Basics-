//Real senerio of abstract class....
interface A{
	void a();
	int b();
	void c();
	int d();
	
}
abstract class B implements A{
	public void c(){
		System.out.println("I am C");
	}
}
class C extends B{
	public void a(){
		System.out.println("I am Groot");
	}
	public int b(){
		return 21;
	}
	public int d(){
		return 0;
	}
}
class Abstraction_2{
	public static void main(String args[]){
		A ob = new C();
		
		ob.a();
		ob.b();
		ob.c();
		ob.d();
	}
}
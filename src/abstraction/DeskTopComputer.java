package abstraction;

public class DeskTopComputer  extends Calculator {

	@Override
	public void multiply() {
		System.out.println("we can multiply");
		
	}

	@Override
	public void division() {
		System.out.println("we can divide");
		
		
	}
	
	public void fraction(){
		System.out.println("we can do fraction as well");
	}
	
	public void decimal(){
		System.out.println("we can do decimal also");
	}

	  
	

}

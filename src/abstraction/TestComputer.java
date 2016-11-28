package abstraction;

public class TestComputer {

	public static void main(String[] args) {
	           Abacus abacus = new DeskTopComputer();
	           abacus.addNumbers();
	           abacus.subtract();
	           
	           Calculator calculator = new DeskTopComputer();
	           calculator.division();
	           calculator.multiply();
	           
	           DeskTopComputer desktopcomputer = new DeskTopComputer();
	           desktopcomputer.decimal();
	           desktopcomputer.fraction();
	           desktopcomputer.addNumbers();
	           desktopcomputer.subtract();
	           
	           
	}
}
	           
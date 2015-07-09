package test1;

public class BusyLamp extends CU_Lamp {

	public BusyLamp(boolean status){
		this.status=status;
	}
	@Override
	public void lightLamp(String message) {
		System.out.println("Busy Lamp "+message);
		
	}

}

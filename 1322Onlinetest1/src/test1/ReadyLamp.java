package test1;

public class ReadyLamp extends BU_Lamp {


	 public ReadyLamp(boolean status) {
		this.status=status;
	} 
	@Override
	public void lightLamp(String message) {
		System.out.println("Ready Lamp "+message);
		
	}

}

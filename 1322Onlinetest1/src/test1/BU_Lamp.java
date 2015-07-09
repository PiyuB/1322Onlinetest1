package test1;

public abstract class BU_Lamp implements Lamp {

	protected boolean status; 
	protected BU_Lamp nextLamp;

	public void setNextLamp(BU_Lamp nextLamp) {
		this.nextLamp = nextLamp;
	}
	
	public void switchLamp(boolean status,String message){
		if(this.status==true){
			lightLamp(message);
			
		}
		if(nextLamp!=null){
			nextLamp.switchLamp(status, message);
		}
	}
		
}

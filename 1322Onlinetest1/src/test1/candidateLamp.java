package test1;

public class candidateLamp extends BU_Lamp{

	
	 public candidateLamp(boolean status) {
		this.status=status;
	} 
	@Override
	public void lightLamp(String message) {
		System.out.println("Candidate Lamp "+message);
		
	}



}

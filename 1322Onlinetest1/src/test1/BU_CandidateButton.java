package test1;

public class BU_CandidateButton implements Button {
    boolean status=false;
    Integer id;
	@Override
	public boolean pressButton(boolean status) {
		// TODO Auto-generated method stub
		
		this.status=status;
		return status;
	}
	

   
	
}

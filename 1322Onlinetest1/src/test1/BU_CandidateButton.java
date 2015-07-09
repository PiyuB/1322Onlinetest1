package test1;

public class BU_CandidateButton implements Button {
    boolean status=false;

	@Override
	public boolean pressButton(boolean status) {
		// TODO Auto-generated method stub
		this.status=status;
		return status;
	}
	

   
	
}

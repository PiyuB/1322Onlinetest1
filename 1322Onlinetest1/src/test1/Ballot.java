package test1;

public class Ballot extends CU_Buttons{

	@Override
	public boolean pressButton(boolean status) {
		// TODO Auto-generated method stub
		this.status=status;
		return this.status;
	}

}

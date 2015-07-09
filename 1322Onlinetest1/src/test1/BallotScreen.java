package test1;

import java.util.ArrayList;

public class BallotScreen {

	ArrayList<Candidate> candiddate;
	
	public BallotScreen(){
		candiddate=new ArrayList<Candidate>();
	}
	
	public boolean addCandidate(String Name,boolean contesting){
		if(contesting==true)
			return true;
		else
			return false;
		
	}
	
	
}

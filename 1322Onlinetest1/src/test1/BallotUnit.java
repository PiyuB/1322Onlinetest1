package test1;

import java.util.ArrayList;

public class BallotUnit {

	BallotScreen bs;
	BU_Lamp buLamp;
	BU_CandidateButton bu_candidateButton;
    ControlUnit CU;
	ArrayList<Candidate> candidate=new ArrayList<Candidate>();
	public BallotUnit(){
		bs=new BallotScreen();
		buLamp=new candidateLamp(false);
		CU=new ControlUnit();
		bu_candidateButton=new BU_CandidateButton();
	}
	
	public void click(){
		boolean status;
		status=bu_candidateButton.pressButton(true);
			if(status==true)
			{
				addVotes(bu_candidateButton.id);
		
			}
	}
	
	public Integer addVotes(Integer id){
		
		return candidate.get(id).votes++ ;
		
	}
	
	
	
}

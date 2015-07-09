package test1;

public class ControlUnit {

	CU_Buttons cu_Totalbutton,cu_Ballotbutton;
	CU_Lamp cu_lamp;
	BallotUnit bu;
	
	public ControlUnit(){
	cu_Totalbutton=new Total();
	cu_Ballotbutton=new Ballot();	
	cu_lamp=new OnLamp(false);
	bu=new BallotUnit();
	}
	
	public void clear(){
		new ControlUnit();
		
	}
	
	public Integer FindTotalVotes(int id){
		
		return bu.candidate.get(id).votes;
		
	}
	
	public void read(){
		for(int i=0;i<=bu.candidate.size();i++){
			System.out.println("candidate :" +bu.candidate.get(i).getId()+ "Total votes "+ bu.candidate.get(i).votes);
		}
	}
	
	public boolean poll(boolean pollvalue){
		return pollvalue;
	}
	
}

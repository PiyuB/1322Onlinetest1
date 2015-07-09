package test1;

public class Candidate {

	Integer Id;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	boolean contesting;
	Integer votes=0;

	
	public boolean isContesting() {
		return contesting;
	}
	public void setContesting(boolean contesting) {
		this.contesting = contesting;
	}
}

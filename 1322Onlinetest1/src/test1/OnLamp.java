package test1;

public class OnLamp extends CU_Lamp{

	 public OnLamp(boolean status) {
			this.status=status;
		} 
		@Override
		public void lightLamp(String message) {
			System.out.println("On Lamp "+message);
			
		}

}

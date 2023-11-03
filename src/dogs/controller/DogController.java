package dogs.controller;

import dogs.view.DogCreateView;

public class DogController implements IDogController{


	
	public DogController() {
		
	}
	
	@Override
	public void goToCreate() {
		DogCreateView dogCreateView = new DogCreateView(this);
		dogCreateView.display();
	}
	

}

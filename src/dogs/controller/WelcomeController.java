package dogs.controller;

import dataSeeder.DataSeeder;
import dogRepository.DogMemoryRepository;
import dogRepository.IDogRepository;
import dogs.view.IView;
import dogs.view.WelcomeView;

public class WelcomeController implements IWelcomeController {

	private IDogController controller;
	
	public WelcomeController(IDogController controller) {
		this.controller = controller;
	}
	
	@Override
	public void startApplication() {
		IView welcomeView = new WelcomeView(this);
		welcomeView.display();
	}
	
	@Override
	public void wantToCreateDog() {
		this.controller.goToCreate();
	}
}

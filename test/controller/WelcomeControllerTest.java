package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dogs.controller.DogController;
import dogs.controller.WelcomeController;
import mock.DogControllerSpy;

class WelcomeControllerTest {

	@Test
	void WelcomeControllerCanCallDogController() {
		//Arrange
		DogControllerSpy dogController = new DogControllerSpy();
		WelcomeController welcomeController = new WelcomeController(dogController);
		
		//Act
		welcomeController.wantToCreateDog();
		
		//Assert
		assertTrue(dogController.hasGoToCreateBeenCalled);
	}

}

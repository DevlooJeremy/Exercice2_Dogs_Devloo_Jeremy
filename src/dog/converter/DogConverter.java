package dog.converter;

import dogs.model.Dog;
import dto.DogDTO;

public class DogConverter {

	public Dog dtoToDog(DogDTO dogDTO) {
		return new Dog(dogDTO.name,dogDTO.breed);
	}
	
	public DogDTO dogToDTO(Dog dog) {
		return new DogDTO(dog.getName(),dog.getBreed());
	}
}

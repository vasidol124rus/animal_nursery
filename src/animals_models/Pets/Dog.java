package animals_models.Pets;

import java.time.LocalDate;

class Dog extends Pets {
    public Dog(String name, String breed, LocalDate birthdate) {
        super(name, breed, birthdate);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + getBreed() + '\'' +
                ", name='" + getName() + '\'' +
                ", type='" + getType() + '\'' +
                ", birthdate=" + getBirthdate() +
                ", commands=" + getCommands() +
                '}';
    }
}

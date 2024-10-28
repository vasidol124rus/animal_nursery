package animals_models.Pets;

import java.time.LocalDate;

class Cat extends Pets {
    public Cat(String name, String breed, LocalDate birthdate) {
        super(name, breed, birthdate);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + getBreed() + '\'' +
                ", name='" + getName() + '\'' +
                ", type='" + getType() + '\'' +
                ", birthdate=" + getBirthdate() +
                ", commands=" + getCommands() +
                '}';
    }
}

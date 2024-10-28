package animals_models.Pets;

import java.time.LocalDate;

class Hamster extends Pets {
    public Hamster(String name, String breed, LocalDate birthdate) {
        super(name, breed, birthdate);
    }

    @Override
    public String toString() {
        return "Hamster{" +
                "breed='" + getBreed() + '\'' +
                ", name='" + getName() + '\'' +
                ", type='" + getType() + '\'' +
                ", birthdate=" + getBirthdate() +
                ", commands=" + getCommands() +
                '}';
    }
}

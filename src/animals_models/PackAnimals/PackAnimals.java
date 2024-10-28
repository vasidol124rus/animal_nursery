package animals_models.PackAnimals;

import animals_models.Animal;

import java.time.LocalDate;

class PackAnimals extends Animal {
    public PackAnimals(String name, String type, LocalDate birthdate) {
        super(name, type, birthdate);
    }

    @Override
    public String toString() {
        return "PackAnimals{" +
                "name='" + getName() + '\'' +
                ", type='" + getType() + '\'' +
                ", birthdate=" + getBirthdate() +
                ", commands=" + getCommands() +
                '}';
    }
}

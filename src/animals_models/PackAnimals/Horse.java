package animals_models.PackAnimals;

import java.time.LocalDate;

class Horse extends PackAnimals {
    public Horse(String name, String breed, LocalDate birthdate) {
        super(name, "Horse", birthdate);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + getName() + '\'' +
                ", type='" + getType() + '\'' +
                ", birthdate=" + getBirthdate() +
                ", commands=" + getCommands() +
                '}';
    }
}

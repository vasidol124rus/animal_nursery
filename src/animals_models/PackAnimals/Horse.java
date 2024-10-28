package animals_models.PackAnimals;

import java.time.LocalDate;

public class Horse extends PackAnimals {
    public Horse(String name, LocalDate birthdate) {
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

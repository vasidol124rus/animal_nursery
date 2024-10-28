package animals_models.PackAnimals;

import java.time.LocalDate;

public class Donkey extends PackAnimals {
    public Donkey(String name, LocalDate birthdate) {
        super(name, "Donkey", birthdate);
    }

    @Override
    public String toString() {
        return "Donkey{" +
                "name='" + getName() + '\'' +
                ", type='" + getType() + '\'' +
                ", birthdate=" + getBirthdate() +
                ", commands=" + getCommands() +
                '}';
    }
}

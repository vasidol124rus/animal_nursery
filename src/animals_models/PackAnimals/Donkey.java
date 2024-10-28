package animals_models.PackAnimals;

import java.time.LocalDate;

class Donkey extends PackAnimals {
    public Donkey(String name, String breed, LocalDate birthdate) {
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

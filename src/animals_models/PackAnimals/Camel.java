package animals_models.PackAnimals;

import java.time.LocalDate;

class Camel extends PackAnimals {
    public Camel(String name, LocalDate birthdate) {
        super(name, "Camel", birthdate);
    }

    @Override
    public String toString() {
        return "Camel{" +
                "name='" + getName() + '\'' +
                ", type='" + getType() + '\'' +
                ", birthdate=" + getBirthdate() +
                ", commands=" + getCommands() +
                '}';
    }
}

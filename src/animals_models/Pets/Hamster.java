package animals_models.Pets;

import java.time.LocalDate;

public class Hamster extends Pets {
    public Hamster(String name, LocalDate birthdate) {
        super(name, birthdate);
    }

    @Override
    public String toString() {
        return "Hamster{"+
                " name='" + getName() + '\'' +
                ", type='" + getType() + '\'' +
                ", birthdate=" + getBirthdate() +
                ", commands=" + getCommands() +
                '}';
    }
}

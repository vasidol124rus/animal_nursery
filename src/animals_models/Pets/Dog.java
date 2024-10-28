package animals_models.Pets;

import java.time.LocalDate;

public class Dog extends Pets {
    public Dog(String name, LocalDate birthdate) {
        super(name, birthdate);
    }

    @Override
    public String toString() {
        return "Dog{"+
                " name='" + getName() + '\'' +
                ", type='" + getType() + '\'' +
                ", birthdate=" + getBirthdate() +
                ", commands=" + getCommands() +
                '}';
    }
}

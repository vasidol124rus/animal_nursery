package animals_models.Pets;

import java.time.LocalDate;

public class Cat extends Pets {
    public Cat(String name, LocalDate birthdate) {
        super(name, birthdate);
    }

    @Override
    public String toString() {
        return "Cat{" +
                " name='" + getName() + '\'' +
                ", type='" + getType() + '\'' +
                ", birthdate=" + getBirthdate() +
                ", commands=" + getCommands() +
                '}';
    }
}

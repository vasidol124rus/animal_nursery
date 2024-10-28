package animals_models.Pets;

import animals_models.Animal;

import java.time.LocalDate;

class Pets extends Animal {


    public Pets(String name, LocalDate birthdate) {
        super(name, "Pets", birthdate);

    }


    @Override
    public String toString() {
        return "Pets{ "+
                " name='" + getName() + '\'' +
                ", type='" + getType() + '\'' +
                ", birthdate=" + getBirthdate() +
                ", commands=" + getCommands() +
                '}';
    }
}

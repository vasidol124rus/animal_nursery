package animals_models.Pets;

import animals_models.Animal;

import java.time.LocalDate;

class Pets extends Animal {
    private String breed;

    public Pets(String name, String breed, LocalDate birthdate) {
        super(name, "Pets", birthdate);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "breed='" + breed + '\'' +
                ", name='" + getName() + '\'' +
                ", type='" + getType() + '\'' +
                ", birthdate=" + getBirthdate() +
                ", commands=" + getCommands() +
                '}';
    }
}
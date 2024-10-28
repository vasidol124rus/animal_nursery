package animals_models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    private String name;
    private String type;
    private LocalDate birthdate;
    private List<String> commands = new ArrayList<>();

    public Animal(String name, String type, LocalDate birthdate) {
        this.name = name;
        this.type = type;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public List<String> getCommands() {
        return commands;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", birthdate=" + birthdate +
                ", commands=" + commands +
                '}';
    }
    public void learnCommand(String command) {
        commands.add(command);
    }
}


import animals_models.Animal;
import animals_models.PackAnimals.Camel;
import animals_models.PackAnimals.Donkey;
import animals_models.PackAnimals.Horse;
import animals_models.Pets.Cat;
import animals_models.Pets.Dog;
import animals_models.Pets.Hamster;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PetRegistry {
    static List<Animal> animals = new ArrayList<>();
    static Scanner in = new Scanner(System.in);
    static int animalCount = 0; // Счетчик животных

    public static void main(String[] args) {
        menu();
        int cmdItem = selMenu();
        while (cmdItem != 7) {
            switch (cmdItem) {
                case 1:
                    allAnimals();
                    break;
                case 2:
                    animalCount();
                    break;
                case 3:
                    newAnimal();
                    break;
                case 4:
                    newCommand();
                    break;
                case 5:
                    animalsByBirthDate();
                    break;
                case 6:
                    exit();
                    break;
                default:
                    System.out.println("Вы ввели неправильную команду!");
                    break;
            }
            menu();
            cmdItem = selMenu();
        }
        in.close();
    }

    // Методы для взаимодействия с пользователем
    static void menu() {
        System.out.println("\nМеню:");
        System.out.println("1. Печать всех животных");
        System.out.println("2. Печать количества животных");
        System.out.println("3. Добавить нового питомца");
        System.out.println("4. Обучить питомца новой команде");
        System.out.println("5. Вывести список животных по дате рождения");
        System.out.println("6. Выход из программы");
        System.out.print("Введите номер команды: ");
    }

    static int selMenu() {
        return in.nextInt();
    }

    static void exit() {
        System.out.println("До свидания!");
    }

    // Методы для работы с животными
    static void allAnimals() {
        if (animals.isEmpty()) {
            System.out.println("В реестре нет животных.");
            return;
        }
        System.out.println("\nСписок всех животных:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    static void animalCount() {
        System.out.println("\nОбщее количество животных: " + animalCount);
    }

    static void newAnimal() {
        System.out.println("\nДобавление нового животного:");
        System.out.print("Введите имя: ");
        in.nextLine(); // Очистка буфера
        String name = in.nextLine();
        System.out.print("Введите тип (Dog, Cat, Hamster, Horse, Donkey, Camel): ");
        String type = in.nextLine();

        System.out.print("Введите дату рождения (YYYY-MM-DD): ");
        LocalDate birthdate = LocalDate.parse(in.nextLine());


        Animal newAnimal = null;
        switch (type.toLowerCase()) {
            case "dog":
                newAnimal = new Dog(name, birthdate);
                break;
            case "cat":
                newAnimal = new Cat(name, birthdate);
                break;
            case "hamster":
                newAnimal = new Hamster(name, birthdate);
                break;
            case "horse":
                newAnimal = new Horse(name, birthdate);
                break;
            case "donkey":
                newAnimal = new Donkey(name, birthdate);
                break;
            case "camel":
                newAnimal = new Camel(name, birthdate);
                break;
            default:
                System.out.println("Неверный тип животного.");
                return;
        }

        if (newAnimal != null) {
            animals.add(newAnimal);
            animalCount++; // Увеличиваем счетчик животных
            System.out.println("Животное успешно добавлено!");
        }
    }


    static void newCommand() {
        System.out.println("Введите имя животного: ");
        in.nextLine();
        String name = in.nextLine();
        System.out.print("Введите новую команду: ");
        String command = in.nextLine();
        boolean found = false;
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                animal.learnCommand(command);
                System.out.println("Команда '" + command + "' добавлена к " + animal.getName());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Животное с таким именем не найдено.");
        }
    }

    static void animalsByBirthDate() {
        if (animals.isEmpty()) {
            System.out.println("В реестре нет животных.");
            return;
        }
        System.out.println("\nСписок животных по дате рождения:");
        animals.sort(Comparator.comparing(Animal::getBirthdate));
        for (Animal animal : animals) {
            System.out.println(animal);
        }

    }
}

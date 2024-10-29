# Итоговая контрольная работа


## Информация о проекте

### Необходимо организовать систему учета для питомника в котором живут домашние и Pack animals

### Задание
Операционные системы и виртуализация (Linux)
### 1. Использование команды cat в Linux

1.1 Создать два текстовых файла: "Pets"(Домашние животные) и "Pack animals"(вьючные животные), используя команду cat в терминале Linux. В первом файле перечислить собак, кошек и хомяков. Во втором — лошадей, верблюдов и ослов.

━➤ cat > pets.txt

━➤ cat > Pack_animals.txt

![1.png](src%2FPhoto%2F1.png)

1.2 Объединить содержимое этих двух файлов в один и просмотреть его содержимое.

━➤ cat pets.txt Pack_animals.txt > HumanFriends.txt

1.3 Переименовать получившийся файл в animals

━➤ mv HumanFriends.txt animals.txt

![2.png](src%2FPhoto%2F2.png)
### 2. Работа с директориями в Linux
   2.1 Создать новую директорию и переместить туда файл "animals.txt".

━➤ mkdir animal_nursery

━➤ mv animals.txt animal_nursery

![3.png](src%2FPhoto%2F3.png)

### 3. Работа с MySQL в Linux. “Установить MySQL на вашу вычислительную машину ”
   Подключить дополнительный репозиторий MySQL и установить один из пакетов из этого репозитория.

━➤ sudo apt-get update

━➤ wget -c https://repo.mysql. com/mysql-apt-config_0.8.17-1_all.deb

━➤ sudo dpkg -i mysql-apt-config_0.8.17-1_all.deb

![4.png](src%2FPhoto%2F4.png)

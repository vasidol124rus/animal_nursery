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

![5.png](src%2FPhoto%2F5.png)

![4.png](src%2FPhoto%2F4.png)

━➤ systemctl status mysql.service

![9.png](src%2FPhoto%2F9.png)

━➤ sudo apt-get install mysql-server

![10.png](src%2FPhoto%2F10.png)

━➤ sudo mysql -u root -p

![12.png](src%2FPhoto%2F12.png)

### 4. Управление deb-пакетами
   Установить и затем удалить deb-пакет, используя команду dpkg.
   dpkg — пакетный менеджер в Debian-подобных системах. 
   Главное отличие от утилиты apt состоит в том, что dpkg работает только с локальными пакетами, он не умеет искать и устанавливать пакеты из репозиториев.


━➤ sudo dpkg -i google-chrome-stable_current_amd64.deb

━➤ sudo dpkg --remove google-chrome-stable

![15.png](src%2FPhoto%2F15.png)

### 5. История команд в терминале Ubuntu

[Команды в Ubuntu.txt](src%2FPhoto%2F%CA%EE%EC%E0%ED%E4%FB%20%E2%20Ubuntu.txt)

## Объектно-ориентированное программирование

### 6. Диаграмма классов
   Создать диаграмму классов с родительским классом "Животные", и двумя подклассами: "Pets" и "Pack animals".

![диаграмма.png](src%2FPhoto%2F%E4%E8%E0%E3%F0%E0%EC%EC%E0.png)

### 7. Работа с MySQL (Задача выполняется в случае успешного выполнения задачи “Работа с MySQL в Linux. “Установить MySQL на вашу машину”
   
В ранее подключенном MySQL создать базу данных с названием "Human Friends".
   
mysql> CREATE DATABASE IF NOT EXISTS HumanFriends;

Query OK, 1 row affected (0,01 sec)

mysql> USE HumanFriends;

Database changed

Создать таблицы, соответствующие иерархии из вашей диаграммы классов.

Заполнить таблицы данными о животных, их командах и датами рождения.

![16.png](src%2FPhoto%2F16.png)

![17.png](src%2FPhoto%2F17.png)

![18.png](src%2FPhoto%2F18.png)

![19.png](src%2FPhoto%2F19.png)

![20.png](src%2FPhoto%2F20.png)

![21.png](src%2FPhoto%2F21.png)

![22.png](src%2FPhoto%2F22.png)

![23.png](src%2FPhoto%2F23.png)

![24.png](src%2FPhoto%2F24.png)

![25.png](src%2FPhoto%2F25.png)

![26.png](src%2FPhoto%2F26.png)

![27.png](src%2FPhoto%2F27.png)

![28.png](src%2FPhoto%2F28.png)

![29.png](src%2FPhoto%2F29.png)

Удалить записи о верблюдах и объединить таблицы лошадей и ослов.

![30.png](src%2FPhoto%2F30.png)

Создать новую таблицу для животных в возрасте от 1 до 3 лет и вычислить их возраст с точностью до месяца.

Объединить все созданные таблицы в одну, сохраняя информацию о принадлежности к исходным таблицам.

![33.png](src%2FPhoto%2F33.png)

![35.png](src%2FPhoto%2F35.png)

## 8. ООП и Java
   Создать иерархию классов в Java, который будет повторять диаграмму классов созданную в задаче 6 (Диаграмма классов) .
### 9.Программа-реестр домашних животных
   Написать программу на Java, которая будет имитировать реестр домашних животных.
   Должен быть реализован следующий функционал:

9.1. Добавление нового животного
Реализовать функциональность для добавления новых животных в реестр.
Животное должно определяться в правильный класс (например, "собака", "кошка", "хомяк" и т.д.)

9.2. Список команд животного
Вывести список команд, которые может выполнять добавленное животное (например, "сидеть", "лежать").

9.3. Обучение новым командам
Добавить возможность обучать животных новым командам.

9.4 Вывести список животных по дате рождения
9.5. Навигация по меню
Реализовать консольный пользовательский интерфейс с меню для навигации между вышеуказанными функциями.

## 10. Счетчик животных

Создать механизм, который позволяет вывести на экран общее количество созданных животных любого типа (Как домашних, так и вьючных), то есть при создании каждого нового животного счетчик увеличивается на “1”.
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

Объектно-ориентированное программирование
6. Диаграмма классов
   Создать диаграмму классов с родительским классом "Животные", и двумя подклассами: "Pets" и "Pack animals".



public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = lastName +" "+ firstName +" "+ middleName;
        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = lastName +" "+ firstName +" "+ middleName;
        System.out.println("ФИО сотрудника — " + fullName.toUpperCase());
    }

    public static void task3 () {
        System.out.println("Задача 3");
        String firstName = "Семён";
        String lastName = "Иванов";
        String middleName = "Семёнович";
        String fullName = lastName +" "+ firstName +" "+ middleName;
        System.out.println("ФИО сотрудника — " + fullName.replace('ё','е'));
    }
}

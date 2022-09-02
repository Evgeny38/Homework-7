public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // TASK 1.
        String firstName = "Ivan";
        String secondName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " +firstName+" "+ secondName ;
        System.out.println("ФИО - " + fullName);

        // TASK 2.
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("ФИО ДЛЯ ОТЧЕТА: " + fullNameUpper);

        // TASK 3.
        String fullNameS = "Иванов Семён Семёнович";
        fullNameS = fullNameS.replace("ё", "е");
        fullNameS = fullNameS.replace("Ё", "Е");
        System.out.println("Данные ФИО сотрудника - " + fullNameS);

    }
}
public class Main {
    public static void main(String[] args) {
//        Задача 1
        System.out.println("  Задача 1");
        String firstName = "Ivan";
        firstName = firstName + " ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        lastName = lastName + " ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        //        Задача 2
        System.out.println("  Задача 2");
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName);
        //        Задача 3
        System.out.println("  Задача 3");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullName);

    }
}
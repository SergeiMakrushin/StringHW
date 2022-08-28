public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //task 01//

        String firstName = "Ivanov";
        String lastName = "Ivan";
        String middleName = "Ivanovich";
        String fullName = "";
        String[] name = {"Ivanov", "Ivan", "Ivanovich"};

        for (int i = 0; i < name.length; i++) {
            if (i < name.length - 1)
                fullName += name[i] + " ";
            else
                fullName += name[i] + ".";
        }
        System.out.print("ФИО сотрудника: " + fullName);
        System.out.println();

        //task 02//

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        // task 03//

        fullName = "Иванов Семён Семёнович";
        if (fullName.contains("ё"))
            fullName = fullName.replace("ё", "е");
        if (fullName.contains("Ё")) {
            fullName = fullName.replace("Ё", "Е");
        }
        
        System.out.println(fullName);


    }


}

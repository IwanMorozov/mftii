import java.util.Arrays;

public class DZ169 {
    private String name;
    private int[] grades;

    public DZ169(String name, int... grades) {
        this.name = name;
        setGrades(grades); // Используем метод установки оценок для проверки
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getGrades() {
        return Arrays.copyOf(grades, grades.length); // Возвращаем копию массива для защиты от изменения
    }

    public void setGrades(int... grades) {
        for (int grade : grades) {
            if (grade < 2 || grade > 5) {
                throw new IllegalArgumentException("Оценка должна быть в диапазоне от 2 до 5");
            }
        }
        this.grades = Arrays.copyOf(grades, grades.length); // Создаем копию массива для защиты от изменения
    }

    public double getAverageGrade() {
        if (grades.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public boolean isExcellent() {
        if (grades.length == 0) {
            return false;
        }
        for (int grade : grades) {
            if (grade < 5) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", Оценки: " + Arrays.toString(grades);
    }

    public static void main(String[] args) {
        try {
            DZ169 student1 = new DZ169("Иван");
            System.out.println(student1);
            System.out.println("Средняя оценка: " + student1.getAverageGrade());
            System.out.println("Отличник: " + student1.isExcellent());

            DZ169 student2 = new DZ169("Мария", 5, 5, 5, 5);
            System.out.println(student2);
            System.out.println("Средняя оценка: " + student2.getAverageGrade());
            System.out.println("Отличник: " + student2.isExcellent());

            DZ169 student3 = new DZ169("Петр", 5, 4, 3, 5);
            System.out.println(student3);
            System.out.println("Средняя оценка: " + student3.getAverageGrade());
            System.out.println("Отличник: " + student3.isExcellent());

            // Попытка задать некорректную оценку
            DZ169 student4 = new DZ169("Николай", 6, 4, 3);
            System.out.println(student4); // Используем переменную student4, чтобы избежать предупреждения

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        try {
            DZ169 student5 = new DZ169("Анна");
            student5.setGrades(5, 4, 2);
            System.out.println(student5);
            System.out.println("Средняя оценка: " + student5.getAverageGrade());
            System.out.println("Отличник: " + student5.isExcellent());

            // Попытка задать некорректную оценку через сеттер
            student5.setGrades(1, 4, 3);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
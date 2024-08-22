class Department {
    private final String name;
    private Employee head;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Employee getHead() {
        return head;
    }

    public void setHead(Employee head) {
        this.head = head;
        if (head.getDepartment() != this) {
            head.setDepartment(this);
        }
    }
}

class Employee {
    private final String name;
    private Department department;

    public Employee(String name) {
        this.name = name;
    }

    public void setDepartment(Department department) {
        this.department = department;
        if (department.getHead() == null) {
            department.setHead(this);
        }
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        if (department.getHead() == this) {
            return name + " начальник отдела " + department.getName();
        } else {
            return name + " работает в отделе " + department.getName() + ", начальник которого " + department.getHead().name;
        }
    }

    public String getName() {
        return name;
    }
}

class Main {
    public static void main(String[] args) {
        // Создаем отдел IT
        Department itDepartment = new Department("IT");

        // Создаем сотрудников
        Employee petrov = new Employee("Петров");
        Employee kozlov = new Employee("Козлов");
        Employee sidorov = new Employee("Сидоров");

        // Устанавливаем отдел для сотрудников
        petrov.setDepartment(itDepartment);
        kozlov.setDepartment(itDepartment);
        sidorov.setDepartment(itDepartment);

        // Назначаем Козлова начальником отдела IT
        itDepartment.setHead(kozlov);

        // Выводим на экран текстовое представление всех сотрудников
        System.out.println(petrov);   // Петров работает в отделе IT, начальник которого Козлов
        System.out.println(kozlov);   // Козлов начальник отдела IT
        System.out.println(sidorov);  // Сидоров работает в отделе IT, начальник которого Козлов
    }
}

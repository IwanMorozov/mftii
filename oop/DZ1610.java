import java.util.ArrayList;
import java.util.List;

class DZ1610 {
    private final String name;
    private final List<Path> paths;

    public DZ1610(String name) {
        this.name = name;
        this.paths = new ArrayList<>();
    }

    public DZ1610(String name, Path[] initialPaths) {
        this.name = name;
        this.paths = new ArrayList<>();
        if (initialPaths != null) {
            for (Path path : initialPaths) {
                addPath(path.getCity(), path.getCost());
            }
        }
    }

    public void addPath(DZ1610 city, int cost) {
        for (Path path : paths) {
            if (path.getCity().getName().equals(city.getName())) {
                path.setCost(cost); // Обновляем стоимость существующего пути
                return;
            }
        }
        paths.add(new Path(city, cost)); // Добавляем новый путь
    }

    public void removePath(DZ1610 city) {
        paths.removeIf(path -> path.getCity().getName().equals(city.getName()));
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(name + " -> [");
        for (Path path : paths) {
            result.append(path.getCity().getName()).append(": ").append(path.getCost()).append(", ");
        }
        if (!paths.isEmpty()) {
            result.setLength(result.length() - 2); // Удаляем последнюю запятую и пробел
        }
        result.append("]");
        return result.toString();
    }

    private static class Path {
        private final DZ1610 city;
        private int cost;

        public Path(DZ1610 city, int cost) {
            this.city = city;
            this.cost = cost;
        }

        public DZ1610 getCity() {
            return city;
        }

        public int getCost() {
            return cost;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }
    }

    public static void main(String[] args) {
        // Создание городов с путями
        DZ1610 cityA = new DZ1610("City A");
        DZ1610 cityB = new DZ1610("City B");
        DZ1610 cityC = new DZ1610("City C", new Path[]{new Path(cityA, 30)});

        // Добавление путей
        cityA.addPath(cityB, 10);
        cityA.addPath(cityC, 20);
        cityB.addPath(cityC, 5);

        // Печать городов и их путей
        System.out.println(cityA);  // City A -> [City B: 10, City C: 20]
        System.out.println(cityB);  // City B -> [City C: 5]
        System.out.println(cityC);  // City C -> [City A: 30]

        // Обновление стоимости пути
        cityA.addPath(cityB, 15);
        System.out.println(cityA);  // City A -> [City B: 15, City C: 20]

        // Удаление пути
        cityA.removePath(cityC);
        System.out.println(cityA);  // City A -> [City B: 15]

        // Добавление нового пути в уже существующий город
        cityC.addPath(cityB, 25);
        System.out.println(cityC);  // City C -> [City A: 30, City B: 25]

        // Удаление пути из другого города
        cityB.removePath(cityC);
        System.out.println(cityB);  // City B -> []
    }
}
package dz166;

final class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" + x + ";" + y + "}";
    }
}

final class Line {
    private Point start;
    private Point end;

    // Конструктор с указанием начальной и конечной точки
    public Line(Point start, Point end) {
        this.start = new Point(start.getX(), start.getY());
        this.end = new Point(end.getX(), end.getY());
    }

    // Конструктор с указанием координат начала и конца
    public Line(int x1, int y1, int x2, int y2) {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    public Point getStart() {
        return new Point(start.getX(), start.getY());
    }

    public Point getEnd() {
        return new Point(end.getX(), end.getY());
    }

    public void setStart(Point start) {
        this.start = new Point(start.getX(), start.getY());
    }

    public void setEnd(Point end) {
        this.end = new Point(end.getX(), end.getY());
    }

    public void setStart(int x, int y) {
        this.start.setX(x);
        this.start.setY(y);
    }

    public void setEnd(int x, int y) {
        this.end.setX(x);
        this.end.setY(y);
    }

    // Метод для вычисления расстояния между точками
    public int getLength() {
        int deltaX = end.getX() - start.getX();
        int deltaY = end.getY() - start.getY();
        return (int) Math.round(Math.sqrt(deltaX * deltaX + deltaY * deltaY));
    }

    @Override
    public String toString() {
        return "Линия от " + start + " до " + end;
    }

    public static void main(String[] args) {
        // Создание линии с использованием координат
        Line line = new Line(1, 1, 10, 15);
        System.out.println(line); // Вывод: Линия от {1;1} до {10;15}
        System.out.println("Длина линии: " + line.getLength()); // Вывод длины линии

        // Изменение координат начала и конца линии
        line.setStart(2, 2);
        line.setEnd(12, 18);
        System.out.println(line); // Вывод: Линия от {2;2} до {12;18}
        System.out.println("Длина линии: " + line.getLength()); // Вывод длины линии

        // Создание линии с использованием объектов Point
        Point start = new Point(3, 3);
        Point end = new Point(13, 19);
        Line line2 = new Line(start, end);
        System.out.println(line2); // Вывод: Линия от {3;3} до {13;19}

        // Запрос координат начала и конца линии
        Point line2Start = line2.getStart();
        Point line2End = line2.getEnd();
        System.out.println("Координаты начала линии2: " + line2Start); // Вывод: Координаты начала линии2: {3;3}
        System.out.println("Координаты конца линии2: " + line2End); // Вывод: Координаты конца линии2: {13;19}

        // Изменение координат начала и конца линии
        line2.setStart(new Point(4, 4));
        line2.setEnd(new Point(14, 20));
        System.out.println(line2); // Вывод: Линия от {4;4} до {14;20}
        System.out.println("Длина линии: " + line2.getLength()); // Вывод длины линии
    }
}
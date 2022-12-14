package lesson2.homework.HomeworkBase;

public class HomeWorkBase {
    public static void main(String[] args) {
        //Базовая домашка
        //Задача №1
        //Создать переменные с ростом (!в метрах), весом.
        //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
        //Пример результата вывода на экран:
        //21.00202130120
        double height = 2.03;
        int weight = 96;
        double index = weight / (height * height);
        System.out.println(index);

        // Задание №2
        // Дано:
        int ageChildren = 10;
        // Задача: Написать условную конструкцию, которая в зависимости от возраста ребенка,
        // отправляет его в учебное заведение
        // если ребенку до 6 лет то в сад,
        // если до 11 лет в младшую школу,
        // если до 17 лет в среднюю школу,
        // иначе в университет
        // Отправляет - имеется в виду, печатает на экран: "пошел в сад", "пошел в младшую школу" и т.д.
        // Проверьте работоспособность условий, через изменение значения переменной.
        if (ageChildren < 6) {
            System.out.println("Отправляем ребенка в детский сад");
        } else if (ageChildren < 11) {
            System.out.println("Отправляем ребенка в младшую школу");
        } else if (ageChildren < 17) {
            System.out.println("Отправляем ребенка в среднюю школу");
        } else {
            System.out.println("Отправляем ребенка в университет");
        }

        // Задание №3
        // Дано:

        //Курица
        boolean chicken = true;
        //Овощи
        boolean vegetables = false;
        //Соус
        boolean sour = true;
        //Хлеб
        boolean toast = true;
        //Колбаса
        boolean sausage = true;
        //Яйца
        boolean eggs = true;

        boolean caesar = chicken && vegetables && sour && toast;
        boolean olivie = vegetables && (sausage || chicken) && eggs;

        if (caesar) {
            System.out.println("Повар делает Цезарь ");
        } else if (olivie) {
            System.out.println("Повар делает Оливье");
        } else if (vegetables) {
            System.out.println("Повар делает овощной салат");
        } else {
            System.out.println("Повар ничего не делает, ингридентов нет");
        }

        // Задача: Повара попросили сделать салат.
        // Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
        // Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
        // Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
        // Если ингредиентов нет, то повар объявляет: У меня ничего нет
        // Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному).
        // Либо объявить о невозможности сделать салат.
        // Ожидаемый результат: вывод на экран сделанного салата или объявление о том, что ничего нет.
        // Проверьте работоспособность условий, через изменение значения переменных.
    }
}

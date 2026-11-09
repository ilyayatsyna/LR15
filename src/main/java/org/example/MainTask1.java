package org.example;

import java.util.HashMap;
import java.util.Map;

public class MainTask1 {
    public static void main(String[] args) {
        Map<String, Tool> toolMap = new HashMap<>();

        toolMap.put("Дрель ударная", new Drill("Дрель ударная", 101, "Сверление бетона", 12));
        toolMap.put("Дрель аккумуляторная", new Drill("Дрель аккумуляторная", 102, "Закручивание шурупов", 6));
        toolMap.put("Дрель угловая", new Drill("Дрель угловая", 103, "Работа в углах", 8));

        toolMap.put("Пила дисковая", new Saw("Пила дисковая", 201, "Распил досок", "Твердосплавное"));
        toolMap.put("Пила сабельная", new Saw("Пила сабельная", 202, "Демонтаж конструкций", "Биметалл"));
        toolMap.put("Пила торцовочная", new Saw("Пила торцовочная", 203, "Точный угловой рез", "Алмазное"));

        toolMap.put("Шлифмашина ленточная", new Sander("Шлифмашина ленточная", 301, "Черновая шлифовка", 80));
        toolMap.put("Шлифмашина эксцентриковая", new Sander("Шлифмашина эксцентриковая", 302, "Финишная полировка", 240));

        System.out.println(" Список всех инструментов в Map");
        for (Map.Entry<String, Tool> entry : toolMap.entrySet()) {
            System.out.println("Ключ: [" + entry.getKey() + "] --> Значение: " + entry.getValue());
        }
    }
}
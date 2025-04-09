enum class Color {
    RED,
    BLUE,
    BLACK,
    ORANGE,
    WHITE,
    GREEN;
//вывод информации
    fun Info (color: Color) : String = "цвета: " +
            "красный, синий, черный, белый, коричневый, зеленый\n" +
            "текущий цвет: ${color.name}\n"
}
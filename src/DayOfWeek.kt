enum class DayOfWeek {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday;
    //вывод информации
    fun Info(day: DayOfWeek): String {
        val isweekend = if (Isweekend(day)) "выходной" else "будний"
        val nextday = Nextday(day).name
        val previousday = Previousday(day).name

        return "дни недели: " +
                "понедельник, вторник, среда, четверг, пятница, суббота, воскресенье " +
                "текущий день: ${day.name}\n"
                "тип дня: ${isweekend}\n"
                 "следущий день: ${nextday}\n"
                 "предыдущий день: ${previousday}"
    }
    fun Isweekend(day: DayOfWeek) : Boolean = day == Saturday || day == Sunday
    fun Nextday(day: DayOfWeek) = when (day)
    {
        Sunday -> Monday
        else -> values()[day.ordinal+1]
    }
    fun Previousday(day: DayOfWeek) = when (day)
    {
        Monday -> Sunday
        else -> values()[day.ordinal-1]
    }
}
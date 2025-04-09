enum class Status {
    Decorated,
    Assembled,
    OnTheWay,
    Ready;
    //вывод информации
    fun Info(status: Status): String {

        return "статус заказа: " +
                "офрмлен, собран, в пути, готов\n" +
                "текущий статус: ${status.name}\n"
    }
}
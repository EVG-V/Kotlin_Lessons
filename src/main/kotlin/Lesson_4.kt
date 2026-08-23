fun <E> returnEmail(userName:E?): String {
    return ("$userName@test.ru").lowercase()
}

fun main() {
    val userName: List<Any?> = listOf("TEST","...","email", 1, 'a', null)
    val usersEmails = userName.filterNotNull().map(::returnEmail)
    println("$userName ---> $usersEmails")
}
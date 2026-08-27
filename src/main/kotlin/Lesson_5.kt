////Дан список людей с их именами и возрастом. Сгруппируйте людей по возрасту и выведите количество людей в каждой возрастной группе.
//data class Person(val name: String, val age: Int)
//fun main() {
//    val people = listOf(
//        Person("Петя", 25),
//        Person("Вася", 30),
//        Person("Даша", 25),
//        Person("Женя", 30),
//        Person("Алексей", 20)
//    )
//   val result = people
//       .groupBy {it.age}
//       .mapValues { it.value.count() }
//
//println(result)
//
//}
//Дан список слов. Извлеките из списка только те слова, которые начинаются с буквы "A" и сгруппируйте их по количеству букв.

data class Word(val word: String)

fun main() {


    val wordsList: List<Word> = mutableListOf(
        Word("абрикос"),
        Word("ананас"),
        Word("апельсин"),
        Word("арбуз"),
        Word("банан"),
        Word("барбарис"),
        Word("вишня"),
        Word("груша"),
        Word("хурма"),
        Word("голубика"),
        Word("ГРЕПЙФРУТ"),
        Word("МАЛИНА"),
        Word("АЛЫЧА")
    )
    val result = wordsList
        .filter { it.word.startsWith("А") || it.word.startsWith('а') }
        .groupBy {it.word.length}
    println(result)
}

import java.util.Scanner

fun main() {
        val input = Scanner(System.`in`)
        val n = input.nextInt()
        val myList: MutableList<String> = mutableListOf<String>()
        for (i in 0..n - 1)
        myList.add(input.next())
        val filteredList = myList.filter { it.contains("B") || it.contains("b") || it.contains("M") || it.contains("m") }
        for (i in filteredList)
        println(i.uppercase())}
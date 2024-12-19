fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val listToRemove = list.toMutableList() // Create a copy
    listToRemove.removeIf { it > 2 }
    println(list) // Output: [1, 2, 3, 4, 5]
    println(listToRemove) // Output: [1, 2]

    // Another way to achieve the same result
    val list2 = mutableListOf<Int>(1, 2, 3, 4, 5)
    val newList = list2.filter { it <= 2 }.toMutableList()
    println(newList) // Output: [1, 2]
    println(list2)// Output: [1, 2, 3, 4, 5]

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    val newSet = set.filter { it <=2 }.toMutableSet()
    println(newSet) // Output: [1,2]
    println(set) // Output: [1, 2, 3, 4, 5]
} 
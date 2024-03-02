// This function to find the unique element in an array of number
fun singleNumber(numArray: IntArray): Int {
    var result = 0
    // Using XOR operation to find the unique element
    for (num in numArray) {
        result = result xor num
    }
    return result
}
fun main() {
    val numArray = intArrayOf(1, 1, 3, 3, 222,222, 5, 5, 6, 6)
    val single = singleNumber(numArray)
    println(single)
}
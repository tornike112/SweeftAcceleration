//This function adds two binary strings and returns the result
fun addBinary(a: String, b: String): String {
    var result = ""
    var sum = 0
    var i = a.length - 1
    var j = b.length - 1

    while (i >= 0 || j >= 0 || sum == 1) {
        sum += if (i >= 0) a[i] - '0' else 0
        sum += if (j >= 0) b[j] - '0' else 0

        result = (sum % 2 + '0'.code).toChar() + result
        sum /= 2
        i--
        j--
    }
    return result
}

fun main() {
    val a = "1011"
    val b = "1011"
    val sum = addBinary(a, b)
    println("Sum of $a and $b is $sum")
}
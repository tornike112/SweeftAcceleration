import kotlin.math.min
//This function finds the longest prefix among an array of words
fun longestPrefix(array:Array<String>):String{
    if (array.isEmpty()) return ""
    val first = array[0]
    val last = array[array.size - 1]
    val minLength = min(first.length, last.length)
    var i = 0
    while (i < minLength && first[i] == last[i]) {
        i++
    }
    return first.substring(0, i)
}
fun main(){
    val words = arrayOf("undo", "unsafe", "unsafe")
    val longestPrefix = longestPrefix(words)
    println("Longest prefix: $longestPrefix")
}
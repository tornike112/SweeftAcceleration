//This function counts the number of ways to climb a staircase
fun countVariants(stearsCount:Int):Int{
    if (stearsCount == 1) {
        return 1
    } else if (stearsCount == 2) {
        return 2
    }
    val wayToStairs = IntArray(stearsCount + 1)
    wayToStairs[1] = 1
    wayToStairs[2] = 2
    for (i in 3..stearsCount) {
        wayToStairs[i] = wayToStairs[i - 1] + wayToStairs[i - 2]
    }
    return wayToStairs[stearsCount]
}
fun main() {
    val n = 5
    println("Number of ways to climb $n stairs: ${countVariants(n)}")
}

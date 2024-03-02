//This function takes an integer amount as input and returns the minimum number of coins needed
// to split that amount
fun minSplit(amount: Int): Int{
    val coins = intArrayOf(50, 20, 10, 5, 1)
    var remainingAmount = amount
    var coinsNeeded = 0

    for (coinValue in coins) {
        while (remainingAmount>=coinValue){
            remainingAmount -=coinValue
            coinsNeeded++
        }
    }
    return coinsNeeded

}
fun main() {
    val amount = 500
    val minCoins = minSplit(amount)
    println("Minimum number of coins needed: $minCoins")
}
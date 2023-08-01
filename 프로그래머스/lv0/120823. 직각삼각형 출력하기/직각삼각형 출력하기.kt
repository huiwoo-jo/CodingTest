fun main(args: Array<String>) {
    val (n) = readLine()!!.split(' ').map(String::toInt)
    for(i in 1..n){
        println("*".repeat(i))
    }
}
fun main(){
    println("ADDITION")
    println("")
    print("Type the first number:")
    val n1 = readLine()!!.toDouble()
    print("Type the second number:")
    val n2 = readLine()!!.toDouble()
    println("")
    var result = n1 + n2
    println("RESULT:")
    println("" + n1 + " + " + n2 + " = " + result)
}
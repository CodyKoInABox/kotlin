fun main(){
    println("Even or Odd")
    println("")
    print("Type the number:")
    val number = readLine()!!.toInt()
    println("")
    if(number % 2 == 0){
        println("" + number + " is even")
    }
    else{
        println("" + number + " is odd")
    }
}
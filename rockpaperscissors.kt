import kotlin.random.Random

fun main(){

    println("Welcome to Rock Paper Scissors!")
    println()
    println("Choose your play:")
    println("1. Rock")
    println("2. Paper")
    println("3. Scissors")
    print("Type your play:")

    val player : Number? = readLine()?.toInt()
    val computer = Random.nextInt(1,4)

    //1 for player win / 2 for computer win / 3 for tie // 4 for invalid play
    var result : Number

    when(player){
        //rock
        1 -> if(computer == 2){
            result = 2
        }
        else if(computer == 1){
            result = 3
        }
        else{
            result = 1
        }

        //paper
        2 -> if(computer == 3){
            result = 2
        }
        else if(computer == 2){
            result = 3
        }
        else{
            result = 1
        }

        //scissors
        3 -> if(computer == 1){
            result = 2
        }
        else if(computer == 3){
            result = 3
        }
        else{
            result = 1
        }

        //null/other
        else -> result = 4
    }

    println()
    print("Your play: ")
    println(displayPlay(player))
    print("Computer play: ")
    println(displayPlay(computer))
    println()


    when(result){
        //player won
        1 -> println("You won =)")
        //computer won
        2 -> println("The computer won =(")
        //tie
        3 -> println("It's a tie!")
        //invalid play
        4 -> println("Invalid play.")
    }
}

fun displayPlay(play : Number?) : String{
    when(play){
        1-> return "Rock"
        2-> return "Paper"
        3-> return "Scissors"
        else -> return "Invalid"
    }
}
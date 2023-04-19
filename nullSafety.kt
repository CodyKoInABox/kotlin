fun main() {   
    
    // ? means CAN be null
    var safe: String? = "abc"

    // no ? means CAN'T be null
    var unsafe: String = "abc"

    safe = null
    // the code above works because safe CAN be null

    // unsafe = null
    // the commented code above woulnd't work because unsafe CAN'T be null

    //will print null as safe CAN be null
    println(safe)
    
    println(unsafe)    
    
}
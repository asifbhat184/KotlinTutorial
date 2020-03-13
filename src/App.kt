fun main(){
    println("hello!This is my first program in Kotlin.")
    var x =1
    println("value of x = $x before loop")
    while(x < 4) {
        println("in loop. x= $x")
        x =x+1
    }
    println("Outside loop.X = $x")
}
fun main() {
names()
    countries()
    digits()
     facts("chair","table","wall")
}
fun names(){
    var order  = arrayOf("Mercy","Ann" ,"Leila" ,"Kevin")
    println(order.contentToString())

}
fun countries() {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    var grammatical = println(cities.map { it.capitalize() })
    println(grammatical)
}
fun digits(){
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = numbers[2] + numbers[5]
println(sum)
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())
}
fun facts(nam1:String,nam2:String,nam3:String): String{
    var names = arrayOf(nam1,nam2,nam3)
    return (names.contentToString())
}

fun main() {
names("Anita","Bob", "Alice","Chris")
    countries()
    digits()
     facts("chair","table","wall")
}
fun names(tag1: String,tag2: String, tag3:String,tag4:String){
    var order  = arrayOf(tag1,tag2,tag3,tag4)
    println(order.contentToString())

}
fun countries() {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
   cities.forEach { cities-> println(cities.capitalize()) }
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

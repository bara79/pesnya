class Dog(val name: String, val weight_param: Int, val breed_param: String) {

    init {
        print("Собака $name была создана)")
    }

    var activitis = arrayOf("Walks")
    val breed = breed_param.toUpperCase()

    init {
        println("Порода $breed.")
    }
    var weight = weight_param
        set(value) {
            if(value>0)field = value
        }
    val weightInKgs: Double
    get() = weight /2.2

    fun bark (){
        println(if (weight<20)"гав" else "ГАВГАВ")
       }
}
fun main(){
    val myDog = Dog("Tuzik", 50,"Smes")
    myDog.bark()
    myDog.weight=75
    println("Вес в кило ${myDog.weightInKgs}")
    myDog.weight = -2
    println("Ves ${myDog.weight}")
    myDog.activitis = arrayOf("Misha","vdfvf","Пудель")
        for (item in myDog.activitis) {
            println("Моя собака $item")
        }

    val dogs = arrayOf(Dog("kelpi",20,"efff"), Dog("sfdsf",55,"ewer"))
    dogs[1].bark()
    dogs[1].weight= 15
    println("ves ${dogs[1].name}is ${dogs[1].weight}")
}

fun main() {
    //1(a)
var woman=Human("vanessa",33,56)
    woman.eat(12)
    println(woman.weight)

    // 1(b)
    woman.speak("Good Afternoon Class")


    // 1(c)
    woman.birthday()
    println(woman.age)


  //No.2
    var Student=user("Nancy","Awuor","anyangnanc6@gmail.com",742507422,"1342")
    println(Student.fName)
    println(Student.password)

}

//NO.1 (a)
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodweight:Int):Int{
        "$name is eating $weight kgs of food"
        weight+=foodweight
        return weight
    }

    //1(b)
    fun speak(speech:String){
        println(speech)

    }

   //1 (c)
    fun birthday(){
        age++
    }
}
// NO 2.
class user(var fName:String,var lName:String,var email:String,var contact:Int,var password:String){

}

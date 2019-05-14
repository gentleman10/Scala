
import scala.collection.mutable.ArrayBuffer
trait Pet{
  val name:String
}
class Cat(val name : String) extends Pet
class Dog(val name : String) extends Pet

object TestScalaSubType extends App{
  val dog = new Dog("Pamelion")
  val cat = new Cat("Tom")
  val animals = ArrayBuffer.empty[Pet] //subtyping
  animals.append(dog)
  animals.append(cat)
  animals.foreach(pet => println(pet.name)) //function helper methods
  
}









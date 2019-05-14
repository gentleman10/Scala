
abstract class Animal1{
  def name : String
}
abstract class Pet1 extends Animal1
{
  
}
class Cat1 extends Pet1
{
  override def name : String ="Cat1"
}
class Dog1 extends Pet1 
{
  override def name : String ="Dog1"
}
class Elephant1 extends Animal1 
{
  override def name: String ="ELe1"
}
class PetContainer[P <: Pet1](p:P){
  def pet : P=p 
}

object TestUpperTypeBounds extends App {
  //<: symbol for upper type bound
  // lower type bounds symbol - >:
  val dogContainer = new PetContainer[Dog1](new Dog1)
  val catContainer = new PetContainer[Cat1](new Cat1)
 // val ElephantContainer = new PetContainer[Elephant](new Elephant)
  //you get error bcoz elep is not a subtype of pet
  //val elecontainer = new Petcontainer[Elephant](new Elephant)
}
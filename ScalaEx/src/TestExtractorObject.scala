
import scala.util.Random
object CustomerID {
  def apply(name : String) = s"$name --${Random.nextLong}"
  def unapply(customerID : String) : Option[String] = {
    val name=customerID.split("--").head
    if(name.nonEmpty) Some(name) else None
  }
  }
object TestExtractorObject extends App {
val customerID =CustomerID("shashank")  //apply
println(customerID)
customerID match{
  case CustomerID(name) => println(name) //unapply
       
  case _ => println("could not extrat data")
}
}
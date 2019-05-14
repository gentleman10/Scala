
abstract class A
{
  val message : String
}
class B extends A{
  val message= " child class def"
}
trait C extends A{
  def loudMessage= message.toUpperCase()
}
class D extends B with C

class TestAbstractClass1 extends App{
val d=new D
println(d.message)
println(d.loudMessage)
}
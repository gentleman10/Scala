


trait TestTrait[A] 
{
 def hasNext:Boolean
 def next():A
}
class ImplTestTrait(to:Int) extends TestTrait[Int]{
  private var current =0
  override def hasNext: Boolean = current < to

  override def next() : Int = {
    if(hasNext) 
    {
        val t= current
        current +=1
        //return t
        t
        
  }
  else 0
}
}
object TestTraitExample extends App {
  

val iterator = new ImplTestTrait(10)
println(iterator.next())
println(iterator.next())

println(iterator.next())
println(iterator.next())
println(iterator.next())
}
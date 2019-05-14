

class Point {
  private var _x=0
  private var _y=0
  private val bound=100
  //setter declaration
  def x=_x
  //getter
  def x_=(newValue: Int): Unit ={
    if (newValue < bound) _x= newValue else printMorning
  }
  def y=_y
  def y_=(newValue :Int):Unit ={
    if(newValue < bound) _y= newValue else printMorning
}
private def printMorning = println("WARNING: oUT OF BOUNDS")
}
object test extends App
{
  val point1=new Point
point1.x=99
point1.y=181
println(point1.x)
println(point1.y)
}
  

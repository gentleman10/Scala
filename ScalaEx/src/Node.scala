

trait Node[+B] {   //+b is covariance, + indicates covariance
  def prepend[U >: B] (elem : U): Node[U]
  }
case class ListNode[+B](h: B, t : Node[B]) extends Node[B]
{
  def prepend[U>: B](elem :U) : ListNode[U] = ListNode(elem, this)
  def head: B=h
  def tail : Node[B]=t
}
case class Nil[+B]() extends Node[B]
{
  def prepend[U >: B](elem :U):ListNode[U] = ListNode(elem, this)
  
}
trait Bird
case class IndianSwallow() extends Bird
case class EuropeanSwallow()extends Bird


object TestLowerTypeBounds extends App {  

val indianSwallowList = ListNode [IndianSwallow](IndianSwallow(),Nil())
val birdList : Node[Bird] =indianSwallowList
birdList.prepend(new EuropeanSwallow)
}
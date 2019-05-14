abstract class AbsIterator{
  type T
  def hasNext : Boolean
  def next: T
  }

class StringIterator(s: String) extends AbsIterator {
  type T= Char
  private var i = 0
  def hasNext= i < s.length
def next= {
    val ch=s charAt i
    i += 1
    ch
    
  }
  }
trait Richiterator extends AbsIterator {
  def foreach(f : T => Unit) : Unit = while(hasNext) f(next)
}

  object TestAbstractClass2 extends App{
    class RichStringIter extends StringIterator("okay") with Richiterator
    val iter = new RichStringIter
    iter foreach println
  }

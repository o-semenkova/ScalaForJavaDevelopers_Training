// trait
trait CanCodeOnScala {
  def code(task: String): String
}

// multiple inheritance
//    A
//   / \
//  B   C
//   \ /
//    D
trait A {
  def calculate(string: String): Int
}

trait B extends A {
  /*override*/ def calculate(string: String): Int = string.length
}

trait C extends A {
  /*override*/ def calculate(string: String): Int = string.indexOf("b")
}

// mix
class D extends B with C {
  override def calculate(string: String): Int = super[B].calculate(string)
}

val d = new D

d.calculate("abcdef")
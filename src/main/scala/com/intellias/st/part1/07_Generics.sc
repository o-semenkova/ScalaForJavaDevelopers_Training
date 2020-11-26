// [] instead of <>
class Wrapper[T](val t: T)

def wrap[T](t: T): Wrapper[T] = ???

// no raw types
// List list = new ArrayList<String>();
// val value: Wrapper = new Wrapper("")
val value: Wrapper[String] = new Wrapper("")

// bounds
class UpperBoundedWrapper[T <: String]

def wrap[T <: String](t: T): UpperBoundedWrapper[T] = ???

class LowerBoundedWrapper[T >: String]

def wrap[T >: String](t: T): LowerBoundedWrapper[T] = ???

// A <| --- B <| --- C

class A

class B extends A

class C extends B

// todo: what we have in java?

// in/co/contra + variance
case class InvarianceWrapper[T](t: T)
case class CoWrapper[+T](t: T)
case class ContraWrapper[-T]()

//val x1: InvarianceWrapper[A] = InvarianceWrapper[B](new B())
val x2: InvarianceWrapper[B] = InvarianceWrapper[B](new B())
//val x3: InvarianceWrapper[C] = InvarianceWrapper[B](new B())

val y1: CoWrapper[A] = CoWrapper[B](new B())
val y2: CoWrapper[B] = CoWrapper[B](new B())
//val y3: CoWrapper[C] = CoWrapper[B](new B())

//val z1: ContraWrapper[A] = ContraWrapper[B]()
val z2: ContraWrapper[B] = ContraWrapper[B]()
val z3: ContraWrapper[C] = ContraWrapper[B]()

val l: List[A] = List[B](new B(), new B())

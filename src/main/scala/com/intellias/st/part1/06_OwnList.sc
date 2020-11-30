//Pair(head, tail) extend List | Nil extend List
//list = Nil
//list = Pair(1, Nil)
//list = Pair(1, Pair(2, Pair(1, Nil))) 1 2 1

sealed trait List[+T] {
  def head: T
  def tail: List[T]
  def addTwo[E >: T](e1: E, e2: E): List[E] = ???
  def ::[E >: T](elem: E): List[E] = new ::(elem, this)
}

case object Nil extends List[Nothing] {
  override def head: Nothing = ???

  override def tail: List[Nothing] = ???
}

final case class ::[+T](head: T, tail: List[T]) extends List[T]

val list: List[Int] = Nil.::(1)
val list: List[Int] = 1 :: Nil
val list2: List[Int] = ::(1, Nil)

val myList: List[Int] = ::(1, ::(2, ::(3, ::(4, ::(5, Nil)))))
val myList2: List[Int] = Nil.::(5).::(4).::(3).::(2).::(1)

val myList1: List[Int] = 1 :: 2 :: 3 :: 4 :: 5 :: Nil

myList1.addTwo(5, 5)
myList1 addTwo (5, 5)

val firstElement :: secondElement :: tail = myList
val ::(firstElement, ::(secondElement,tail)) = myList

myList1 match {
  case f :: s :: t =>

  case Nil =>
}

// :
case class Person(name: String) {
  def addFamily(family: String): Person = Person(name + " " + family)
  def addFamily_:(family: String): Person = Person(name + " " + family)
}

val ivan = Person("Ivan")

val person = ivan.addFamily("Ivaninv")
val person = ivan addFamily "Ivaninv"

val person = ivan.addFamily_:("Ivaninv")
val person = "Ivaninv" addFamily_: ivan


val m: Map[String, Int] = ???

val i = m("myKey")
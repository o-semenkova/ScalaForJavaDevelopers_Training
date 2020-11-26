
// immutable
// mutable

val seq: Seq[Int] = 1 to 10

seq(5)

val res = seq
  .view
  .filter(_ % 2 == 0)
  .map(Math.sqrt(_))
  .flatMap(x => List(x, x))
//  .map(_.toInt)
  .toList

val l: List[Option[Int]] = List(
  Some(1), None, Some(2), Some(4), Some(9), None
)

l.filter(_.isDefined).map(_.get)
l.flatten

// List + Option
val value = res ++ Option(5)
val value = Option(5) ++ res

// Maps
val iccMapping: Map[String, String] = Map(
  "UKR" -> "Ukraine",
  "DEU" -> "Germany",
  ("key", "value")
)
val updatedIccMapping = iccMapping +
  ("POL" -> "Poland") +
  (("BLR", "Belarus"))

updatedIccMapping("POL")
updatedIccMapping.get("POL")
updatedIccMapping.getOrElse("POL", "")

//
val s = Set[String]()

// Tuples
// Tuple3
val tuple: (Int, String, Int) = (1, "Ivan", 30)
//val tuple: Tuple3[Int, String, Int] = (1, "Ivan", 30)
val (id, name, age) = tuple

// todo: invert map (without swap)
val reverted = updatedIccMapping
//  .map(x => x._2 -> x._1)
//  .map(x => (x._2,  x._1))
  .map {
    case (icc@"UKR", country) => country -> icc
    case x => x
  }

updatedIccMapping.toList

List(
  1 -> "One",
  2 -> "Two"
).toMap


// Pitfall: mapValues (scala 2.11.X)

val iccToLength = updatedIccMapping.mapValues(str => {
  println(s"Heavy calculation for $str")
  str.length
})
//  .toMap

iccToLength("UKR")
iccToLength("UKR")
iccToLength("UKR")
iccToLength("UKR")
iccToLength("UKR")


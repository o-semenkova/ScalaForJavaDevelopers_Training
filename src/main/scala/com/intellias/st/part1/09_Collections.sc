
// immutable
// mutable

val list: Seq[Int] = 1 to 10

val res: List[Int] = list
  .filter(_ % 2 == 0)
  .map(Math.sqrt(_))
  .flatMap(x => List(x, x))
  .map(_.toInt)
  .toList

// List + Option
val value = res ++ Option(5)
val value = Option(5) ++ res

// Maps
val iccMapping: Map[String, String] = Map(
  "UKR" -> "Ukraine",
  "DEU" -> "Germany"
)
val updatedIccMapping = iccMapping +
  ("POL" -> "Poland") +
  (("BLR", "Belarus"))

updatedIccMapping("POL")
updatedIccMapping.get("POL")
updatedIccMapping.getOrElse("POL", "")

// Tuples
val tuple: (Int, String, Int) = (1, "Ivan", 30)
val (id, name, age) = tuple

// todo: invert map (without swap)
updatedIccMapping
//  .map(x => x._2 -> x._1)
//  .map {
//    case (icc, country) => country -> icc
//  }

updatedIccMapping.toList

List(
  1 -> "One",
  2 -> "Two"
).toMap


// Pitfall: mapValues (scala 2.11.X)

val iccToLength = updatedIccMapping.mapValues(str => {
  println("Heavy calculation")
  str.length
})
  .toMap

iccToLength("UKR")
iccToLength("UKR")
iccToLength("UKR")
iccToLength("UKR")
iccToLength("UKR")


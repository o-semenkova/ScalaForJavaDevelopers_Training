// Everything is expression

// while/do while but no break/continue

// if:
val a = 5
val isEven = a % 2 == 0
val isEvenHumanReadable = if (isEven) "Yes" else "No"

// for:
for (i <- 1 until 10; j <- 1 to i) {
  println(s"$i $j")
}
for {
  i <- 1 until 10
  j <- 1 to i
} {
  println(s"$i $j")
}

val b = for {
  i <- 1 until 10
  j <- 1 to i
} yield i -> j

// Pitfall 1:
val myList = if (false) {
  List(1, 3, 5)
} else {
  List(2, 4, 6)
} ++ List(10)

// Pitfall 2: not returning the result
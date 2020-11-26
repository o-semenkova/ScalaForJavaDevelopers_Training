val value = List(List(1, 2, 3), List(6, 5, 4))
value.flatten
value.flatMap(x => x.map(_.toString))
List(1, 2, 3, 6, 5, 4)

val value1 = List("My", "name", "is")
value1.flatMap(_.toCharArray)

"My".toCharArray
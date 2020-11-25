val toLength: String => Int = (x: String) => x.length
val toLength21: String => Int = x => x.length
val toLength22: String => Int = _.length
val toLength3 = (x: String) => x.length

type ToLength[T] = T => Int
val toLength4: ToLength[String] = _.length

toLength("four")

// in/co/contran
class A

class B extends A

class C extends B

val sum: (C, C) => A = (x: B, y: B) => x

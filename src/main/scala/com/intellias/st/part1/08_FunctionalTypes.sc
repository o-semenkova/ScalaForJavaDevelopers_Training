val toLength: String => Int = (x: String) => x.length

val toLength21: String => Int = x => x.length
val toLength22: String => Int = _.length

val toLength3 = (x: String) => x.length

val sum: (Int, Int) => Int = (x, y) => x + y
val sum2: (Int, Int) => Int = _ / _
val sum3: Function2[Int, Int, Int] = _ / _
// BiFunction<Integer, Integer, Integer> sum = (x, y) -> x + y;
sum2.apply(1, 5)

val complexFunc = (x : String) => (y: Int) => x.length + y

val intToInt = complexFunc("")
val i = intToInt(5)

complexFunc("")(5)

type ToLength[T] = T => Int

val toLength4: ToLength[String] = _.length

toLength("four")

// in/co/contran
class A

class B extends A

class C extends B

val sum0: (B, B) => B = (x: B, y: B) => new B()

val sum: C => A = (x: B) => new B()
// Function<B, B> b2b = ???
// A a = b2b.apply(new C());
// Function<C, A> c2a = b2b

val b: A = sum0(new C(), new C())
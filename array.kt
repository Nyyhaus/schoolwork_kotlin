fun main(args: Array<String>) {
  val numbers = Array(4) {i -> i * 3}
  val first = numbers[0]
	println("The first: $first")
	numbers.reverse()
	val last = numbers[0]
  println("The last: $last")
}

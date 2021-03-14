fun main (args: Array<String>)
{
	println("Type an integer #1:")
	var num1 = readLine()!!.toInt();
	
	println("Type an integer #2:")
	var num2 = readLine()!!.toInt();
	
	var sum = num1 + num2
	var sub = num1 - num2
	var product = num1 * num2
	
	println("$num1 + $num2 = ${sum}\n$num1 - $num2 = ${sub}\n$num1 * $num2 = ${product}")
}

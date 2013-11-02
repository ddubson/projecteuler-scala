// Mutable integer variable
var sum:Int = 0

// In Scala, the 'until' keyword is the operator for eclusivity
// The range loops from 1 to 999
for(i <- 1 until 1000; if(i % 3 == 0 || i % 5 == 0)) {
	sum = sum + i
}

println("The sum of all multiples of 3 and 5 below 1000: " + sum)
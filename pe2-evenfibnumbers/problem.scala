var evenSum:Int = 0
var save:Int = 0;

var previous:Int = 1;
var i:Int = 2;
do {
	if(i % 2 == 0){
		evenSum += i
	}

	save = i
	i += previous
	previous = save
} while (i <= 4000000)

println(evenSum)
// 4 Line to column

String s = System.console().readLine()
int num = s.length()
int leftPointer = 0
int rightPointer = 1
while (num != 0) {
	String letter = s.substring(leftPointer, rightPointer)
	println letter
	leftPointer++
	rightPointer++
	num--
	}
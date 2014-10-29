// 8 Palindrome

print "Enter your text: "
String s = System.console().readLine()
int sLength = s.length()
int rightPoint = sLength - 1
int leftPoint = 0
char left, right
boolean palindrome = true
boolean finished = ((rightPoint - leftPoint) <= 1)
while (!finished) {
	left = s.charAt(leftPoint)
	right =s.charAt(rightPoint)
	if (left != right) {
		leftPoint = rightPoint
		palindrome = false
	} else {
		leftPoint++
		rightPoint--
	}
}
if (!palindrome) {
	println s + " is not a palindrome."
} else {
	println s + " is a palindrome."

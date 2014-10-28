// 5 Counting letters

print "Enter a line of text: "
String s = System.console().readLine()
int countE = 0
int pointer = 0
int sLength = s.length()
while (pointer != sLength) {
	char letter = s.charAt(pointer)
	if (letter == 'e') {
		countE = countE + 1
		pointer++
	} else if (letter == 'E') { 
		countE = countE + 1
		pointer++
	} else {
		pointer++
	}
}
println "There are " + countE + " e characters"

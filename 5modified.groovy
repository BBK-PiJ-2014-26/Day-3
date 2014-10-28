// 5 Counting letters, modified for second part of problem

print "Enter a line of text: "
String s = System.console().readLine()
String str = null
boolean correctChar = false
while (!correctChar) {
	print "Please enter the character you wish to count: "
	str = System.console().readLine()
 	if (str.length() > 1) {
		println str + " is an incorrect entry. Try again."
	} else {
		correctChar = true
		}
}
char subject = str.charAt(0)	
int count = 0
int pointer = 0
int sLength = s.length()
while (pointer != sLength) {
	char letter = s.charAt(pointer)
	if (letter == subject) {
		count = count + 1
		pointer++
	} else {
		pointer++
	}
}
println "There are " + count + " " + subject + " characters."

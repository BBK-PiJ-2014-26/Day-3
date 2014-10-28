// 8 Palindrome

print "Enter your text: "
String s = System.console().readLine()
int sLength = s.length()
int pointer = sLength - 1
char sChar 
print s
	while (pointer != -1) {
		sChar = s.charAt(pointer)
		print sChar
		pointer--
	}
print "\n"
println "palindrome y'all"
		
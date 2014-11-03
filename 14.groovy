class Point {
	double x
	double y
}

class Rectangle {
	Point upLeft
	Point downRight
}

Rectangle a = new Rectangle()
Point upLeft = new Point()
a.upLeft = upLeft
Point downRight = new Point()
a.downRight = upLeft
Point measure = new Point()

print "Enter the x co-ordinate of the top left corner: "
String s = System.console().readLine()
upLeft.x = Double.parseDouble(s)
print "Now the y co-ordinate: "
s = System.console().readLine()
upLeft.y = Double.parseDouble(s) 

print "Enter the x co-ordinate of the bottom right corner: "
s = System.console().readLine()
downRight.x = Double.parseDouble(s)
print "Now the y co-ordinate: "
s = System.console().readLine()
downRight.y = Double.parseDouble(s) 

print "Enter the x co-ordinate of the point you wish to measure: "
s = System.console().readLine()
measure.x = Double.parseDouble(s)
print "Now the y co-ordinate: "
s = System.console().readLine()
measure.y = Double.parseDouble(s) 

if (measure.x >= upLeft.x && measure.x <= downRight.x) {
	if (measure.y <= upLeft.y && measure.y >= downRight.y) {
		println "Inside."
	} else {
		println "Outside."
	}
} else {
	println "Outside."
}
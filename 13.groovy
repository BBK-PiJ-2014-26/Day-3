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

double width = downRight.x - upLeft.x
double height = upLeft.y - downRight.x
double area = height * width

println "The rectangle has area " + area
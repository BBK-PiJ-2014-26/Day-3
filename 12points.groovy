// 12 Distance point-to-point

class Point {
	double x
	double y
	double h
}
	

Point point1 = new Point()
print "Add the x co-ordinate of point 1: "
String s = System.console().readLine()
point1.x = Double.parseDouble(s)
print "Add the y co-ordinate of point 1: "
s = System.console().readLine()
point1.y = Double.parseDouble(s)
point1.h = (point1.x * point1.x) + (point1.y * point1.y)
point1.h = Math.sqrt(point1.h)

Point point2 = new Point()
print "Add the x co-ordinate of point 2: "
s = System.console().readLine()
point2.x = Double.parseDouble(s)
print "Add the y co-ordinate of point 2: "
s = System.console().readLine()
point2.y = Double.parseDouble(s)
point2.h = Math.sqrt((point2.x * point2.x) + (point2.y * point2.y))

Point point3 = new Point()
print "Add the x co-ordinate of point 3: "
s = System.console().readLine()
point3.x = Double.parseDouble(s)
print "Add the y co-ordinate of point 3: "
s = System.console().readLine()
point3.y = Double.parseDouble(s)
point3.h = Math.sqrt((point3.x * point3.x) + (point3.y * point3.y))

if (point1.h <= point2.h) {
	if (point1.h <= point3.h) {
		println point1.x + ", " + point1.y + " is the closest co-ordinate."
	} else {
		println point3.x + ", " + point3.y + " is the closest co-ordinate."
	}
} else if (point2.h <= point3.h) {
	println point2.x + ", " + point2.y + " is the closest co-ordinate."
} else {
	println point3.x + ", " + point3.y + " is the closest co-ordinate."
}


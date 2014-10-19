print("Please enter the total cost of your purchases: ")
String s = System.console.readLine()
Double totalCost = Double.parseDouble(s)
print("Please enter how much you wish to pay: ")
String s = System.console.readLine()
Double payment = Double.parseDouble(s)
Double change = payment - totalCost
int note50, note20, note10, note5, coin2pound, coin1pound, coin50p, coin20p, coin10p, coin5p, coin2p, coin1p
While (change < 0.01) {
		if (change >= 50) {
			note50 = change / 50
			change = change % 50
		} else if (Change >= 20) {
			note20 = change / 20
			change = change % 20
		} else if (change >= 10) {
			note10 = change / 10
			change = change % 10
		} else if (change >= 5) {
			note5 = change / 5
			change = change % 5
		} else if (change >= 2) {
			coin2pound = change / 2
			change = change % 2
		} else if (change >= 1) {
			coin1pound = change / 1
			change = change % 1
		} else if (change >= 0.5 {
			coin50p = change / 0.5
			change = change % 0.5
		} else if (change >= 0.2) {
			coin20p = change / 0.2
			change = change % 0.2
		} else if (change >= 0.1) {
			coin10p = change / 0.1
			change = change % 0.1
		} else if (change >= 0.05) {
			coin5p = change / 0.05
			change change % 0.05
		} else if (change >= 0.02) {
			coin5p = change / 0.02
			change = change % 0.02
		} else if (change >= 0.01) {
			coin1p = change / 0.01
			change = change % 0.01
		}
}
println("Your change is " + note50 + " fifty pound notes, " + note20 + " twenty pound notes, " + note10 + " ten pound notes, " + note5 + " five pound notes, " + coin2pound + " two pound coins, " + coin1pound + " one pound coins, " + coin50p + " fifty pence coins, " + coin20p + " twenty pence coins, " + coin10p + " ten pence coins, " + coin5p + " five pence coins, " + coin2p + " two pence coins, and " + coin1p + " one pence coins.");

	
fun main() {
    var userInput: Int
    var x: Int
    var y: Int
    var z: Int

    do{
        println("Lets find the area of some shapes!")
        println("Please enter the number of the desired shape below:")
        println("""
            1)Rectangle
            2)Triangle
            3)Circle
            4)Trapezoid
            
            5)Exit
        """.trimIndent())
        print("Enter Choice Here: ")
        userInput = readLine()!!.toInt()
        if(userInput < 1 || userInput > 5)
            println("Sorry that is not a valid input. Please try a again")
    }while(userInput < 1 || userInput > 5)

    //Displays user's selection
    if(userInput == 1){
        println("You have selected: Rectangle")
        println("Please input the width of the rectangle")
        x = readLine()!!.toInt()
        println("Please input the height of the rectangle")
        y = readLine()!!.toInt()
        println("The area of the rectangle is: " + rectangle(x,y))
    }
    else if(userInput == 2) {
        println("You have selected: Triangle")
        println("Please input the base of the triangle")
        x = readLine()!!.toInt()
        println("Please input the height of the triangle")
        y = readLine()!!.toInt()
        println("The area of the Triangle is: " + triangle(x,y))
    }
    else if(userInput == 3) {
        println("You have selected: Circle")
        println("Please input the radius of the circle")
        x = readLine()!!.toInt()
        println("The area of the Circle is: " + circle(x))
    }
    else if(userInput == 4) {
        println("You have selected: Trapezoid")
        println("Please input the Side A of the trapezoid")
        x = readLine()!!.toInt()
        println("Please input the Side B of the trapezoid")
        y = readLine()!!.toInt()
        println("Please input the height of the trapezoid")
        z = readLine()!!.toInt()
        println("The area of the Trapezoid is: " + trapezoid(x,y,z))
    }
    else
        println("Have a Great Day!")
}

fun rectangle(x:Int,y: Int): Int{
    val area = x*y
    return area
}

fun triangle(b: Int,h: Int): Int{
    val area = (b*h)/2
    return area
}

fun circle(r: Int): Double{
    val area = (r*r)*3.14
    return area
}

fun trapezoid(a: Int,b: Int,h: Int): Int{
    val area = ((a+b)/h)*2
    return area
}
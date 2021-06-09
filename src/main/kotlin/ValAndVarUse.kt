/*
 naming convention is of camel case in function as well as of in name of variable
 how to declare a  varaible
 var/val variableName: dataType = value/nothing;

 if we do not give data type but initilize it will infer its type

 for using a variable  inside a string use it with $

 val can only be assigned value in its whole cycle
*/

fun valAndVarUsage(){
    var myVariable: Int;
    myVariable = 5;
    myVariable = 1;
    println("The value is now:: $myVariable");

    var myAge = 26;
    println("My age is $myAge")

    val fixedValueVariable: Boolean = true;
    //fixedValueVariable = false;
    println(fixedValueVariable);

    val myFavoriteNumber = 5;
    var myCurrentAge: Int = 26;
    println("My favorite number is $myFavoriteNumber and my current age is $myCurrentAge");

}
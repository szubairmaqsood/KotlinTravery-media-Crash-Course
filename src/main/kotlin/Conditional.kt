/*
IF STATEMENT ID IMPLIMENTED
 */
fun useOfConditional(){
    val x = 6;
    val y = 7;
    val z = if(x>y) x else y;
    if(x < y)
    {
        println("x is less y");
    }else if(x>y){
        println("x is greater than y");
    }else{
        println("x and y are equal");
    }
    println("This line always be executed");
    println(z);

    val mainString = "racecard";
    val reveredString = mainString.reversed();

    if(mainString == reveredString){
        println("String is a palidrom");
    }else{
        println("String is not a palidrom");
    }

}
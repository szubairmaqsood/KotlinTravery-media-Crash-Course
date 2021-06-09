/*
 Usage of comparison operator
 Usage of logical operator
 () is most periority
 Order first and and then ||
 */


fun logicalAndComparisonOperator(){
    val c = 3;
    val d = 4;

    println(c==d);
    println(c<=d);
    println(c>=d);
    println(c!=d)
    println(c<d);
    println(d>c);

    val a =3;
    val b =3;

    println(a==b && c==d);
    println(a==b || c==d);

    val simpleExpression = 3>4 || 4>3 && 4<=4;
    println(simpleExpression);

    val bool =true;
    val x=9;
    val y =3;
    val z =9;

    val hardExpressions = !(x!=z) && bool ||  z > (x+y) && (!bool || y<z);
    println(hardExpressions);

}
fun main(){
    var healthpoints :Int =100 ;

    val playerName ="Madrigal";

    var isBlessed =true ;


    if(healthpoints ==100)
        println(playerName+"is an Excellent Condition ! " + " "+healthpoints);
    else if (healthpoints in 90 ..99)
        println(playerName+" has afew Scratches"+ " "+healthpoints);
    else if (healthpoints in 75 ..89){
        if (isBlessed == true)
            println(playerName + "has some minor wounds but is healing quite quickly1" + " " + healthpoints)
            else
            println("has some minor wound");
        }
    else if (healthpoints in 15 ..74)
        println(playerName+"looks pretty hurt"+" "+healthpoints);
    else
        println(playerName+"is in awful Condition "+" "+healthpoints);
}
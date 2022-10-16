import java.util.Scanner

fun main()
{

    val scn = Scanner(System.`in`)
    println("Enter enter the size ")
    val Num = scn.nextInt()
    val list = mutableListOf<String>()

    println("Please enter $Num names: ")
    println("/*------------------*/")

    for(name in 0 until Num)
    {
        print("Enter name ${name+1}: ")
        list.add(scn.next())
    }
    val filterdList = list.filter {
        it.contains('C') || it.contains('g') || it.contains('F') || it.contains('N')

    }
    println(filterdList.map { it.uppercase() })

}
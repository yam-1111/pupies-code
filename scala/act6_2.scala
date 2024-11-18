import scala.io.StdIn.readLine

object act6_2 {
  
    def main(args: Array[String]) : Unit = {
        val NUM_ARRAY : Int = 3
        var name : Array[String ] = new Array[String](NUM_ARRAY)
        var prelims : Array[Double] = new Array[Double](NUM_ARRAY)
        var midterms : Array[Double] = new Array[Double](NUM_ARRAY)
        var finals : Array[Double] = new Array[Double](NUM_ARRAY)

        for(i <- 0 until NUM_ARRAY){
            print("Enter name: ")
            name(i) = readLine()
            print("Enter prelims grade: ")
            prelims(i) = readLine().toDouble
            print("Enter midterms grade: ")
            midterms(i) = readLine().toDouble
            print("Enter finals grade: ")
            finals(i) = readLine().toDouble

            println(f"\tAverage \t: ${(prelims(i) + midterms(i) + finals(i)) / 3}%1.1f ")
        }

    }
}

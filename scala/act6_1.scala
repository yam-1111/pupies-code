object act6_1 {

  def main(args: Array[String]): Unit = {
    var i = 0
    val names: Array[String] = Array(
      "Marygin",
      "Sammy",
      "CJay",
      "CJoy",
      "Christle"
    )

    for(n <- names){
        i += 1
        println(s"$i) $n")
    }
  }

}

object q01 extends App{
  var interest=(deposit:Double)=>deposit match{
      case x if x<20000 => x*0.02
      case x if x<200000 => x*0.04
      case x if x<2000000 => x*0.035
      case _ => deposit*0.065
    }

  print("Input deposit amount: ")
  var deposit=scala.io.StdIn.readDouble()
  println("Interest : "+interest(deposit))
}
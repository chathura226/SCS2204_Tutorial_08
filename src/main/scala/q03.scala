object q03 extends App{
  val toUpper=(str:String)=>str.toUpperCase()


  val toLower=(str:String)=>str.toLowerCase()


  var formatNames=(name:String,index:Int,Func: String=>String)=>{

    if(index>0 && index<name.length()){
      var res=""
      res=name.substring(0,index)
      res=res+Func(name.charAt(index).toString())
      res=res+name.substring(index+1,name.length())
      println(res)
    }else{
      println(Func(name))
    }

  }
  formatNames("Benny",-1,toUpper)
 formatNames("Niroshan",1,toUpper)
  formatNames("Saman",-1,toLower)
  formatNames("Kumara",5,toUpper)

}
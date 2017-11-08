object obj extends App { //object of class
 

 val myList = List("alpha", "gamma", "omega", "zeta", "beta")
 var letter = 0
 var counta = 0
 var countm = 0
 val map = scala.collection.mutable.Map[String, Int]()
for (i <-myList)
{
  if (i.length()==4)
  {
    letter = letter + 1
  }
 
  map.put(i,i.length())
  
  if (i.contains("a"))
  {
    counta +=1
  }
  
  if (i.contains("m"))
  {
    countm +=1
  }
  
}
  println("count of all strings with length 4  " + letter)
  println("each string is mapped to its corresponding length  " + map)
  println("count of all strings which contain alphabet ‘m’  " + countm)
  println("count of all strings which start with the alphabet ‘a’  " + counta)
  
}
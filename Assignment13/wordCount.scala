val file = sc.textFile("/home/pratik/Documents/SEM6/DSBDAL/Assignment13/sample.txt")
val words = file.flatMap(line => line.split("\\s+"))
val lowercase = words.map(word => word.toLowerCase())
val wordCount = lowercase.countByValue()
for((word,count) <- wordCount){
println(word + "->" + count)
}


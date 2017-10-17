fun main(args: Array<String>){
    for (b in 1..5) {
        for (c in 4 downTo b) { //spasi
            print(" ")
        }
        for (d in 1..b) { //bintang
            print("*")
        }
        println()
    }
}
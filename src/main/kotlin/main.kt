fun main() {
    var inv = arrayOf("pencil", "pen", "eraser", "ruler", "notebook", "folder")
    var count = arrayOf("21", "53", "76", "43", "32", "81")
    var numDel = 0
    var numAdd = 0

    var combArray = arrayOf<Array<String>>()
    combArray+= inv
    combArray += count

    println("Please pick an item(numbered 0-5): ")
    for(i in 0..inv.size-1){
        var an_item = combArray[0][i]
        println(an_item)
    }
    //displays item and quantity
    var input = readln()!!.toInt()
    var rowCount = combArray[0].size-1
        var an_item = combArray[0][input]
        var a_qty = combArray[1][input]
        println("the item is: $an_item with a quantity of: $a_qty")

//subtract from inventory
    println("Select which inventory item to subtract: ")
        var inpDel = readln().toInt()

        var itemDel = combArray[0][inpDel]
        var qtyDel = combArray[1][inpDel]
        inpDel = qtyDel.toInt()
        inpDel = inpDel-1
    if (numDel == 0) {
        numDel ++
    }


        println("The item is: $itemDel with a quantity of: $inpDel")

    println("Select which inventory item to add: ")
    var inpAdd = readln().toInt()
    var itemAdd = combArray[0][inpAdd]
    var qtyAdd = combArray[1][inpAdd]
    inpAdd = qtyAdd.toInt()
    inpAdd = inpDel+1
    if (numAdd == 0) {
        numAdd++
    }
    println("The item is: $itemAdd with a quantity of: $inpAdd")

    if(inpDel < 0){
        println("Error: Quantity can not go below 0")
        inpDel = 0
    }
    println("The inventory removed is: $numDel")
    println("The inventory added is: $numAdd")
}
package lesson18

class Order(orderID: Int) {
    private var product = ""
    private var productList: MutableList<String> = mutableListOf()
    fun addOrder(product: String) {
        this.product = product
    }

    fun addOrder(productList: MutableList<String>) {
        this.productList = productList
    }

    fun printOrderInfo() {
        println(
            if (productList.isEmpty()) "Заказан товар: $product"
            else "Заказаны следущие товары: ${productList.joinToString(", ")}"
        )
    }
}

fun main() {
    val order1 = Order(1)
    order1.addOrder("Хлеб")
    val order2 = Order(2)
    order2.addOrder(mutableListOf("Молоко", "Кефир"))
    order1.printOrderInfo()
    println()
    order2.printOrderInfo()
}
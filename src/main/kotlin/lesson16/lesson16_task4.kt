package lesson16

class ShopOrder(private val orderID: Int,) {
    private var orderStatus: String = IN_PROGRESS_STATUS
    fun changeOrderStatus(status: String){
        orderStatus = status
    }
}


fun main() {
    val shopOrder = ShopOrder(1)
    val shopOrder1 = ShopOrder(2)
    statusManager(shopOrder, READY_STATUS)
    statusManager(shopOrder1, READY_STATUS)
}

fun statusManager(shopOrder: ShopOrder, status: String){
    shopOrder.changeOrderStatus(status)
}

const val IN_PROGRESS_STATUS = "In progress..."
const val READY_STATUS = "READY."
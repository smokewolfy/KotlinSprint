package lesson16

class ShopOrder(private val orderID: Int,) {
    private var orderStatus: String = IN_PROGRESS_STATUS
    private fun changeOrderStatus(status: String){
        orderStatus = status
    }
    fun statusManager(status: String){
        this.changeOrderStatus(status)
    }
}


fun main() {
    val shopOrder = ShopOrder(1)
    val shopOrder1 = ShopOrder(2)
    shopOrder.statusManager(READY_STATUS)
    shopOrder1.statusManager(READY_STATUS)
}



const val IN_PROGRESS_STATUS = "In progress..."
const val READY_STATUS = "READY."
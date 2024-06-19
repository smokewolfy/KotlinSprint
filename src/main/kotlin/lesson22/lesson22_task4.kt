package lesson22

class MainScreenViewModel {
    data class MainScreenState(
        var data: String,
        var isLoading: Boolean,
    )

    private var mainScreenState: MainScreenState = MainScreenState("", false)
    fun loadData(newData: String) {
        println(mainScreenState)
        Thread.sleep(1000)
        val loadingMainScreenState = mainScreenState.copy(isLoading = true)
        println(loadingMainScreenState)
        Thread.sleep(2000)
        mainScreenState.data = newData
        println(mainScreenState)
    }
}

fun main() {
    val mainScreenViewModel = MainScreenViewModel()
    mainScreenViewModel.loadData("Good morning")
}
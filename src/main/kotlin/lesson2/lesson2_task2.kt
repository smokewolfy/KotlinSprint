package lesson2

fun main(){
    val countOfWorkers = 50
    val salaryOfWorker = 30_000

    val overallExpenses = salaryOfWorker * countOfWorkers

    println("Расходы на работников - $overallExpenses")

    val countOfInterns = 30
    val salaryOfIntern = 20_000

    val overallExpensesWithInterns = countOfInterns * salaryOfIntern + overallExpenses
    println("Расходы на работников и стажёров - $overallExpensesWithInterns")

    val middleSalaryOfWorker = overallExpensesWithInterns / (countOfWorkers + countOfInterns)

    println("Средняя зарплата всех работников, включая стажёров- $middleSalaryOfWorker")
}
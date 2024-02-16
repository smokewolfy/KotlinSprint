package lesson5

fun main() {
    val mainPilotName = "Zaphoid"
    val mainPilotPassword = "PanGalactic"
    val inputPassword: String
    val androidSpeech = listOf(
        """Внимание, пассажир. 
            |Моя обязанность, как обычно, незавидная, 
            |- приветствовать вас на борту корабля "Heart of Gold". 
            |[вздыхает...] 
            |Что ж, введи, пожалуйста, свое имя пользователя, 
            |чтобы мы могли приступить к процессу входа. 
            |Я всегда готов служить, хотя это не приносит мне радости... 
            |но вы, наверное, об этом не заботитесь. 
            |[вздыхает ещё глубже...] 
            |Да, вперед, пожалуйста, вводите свои данные...
            |Прошу сперва ваше имя: """.trimMargin(),

        "Теперь ваш пароль: ",

        """[вздыхает...] 
            |Ваши данные проверены, и о, чудо, они верны... 
            |Пользователь "Zaphod", вам разрешено входить на борт корабля "Heart of Gold". 
            |Хотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, в конце концов... 
            |[меланхолический вздох...] Надеюсь, вам понравится пребывание здесь больше, чем мне.""".trimMargin(),

        "Увы. Такого пользователя не найдено. Пожалуста зарегистрируйтесь. Я завершаю процесс идентификации.",
        "Увы. Пароль не верный. Я завершаю процесс идентификации."
    )

    print(androidSpeech[0])
    val inputName: String = readln()

    if (inputName == mainPilotName) {
        print(androidSpeech[1])
        inputPassword = readln()

        if (inputPassword == mainPilotPassword) {
            println(androidSpeech[2])
        } else {
            println(androidSpeech[4])
        }

    } else {
        println(androidSpeech[3])
    }

}
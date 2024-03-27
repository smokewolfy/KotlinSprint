package lesson17

class Folder(
    _name: String,
    _fileCount: Int,
    private var isSecret: Boolean,
) {
    var name: String = _name
        get() = if (isSecret) "Скрытая папка" else field

    var fileCount: Int = _fileCount
        get() = if (isSecret) 0 else field

}

fun main() {
    val folder1 = Folder("Новая папка(1)", 5, true)
    val folder2 = Folder("Новая папка(2)", 2, false)
    println("Содержимое Диска С:")
    println("${folder1.name} - ${folder1.fileCount} файлов")
    println("${folder2.name} - ${folder2.fileCount} файла")
}

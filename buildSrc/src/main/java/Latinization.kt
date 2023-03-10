
fun String.serbianCyrillicToLatin() =
    asSequence().joinToString("") { serbianCyrillicToLatin[it] ?: it.toString() }

private val serbianCyrillicToLatin = mapOf(
    'А' to "A",  'а' to "a",
    'Б' to "B",  'б' to "b",
    'В' to "V",  'в' to "v",
    'Г' to "G",  'г' to "g",
    'Д' to "D",  'д' to "d",
    'Ђ' to "Đ",  'ђ' to "đ",
    'Е' to "E",  'е' to "e",
    'Ж' to "Ž",  'ж' to "ž",
    'З' to "Z",  'з' to "z",
    'И' to "I",  'и' to "i",
    'Ј' to "J",  'ј' to "j",
    'К' to "K",  'к' to "k",
    'Л' to "L",  'л' to "l",
    'Љ' to "Lj", 'љ' to "lj",
    'М' to "M",  'м' to "m",
    'Н' to "N",  'н' to "n",
    'Њ' to "Nj", 'њ' to "nj",
    'О' to "O",  'о' to "o",
    'П' to "P",  'п' to "p",
    'Р' to "R",  'р' to "r",
    'С' to "S",  'с' to "s",
    'Т' to "T",  'т' to "t",
    'Ћ' to "Ć",  'ћ' to "ć",
    'У' to "U",  'у' to "u",
    'Ф' to "F",  'ф' to "f",
    'Х' to "H",  'х' to "h",
    'Ц' to "C",  'ц' to "c",
    'Ч' to "Č",  'ч' to "č",
    'Џ' to "Dž", 'џ' to "dž",
    'Ш' to "Š",  'ш' to "š",
)

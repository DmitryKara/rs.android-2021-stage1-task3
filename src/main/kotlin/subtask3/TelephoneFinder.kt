package subtask3

class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        if ( number.toInt() < 0){
            return null
        }

        val result = ArrayList<String>()
        for (i in number.indices){
            val changeNumber = when(number[i]){
                '1' -> listOf('2', '4')
                '2' -> listOf('1', '3', '5')
                '3' -> listOf('2', '6')
                '4' -> listOf('1', '5', '7')
                '5' -> listOf('2', '4', '6', '8')
                '6' -> listOf('3', '5', '9')
                '7' -> listOf('4', '8')
                '8' -> listOf('5', '7', '9', '0')
                '9' -> listOf('6', '8')
                else -> listOf('8')

            }
            for (c in changeNumber){
                result.add(number.substring(0, i) + c + number.substring(i + 1, number.length))
            }
        }
        return result.toTypedArray()
    }
}

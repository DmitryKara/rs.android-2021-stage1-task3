package subtask2

import kotlin.math.sqrt

class SquareDecomposer {

    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {

        val sqrNumber = number * number
        return decomposer(sqrNumber, number - 1)?.toTypedArray()
    }
    private fun decomposer(number: Int, remainder: Int): ArrayList<Int>?{
        for (i in remainder downTo 1){
            val square = i * i
             if (number - square == 0){
                 return arrayListOf(i)
             }
             if (number - square < 0){
                 return null
             }
            var newRemainder = sqrt((number - square).toDouble()).toInt()
            if (newRemainder >= i){
                newRemainder = i - 1
            }
            val result = decomposer(number - square, newRemainder)
            if (result != null){
                result.add(i)
                return result
            }
        }
        return null
    }
}

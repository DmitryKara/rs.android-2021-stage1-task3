package subtask1

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {

        var result: Int? = null
        val n = array[1]
        val m = array[0]


        for (x in 1..n) {
            val c = factorial(n) / (factorial(x) * factorial(n - x))
            if (c.toInt() == m ) {
                result = x
                break
            }
        }
        return result
    }
     fun factorial(n: Int): Long{
        return if (n < 2) 1
        else n * factorial(n - 1)
    }

   }
// n!=n(n−1)!=n(n−1)(n−2)!=n(n−1)(n−2)(n−3)...(n-x)!
// m = !n / !x * (n - x)!
// m - количество плакатов
// n - общее количетво цветов
// x - количество цветов для одного плаката ??
// x! = n(n−1)(n−2)(n−3)...(n-x-1) / m



class Calculadora {

    fun suma(vararg nums: Int): Int {
        return nums.sum()
    }

    fun resta(vararg nums: Int): Int {
        if (nums.isEmpty())
            return 0
        var result: Int = nums[0]

        nums.forEachIndexed { index, num ->
            if (index != 0)
                result -= num
        }
        return result
    }
}

fun main() {
    fun part1(input: List<String>): Int {
        var prev: Int? = null
        fun checkAndSet(d: Int): Boolean {
            var greater = (prev ?: Int.MAX_VALUE) < d
            prev = d
            return greater
        }
        val count =  input.map { s -> s.toInt() }.count { d -> checkAndSet(d) }
        return count
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 7)

    val input = readInput("Day01")
    println(part1(input))
    //println(part2(input))
}

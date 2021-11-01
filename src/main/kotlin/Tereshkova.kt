class Tereshkova {
    companion object {
        fun obunulator(president: President): President? {
            if (president.surname == "Putin") {
                president.yearsInPower = 0
                return president
            }
            else return null
        }
    }
}

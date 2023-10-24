package baseball

import camp.nextstep.edu.missionutils.Randoms

fun main() {
    println("숫자 야구 게임을 시작합니다.")
    val computer = mutableListOf<Int>()
    while (computer.size < 3) {
        val randomNumber = Randoms.pickNumberInRange(1, 9)
        if (!computer.contains(randomNumber)) {
            computer.add(randomNumber)
        }
    }
    println(computer) // 랜덤 확인 테스트

    print("숫자를 입력해주세요 : ")
    val inputNum = readLine()!!.toInt()
    println(inputNum) // 입력 확인 테스트
}

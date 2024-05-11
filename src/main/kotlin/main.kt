package ru.netology

import kotlin.math.max

// Задача №1. Денежные переводы
val amount = 5_000
val percent = 0.0075
val minComission = 35
val percentCommission = (amount * percent).toInt()
val comission = max(minComission, percentCommission)

// Задача №2. Люди/Человеки
// Вроде как изначально в задании ошибка, т.к. с конкретным числительным всегда используется форма "человек", но сделала сообразно заданию
val likes = 200_000
val nounForm =
    if ((likes == 1) || ((likes >= 10 && ((likes.toString()[likes.toString().length - 1] == '1') && likes.toString()[likes.toString().length - 2] != '1')))) {
        "человеку"
    } else if (likes % 1000 == 0) {
        "человек"
    } else "людям"

// Задача №3. Меломан
val spentAmount = 10_000
val fixDiscount = 100
val fixDiscountStart = 1_001
val percentDiscount = 0.05
val percentDiscountStart = 10_001
val isRegularCustomer = true
val additionalDiscount = 0.01

var standardDiscountAmount = if (spentAmount < fixDiscountStart) {
    spentAmount
} else if (spentAmount in fixDiscountStart until percentDiscountStart) {
    (spentAmount - fixDiscount)
} else (spentAmount - spentAmount * percentDiscount).toInt()

var finalAmount = if (isRegularCustomer) {
    (standardDiscountAmount * (1 - additionalDiscount)).toInt()
} else standardDiscountAmount


fun main() {
    println("Задача 1. Комиссия составила: $comission рублей")
    println("Задача 2. Понравилось $likes $nounForm")
    println("Задача 3. Итоговая сумма: $finalAmount рублей")
}
import java.math.BigInteger
import java.util.*
import kotlin.random.Random

fun main(args: Array<String>) {
    /*//Условные операторы
    //Пользователь вводит в консоли число. Если оно больше 10, выдаем в консоли сообщение “Число больше десяти”, если меньше – “Число меньше десяти”
    println("Введите число:")
    val f: Int = readLine().toString().toInt()
    if (f > 10) {
        println("Число больше десяти")
    } else if (f < 10){
        println("Число меньше десяти")
    }
    //Пользователь вводит в консоли два числа, выводим сообщение “первое число больше/меньше, чем второе” в зависимости от результата их сравнения
    println("Введите первое число:")
    val a: Int = readLine().toString().toInt()
    println("Введите второе число:")
    val b: Int = readLine().toString().toInt()
    if (a > b) {
        println("Первое число больше второго числа")
    } else if (a < b) {
        println("Второе число больше первого числа")
    }
    //Пользователь вводит в консоли длины сторон треугольника (три числа), выводим сообщение, является ли треугольник равнобедренным, равносторонним или разносторонним.
    println("Введите три стороны треугольника:")
    val a1: Int = readLine().toString().toInt()
    val a2: Int = readLine().toString().toInt()
    val a3: Int = readLine().toString().toInt()
    if (a1 == a2 && a2 == a3) {
        println("Треугольник равносторонний")
    } else if ((a1 == a2) || (a2 == a3) || (a1 == a3)) {
        println("Треугольник равнобедренный")
    } else {
        println("Треугольник разносторонний")
    }
    //Пользователь вводит в консоли четыре числа. Рассчитываем и выводим в консоль количество отрицательных и положительных чисел
    println("Введите четыре числа:")
    val number1: String = readLine().toString()
    val s = number1.toInt()
    val number2: String = readLine().toString()
    val d = number2.toInt()
    val number3: String = readLine().toString()
    val g = number3.toInt()
    val number4: String = readLine().toString()
    val h = number4.toInt()
    var x: Int = 0
    var y: Int = 0
    if (s >= 0) {
        x++
    }
    if (d >= 0) {
        x++
    }
    if (g >= 0) {
        x++
    }
    if (h >= 0) {
        x++
    }
    if (s <= 0) {
        y++
    }
    if (d <= 0) {
        y++
    }
    if (g <= 0) {
        y++
    }
    if (h <= 0) {
        y++
    }
    println("Количество положительный чисел:"+x)
    println("Количество отрицательных чисел:"+y)
    //Пользователь вводит в консоли три числа, выводим самое большое из них.
    println("Введите три числа:")
    val b1: Int = readLine().toString().toInt()
    val b2: Int = readLine().toString().toInt()
    val b3: Int = readLine().toString().toInt()
    if (b1 > b2 && b1 > b3) {
        println("Самое большое число из трёх"+b1)
    } else if (b2 > b1 && b2 > b3) {
        println("Самое большое число из трёх"+b2)
    } else if (b3 > b1 && b3 > b2) {
        println("Самое большое число из трёх чисел: "+b3)
    }
    //Пользователь вводит в консоли три числа. Рассчитываем и выводим в консоль сумму наибольшего и наименьшего из них
    println("Введите три числа:")
    val c1: Int = readLine().toString().toInt()
    val c2: Int = readLine().toString().toInt()
    val c3: Int = readLine().toString().toInt()
    var pp: Int = 0
    var pp1: Int = 0
    if (c1 > c2 && c1 > c3) {
        println("Наибольшее из трёх чисел: "+c1)
        pp = c1
    } else if (c2 > c1 && c2 > c3) {
        println("Наибольшее из трёх чисел: "+c2)
        pp = c2
    } else if (c3 > c2 && c3 > c1) {
        println("Наибольшее из трёх чисел: "+c3)
        pp = c3
    }
    if (c1 < c2 && c1 < c3) {
        println("Наименьшее из трёх чисел: "+c1)
        pp1 = c1
    } else if (c2 < c1 && c2 < c3) {
        println("Наименьшее из трёх чисел: "+c2)
        pp1 = c2
    } else if (c3 < c2 && c3 < c1) {
        println("Наименьшее из трёх чисел: "+c3)
        pp1 = c3
    }
    println("Сумма наибольшего и наименьшего чисел: "+(pp+pp1))
    //Пользователь вводит в консоли число. Выводим сообщение о том, четное число, или нечетное
    println("Введите число:")
    val aa: Int = readLine().toString().toInt()
    if (aa%2==0) {
        println("Число четное")
    } else  {
        println("Число нечетное")
    }
    //Программа “Магазин”, выводим меню из трех товаров с ценами. Пользователь выбирает товар, вводит сумму денег. Если сумма меньше цены, выводим сообщение: “Денег не хватает!”, если сумма равна цене – “Спасибо за покупку!”, если больше – “Ваша сдача: [сумма сдачи]”
    println("Добро пожаловать!\nВ нашем магазине есть такие товары, как:\n1. Молоко - 50 руб.\n2. Яйца - 100 руб.\n3. Хлеб - 20 руб.\nКакой товар выбираете? Введите цифру товара или наименование")
    var mo: Int = 50
    var ya: Int = 100
    var hl: Int = 20
    val vvodtovara: String = readLine().toString()
    if (vvodtovara == "Молоко" || vvodtovara == "молоко" || vvodtovara == "1") { //Если выбрали молоко
        println("Хорошо!\nВведите сумму денежных средств, за которые хотите приобрести товар:")
        val vvodcent: Int = readLine().toString().toInt()
        if (vvodcent == mo) {
            println("Спасибо за покупку!")
        } else if (vvodcent > mo) {
            println("Ваша сдача: "+(vvodcent - mo)+"руб.\nСпасибо за покупку!")
        } else if (vvodcent < mo) {
            println("Денег не хватает!")
        }
    }
    if (vvodtovara == "Яйца" || vvodtovara == "яйца" || vvodtovara == "2") { //Если выбрали яйца
        println("Хорошо!\nВведите сумму денежных средств, за которые хотите приобрести товар:")
        val vvodcent: Int = readLine().toString().toInt()
        if (vvodcent == ya) {
            println("Спасибо за покупку!")
        } else if (vvodcent > ya) {
            println("Ваша сдача: "+ (vvodcent - ya)+"руб.\nСпасибо за покупку!")
        } else if (vvodcent < ya) {
            println("Денег не хватает!")
        }
    }
    if (vvodtovara == "Хлеб" || vvodtovara == "хлеб" || vvodtovara == "3") { //Если выбрали хлеб
        println("Хорошо!\nВведите сумму денежных средств, за которые хотите приобрести товар:")
        val vvodcent: Int = readLine().toString().toInt()
        if (vvodcent == hl) {
            println("Спасибо за покупку!")
        } else if (vvodcent > hl) {
            println("Ваша сдача: "+ (vvodcent - hl)+"руб.\nСпасибо за покупку!")
        } else if (vvodcent < hl) {
            println("Денег не хватает!")
        }
    }
    //Циклы
    //Вывести в консоль таблицу умножения на 4
    for(i in 1..9){
        for(j in 1..4){
            print("${i * j} \t")
        }
        println()
    }
    //Пользователь вводит число - х. Выводим в консоль все четные числа от нуля до х
    println("Введите число:")
    var cc: Int = readLine().toString().toInt()
    for (i in 0..cc) {
        if (i % 2 == 0) {
            println(i)
        }
    }
    //Пользователь вводит число - х. Выдаем число из последовательности фибоначчи с индексом х
    print("Введите число\n")
    val aa111: Int = readLine().toString().toInt()
    var fib1 = 1
    var fib2 = 1
    var fib_sum = 0
    var i = 0
    while (i < aa111 - 2) {
    fib_sum = fib1 + fib2
    fib1 = fib2
    fib2 = fib_sum
    i = i + 1
    }
    print("Значение этого элемента: $fib2\n")
    //Пользователь вводит число. Выводим в консоль факториал этого числа
    print("Введите число\n")
    val num: Int = readLine().toString().toInt()
    var factorial: Long = 1
    for (i in 1..num) {
    factorial *= i.toLong()
    }
    println("Факториал $num = $factorial")
    //Пользователь вводит строку. Выводим в консоль эту строку посимвольно (одна строка – один символ)
    println("Введите числа\n")
    val s = readLine()!!
    for (int in s) {
    println(int)
    }
    println()
    for (i in s.indices.reversed()) {
    print(s[i])
    }
    //Дан массив с целыми числами. Вывести в консоль количество положительных и отрицательных чисел в нем
    val num = arrayOf(1, -2, -3, 4, 5)
    var n = 0
    var n1 = 0
    for(number in num){
    print("$number \t")
    if (number > 0){
    n ++
    print("полож $n\n")
    }
    else{
    n1 ++
    print("отриц $n1\n")
    }
    }
    //Дан массив с целыми числами. Вывести в консоль сумму элементов с четными индексами
    val arrayyyy = arrayOf(1, 2, 3, 4, 5)
    val even = arrayyyy.filterIndexed { index, x -> index % 2 == 0 }
        .sum()
        .let { println(it) }
    //Дан массив с целыми числами. Вывести в консоль сумму четных элементов (четные значения)
    val numssss: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    var summmm = 0
    for(i in numssss.indices) {
    if(numssss[i]%2 == 0) {
    summmm = numssss[i]++
    print("$sum")
    }
    }
    //Дан массив с целыми числами. Вывести в консоль наибольшее из них
    val numbers: IntArray = intArrayOf(4, 9, 3, 2, 6)
    var Element = numbers[0]
    for (number in numbers){
        if(Element < number)
            Element = number
    }
    println("Наибольшее число в массиве: $Element")
    //Дан массив с целыми числами. Вывести в консоль наиболее часто встречающееся. Если таких несколько, то вывести наибольшее из них, если повторяющихся нет, вывести соответствующее сообщение.
    val list = listOf(1,2,2,3,3,3)
    fun ma() {
        val countByElement = list.groupingBy { it }.eachCount()
        val maximumElement = countByElement.maxBy { it.value }?.key
        println(maximumElement)
    }
    //Дан двумерный массив 10х10 с целыми числами. Вывести в консоль все числа по  диагонали от [0][0] до [10][10]
        val size = 10
        val array = Array(size) { Array(size) { Random.nextInt(10,100)} }
        for (row in array) {
            for (rrr in row) {
                print("$rrr ")
            }
            print("\n")
        }
        for (i in 0..size) {
            println("${"  ".repeat(i)}${array[i][i]}")
    }
    //Дан двумерный массив 10х10 с целыми числами. Вывести в консоль все числа по диагонали от [0][10] до [10][0]
        val sizee = 10
        val arrayy = Array(sizee) { Array(sizee) { Random.nextInt(10,100)} }
        for (row in arrayy) {
            for (rrrr in row) {
                print("$rrrr ")
            }
            print("\n")
        }
        for (i in 0..sizee) {
            println("${"  ".repeat(sizee - 1 - i)}${arrayy[i][sizee - 1 - i]}")
        }*/

}
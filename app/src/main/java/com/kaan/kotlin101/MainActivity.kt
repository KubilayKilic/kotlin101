package com.kaan.kotlin101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Variables - Değişkenler

        //Integer - Tam sayılar

        println("------ Integer ------")

        var x = 6
        var y = 7

        println(x * y)

        var age = 35

        var result = age / 7 * 5

        println("result: " + result)

        //Defining - değeri tanımlamak, int olacak
        val myInteger: Int

        // Initialize - değerini atamak
        myInteger = 19

        val a : Int = 23
        println(a/2)

        age = 36

        println(age)

        //Double(64) & Float(32)

        println("------ Double & Float ------")

        val pi = 3.14
        println(pi * 2)

        val myFloat = 3.14f
        println(myFloat * 13)

        var myAge : Double = 43.0
        println(myAge / 2)

        //Constants - Sabitler

        val name = "Kaan"
        //name = "kiraz" name tekrar değiştirilemez.

        //String - Metinler
        println("------ String ------")

        val my_string = "kaan kilic"
        println(my_string)
        val name2 = "rick"
        val surname = "sanchez"

        val fullname = name2 + " " +surname
        println(fullname)

        val mortyName : String ="morty"
        println(mortyName.capitalize())

        //Boolean
        println("------ Boolean ------")

        var my_boolean : Boolean = true
        my_boolean = false

        // <
        // >
        // <=
        // >=
        // ==
        // !=
        // && --> AND
        // || --> OR

        println(3 < 7)
        println(7 < 3)
        println(3 == 3)
        println(4 != 7)

        //Conversion
        println("------ Conversion ------")

        var myNumber = 5
        var my_long_number = myNumber.toLong()
        println(my_long_number)

        var input = "10"
        var times_two = input.toInt()
        println(times_two * 2)

        //Collections - toplama yerleri, kolleksiyonlar, dizi liste set sözlük harita
        //birden fazla veriyi tek obje altında toplamak

        // Arrays

        println("------ Arrays ------")

        val myArray = arrayOf("rick", "morty", "summer", "beth")

        //index 0
        println(myArray[2])
        myArray[2] = "summer smith"
        println(myArray[2])
        println(myArray)

        myArray.set(1, "morty smith")
        println(myArray[1])

        val num_array = arrayOf(1,2,3,4,5)
        println(num_array[3])

        val double_array = doubleArrayOf(1.0,2.0,3.0)

        val mixed_array = arrayOf("kaan", 4)
        println(mixed_array[0])
        println(mixed_array[1])

        //List - ArrayList

        println("------ List ------")

        val my_list = arrayListOf<String>("Orange", "Mango")
        my_list.add("Cherry")
        println(my_list[2])
        my_list.add(0, "Grape")
        println(my_list[0])

        val my_array_list = ArrayList<Int>()
        my_array_list.add(1)
        my_array_list.add(200)

        println(my_array_list[1])

        val my_mixed_list = ArrayList<Any>()
        my_mixed_list.add("kaan")
        my_mixed_list.add(22.32)
        my_mixed_list.add(true)

        println(my_mixed_list[0])
        println(my_mixed_list[1])
        println(my_mixed_list[2])

        //Set

        println("------ Set ------")

        val my_example_array = arrayOf(1,1,2,3,5,8)
        println("first element: ${my_example_array[0]}")
        println("second element: ${my_example_array[1]}")

        val my_set = setOf<Int>(1,1,2,3,5,8)
        // tekrar edenleri kabul etmez
        println(my_set.size)

        //For Each

        my_set.forEach { println(it) }

        val my_string_set = HashSet<String>()

        my_string_set.add("kaan")
        my_string_set.add("kaan")
        println("size of the string is: ${my_string_set.size}")

        //Map - HashMap

        println("------ Map ------")
        // dizileri, verileri birbiri ile eşleştirme
        // Key - Value (yiyecek-kalori)

        val fruit_array = arrayOf("Apple", "Banana")
        val calories_array = arrayOf(100, 150)

        println("${fruit_array[0]} : ${calories_array[0]}")

        val fruitCalMap = hashMapOf<String, Int>()
        fruitCalMap.put("Apple", 100)
        fruitCalMap.put("Banana", 150)
        fruitCalMap.put("Grape", 200)
        println(fruitCalMap["Apple"])

        val myHashMap = HashMap<String, String>()

        val myHash = hashMapOf<String, Int>("A" to 1, "B" to 2)
        println(myHash["B"])

        //Operator

        println("------ Operator ------")

        var m = 5
        println(m)
        m = m+1
        println(m)
        m++
        println(m)
        m--
        println(m)

        var n = 7

        println(n > m)

        // && Ve
        // || Veya

        println("------ ve-veya kontrol ------")

        println(n > m && 2 > 1)
        println(n > m && 2 > 3)

        println(n > m || 2 > 1)
        println(n > m || 2 > 3)

        println(10+2)
        println(10-2)
        println(10*2)
        println(10/2)

        //Remainder- kalan
        println(10%3)

        //If Control

        println("------ If Control ------")

        val maAge = 47

        if (maAge < 30) {
            println("< 30")
        }   else if (maAge >= 30 && maAge < 50) {
            println("30-50")
        }   else if (maAge >= 40 && maAge < 50) {
            println("40-50")
        }   else {
            println(">=50")
        }

        //Switch - When

        println("------ Switch-When ------")

        val day = 3
        var dayString = ""

        /*
        if (day == 1) {
            dayString = "Monday"
        } else if (day == 2) {
            dayString = "Tuesday"
        } else if (day == 3) {
            dayString = "Wednesday"
        }

        println(dayString)

         */

        when(day) {

            1 -> dayString = "Monday"
            2 -> dayString = "Tuesday"
            3 -> dayString = "Wednesday"
            else -> dayString = ""
        }
        println(dayString)

        //Loops

        //For Loop

        println("------ For Loop ------")

        val myArr = arrayOf(12,15,18,21,24,27,30,33)
        val q = myArr[0] / 3 * 5
        println(q)

        for (number in myArr) {
            val z = number / 3 * 5
            println(z)
        }

        for (i in myArr.indices) {
            val r = myArr[i] / 3 * 5
            println(r)
        }

        for (b in 0..9) {
            println(b)
        }

        val myStringArrList = ArrayList<String>()
        myStringArrList.add("kaan")
        myStringArrList.add("kilic")
        myStringArrList.add("buz")

        for (str in myStringArrList) {
            println(str)
        }

        myStringArrList.forEach { println(it) }

        //While Loop

        println("------ While Loop ------")

        var j = 0

        while (j < 10) {
            println(j)
            j++
        }


    }
}
package com.galaktionov.hierarchy

fun main() {

    val textView = TextView("Hello")
    textView.click()
    println(textView.text)
    textView.text = "Goodbye"
    println(textView.text)

    val buttonView = TextView("Click me")
    buttonView.click()
    println(buttonView.text)
    buttonView.text = "Don't click me"
    println(buttonView.text)


  /*  val main = ViewGroup()
    val title = TextView("Main Screen")
    main.addView(title)

    val content = ViewGroup()
    val readMore = Button("Read more")
    content.addView(readMore)*/

}
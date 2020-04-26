package com.galaktionov.hierarchy

class ViewGroup : View() {

    lateinit var view: View

    fun addView(view: View) {
        this.view = view
    }

}
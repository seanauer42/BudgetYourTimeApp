package com.hanrstudios.budgetyourtime

class ToDoItem(val title: String, val duration: Int, val category: String, val startTime: Long?) {
    constructor() : this ("", 0, "", null)
}
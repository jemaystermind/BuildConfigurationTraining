package me.jemaystermind.buildconfigtraining

import me.jemaystermind.mywealthservice.MyWealthService

class RealService : MyWealthService {
    override fun users(): List<String> {
        return listOf("myWealth1", "myWealth2")
    }
}
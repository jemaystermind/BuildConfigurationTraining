package me.jemaystermind.buildconfigtraining

import me.jemaystermind.mywealthservice.MyWealthService

class ApiServiceFactory {
    companion object {
        fun service(): MyWealthService {
            return RealService()
        }
    }
}
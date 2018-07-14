package me.jemaystermind.buildconfigtraining

import me.jemaystermind.service.ApiService

class ApiServiceFactory {
    companion object {
        fun service(): ApiService {
            return FakeService()
        }
    }
}
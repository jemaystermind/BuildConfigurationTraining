package me.jemaystermind.buildconfigtraining

import me.jemaystermind.service.ApiService

class FakeService : ApiService {
    override fun users(): List<String> {
        return listOf("fakeUser1", "fakeUser2")
    }
}
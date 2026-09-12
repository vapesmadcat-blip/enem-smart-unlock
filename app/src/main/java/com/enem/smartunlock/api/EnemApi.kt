package com.enem.smartunlock.api

import com.enem.smartunlock.data.EnemQuestionsResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface EnemApi {
    @GET("exams/{year}/questions")
    suspend fun getQuestions(
        @Path("year") year: Int = 2023,
        @Query("limit") limit: Int = 50,
        @Query("offset") offset: Int = 0,
        @Query("language") language: String? = null
    ): EnemQuestionsResponse
}

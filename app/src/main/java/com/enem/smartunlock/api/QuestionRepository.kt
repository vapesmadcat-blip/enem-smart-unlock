package com.enem.smartunlock.api

import com.enem.smartunlock.data.LocalQuestion
import com.enem.smartunlock.data.QuestionBank
import com.enem.smartunlock.data.toLocalQuestion
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

object QuestionRepository {
    suspend fun getQuestions(count: Int = 20): List<LocalQuestion> = withContext(Dispatchers.IO) {
        runCatching {
            RetrofitClient.api.getQuestions(limit = 50)
                .questions
                .mapNotNull { it.toLocalQuestion() }
                .shuffled()
                .take(count)
        }.getOrElse { emptyList() }
            .ifEmpty { QuestionBank.getRandomQuestions(count) }
    }
}

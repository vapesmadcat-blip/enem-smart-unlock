package com.enem.smartunlock.data

data class EnemQuestionsResponse(
    val metadata: EnemMetadata? = null,
    val questions: List<EnemQuestion> = emptyList()
)

data class EnemMetadata(
    val limit: Int = 0,
    val offset: Int = 0,
    val total: Int = 0,
    val hasMore: Boolean = false
)

data class EnemQuestion(
    val title: String? = null,
    val index: Int? = null,
    val discipline: String? = null,
    val language: String? = null,
    val year: Int? = null,
    val context: String? = null,
    val correctAlternative: String? = null,
    val alternativesIntroduction: String? = null,
    val alternatives: List<EnemAlternative> = emptyList()
)

data class EnemAlternative(
    val letter: String? = null,
    val text: String? = null,
    val isCorrect: Boolean = false
)

fun EnemQuestion.toLocalQuestion(): LocalQuestion? {
    val alternatives = alternatives
        .sortedBy { it.letter.orEmpty() }
        .filter { !it.text.isNullOrBlank() }
    val correctLetter = correctAlternative?.trim()?.uppercase()
    val correctIndex = alternatives.indexOfFirst {
        it.letter?.trim()?.uppercase() == correctLetter || it.isCorrect
    }
    val statement = listOfNotNull(title, context, alternativesIntroduction)
        .joinToString("\n\n")
        .trim()
    if (statement.isBlank() || alternatives.size != 5 || correctIndex !in 0..4) return null

    return LocalQuestion(
        subject = discipline?.replaceFirstChar { it.uppercase() } ?: "ENEM",
        text = statement,
        options = alternatives.map { it.text!!.trim() },
        correct = correctIndex,
        source = "API ENEM"
    )
}

package com.example.survey.model

data class SurveyRequest(
    val user_id: String,
    val questions: Map<String, String>
)

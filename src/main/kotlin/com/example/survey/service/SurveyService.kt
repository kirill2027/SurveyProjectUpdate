package com.example.survey.service

import com.example.survey.model.SurveyRequest
import com.example.survey.model.SurveyResponse
import com.example.survey.repository.SurveyRepository
import com.fasterxml.jackson.databind.ObjectMapper
import org.postgresql.util.PGobject
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class SurveyService(
    private val repository: SurveyRepository,
    private val objectMapper: ObjectMapper
) {

    @Transactional
    fun saveSurvey(request: SurveyRequest) {
        val questionsJson = objectMapper.writeValueAsString(request.questions) // Конвертация Map в JSON

        val entity = SurveyResponse(
            userId = request.user_id,
            questions = questionsJson
        )
        repository.save(entity)
    }
}

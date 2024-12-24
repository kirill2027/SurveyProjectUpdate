package com.example.survey.controller

import com.example.survey.model.SurveyRequest
import com.example.survey.model.SurveyResponse
import com.example.survey.service.SurveyService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class SurveyController(private val surveyService: SurveyService) {

    @PostMapping("/survey")
    fun submitSurvey(@RequestBody request: SurveyRequest): ResponseEntity<String> {
        surveyService.saveSurvey(request)
        return ResponseEntity.ok("Response saved successfully.")
    }
}
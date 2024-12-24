package com.example.survey.repository

import com.example.survey.model.SurveyResponse
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SurveyRepository : JpaRepository<SurveyResponse, Long>
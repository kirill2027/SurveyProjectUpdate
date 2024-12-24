package com.example.survey.model

import java.time.LocalDateTime
import jakarta.persistence.*
import org.hibernate.annotations.JdbcTypeCode
import org.hibernate.type.SqlTypes

@Entity
@Table(name = "survey_response")
data class SurveyResponse(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    val userId: String,

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(nullable = false, columnDefinition = "JSONB")
    val questions: String, // JSON в виде строки

    @Column(nullable = false)
    val timestamp: LocalDateTime = LocalDateTime.now()
)
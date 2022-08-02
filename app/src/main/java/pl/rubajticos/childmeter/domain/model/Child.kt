package pl.rubajticos.childmeter.domain.model

import java.util.*

data class Child(
    val id: String? = null,
    val firstName: String,
    val middleName: String,
    val lastName: String,
    val birthDate: Date,
    val sex: Sex
)

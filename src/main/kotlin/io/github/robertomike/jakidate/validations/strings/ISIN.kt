package io.github.robertomike.jakidate.validations.strings

import io.github.robertomike.jakidate.constraints.strings.ISINConstraint
import jakarta.validation.Constraint
import jakarta.validation.Payload
import jakarta.validation.ReportAsSingleViolation
import jakarta.validation.constraints.Pattern
import kotlin.reflect.KClass

@MustBeDocumented
@Target(
    AnnotationTarget.FIELD,
    AnnotationTarget.PROPERTY,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.ANNOTATION_CLASS,
    AnnotationTarget.CONSTRUCTOR,
    AnnotationTarget.TYPE
)
@Retention(AnnotationRetention.RUNTIME)
@Repeatable
@Constraint(validatedBy = [ISINConstraint::class])
@ReportAsSingleViolation
@Pattern(regexp = "^([A-Z]{2}-?[0-9A-Z]{9}-?\\d)$", message = "{jakidate.strings.isin}")
annotation class ISIN(
    val message: String = "{jakidate.strings.isin}",
    val groups: Array<KClass<*>> = [],
    val payload: Array<KClass<out Payload>> = []
)
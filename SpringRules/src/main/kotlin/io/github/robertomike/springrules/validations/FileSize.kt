package io.github.robertomike.springrules.validations

import io.github.robertomike.springrules.constraints.FileSizeConstraint
import jakarta.validation.Constraint
import jakarta.validation.Payload
import org.springframework.util.unit.DataUnit
import kotlin.reflect.KClass

@MustBeDocumented
@Constraint(validatedBy = [FileSizeConstraint::class])
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
annotation class FileSize(
    /**
     * This parameter is used to define the max size that a file can have
     */
    val max: Long = Long.MAX_VALUE,
    /**
     * This parameter is used to define the min size that a file need to have
     */
    val min: Long = 0,
    /**
     * This parameter is used to define the type unit for the other two parameters
     */
    val typeUnit: DataUnit = DataUnit.KILOBYTES,
    val message: String = "{spring-rules.file.extension}",
    val groups: Array<KClass<*>> = [],
    val payload: Array<KClass<out Payload>> = []
)
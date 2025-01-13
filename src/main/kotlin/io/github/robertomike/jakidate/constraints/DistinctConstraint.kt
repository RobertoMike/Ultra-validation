package io.github.robertomike.jakidate.constraints

import io.github.robertomike.jakidate.validations.Distinct

/**
 * A constraint that checks if a collection is distinct.
 *
 * @author Giorgio Andrei
 * @since 1.0.0
 */
class DistinctConstraint: SimpleConstraint<Distinct, Collection<Any>>() {
    /**
     * Checks if the collection is distinct.
     *
     * @param value The collection to be validated.
     * @return `true` if the collection is distinct, `false` otherwise.
     */
    override fun isValid(value: Collection<Any>): Boolean {
        if (value.isEmpty())
            return true

        return value.distinct().size == value.size
    }
}
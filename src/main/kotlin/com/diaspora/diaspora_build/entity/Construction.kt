package com.diaspora.diaspora_build.entity

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDate
import java.util.*

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
class Construction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null
    @ManyToOne
    @JoinColumn(name = "property_id")
    var property: Property? = null
    var name: String? = null
    var status: Boolean? = null
    @Column(columnDefinition = "TEXT")
    var details: String? = null
    var start_date: LocalDate? = null
    var end_date: LocalDate? = null
    var budget: Double? = null
    var actual_cost: Double? = null
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    var created_at: Calendar? = null
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    var updated_at: Calendar? = null

    constructor(
        property: Property?,
        name: String?,
        status: Boolean?,
        details: String?,
        start_date: LocalDate?,
        end_date: LocalDate?,
        budget: Double?,
        actual_cost: Double?
    ) {
        this.property = property
        this.name = name
        this.status = status
        this.details = details
        this.start_date = start_date
        this.end_date = end_date
        this.budget = budget
        this.actual_cost = actual_cost
    }
}
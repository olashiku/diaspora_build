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


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
class RentPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null
    @ManyToOne
    @JoinColumn(name = "tenant_id")
    var tenant: Tenant? = null
    @ManyToOne
    @JoinColumn(name = "unit_id")
    var unit: Unit? = null
    var narration:String? = null
    var amount: Double? = null
    var start_date:LocalDate? = null
    var end_date: LocalDate? = null
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    var created_at: Calendar? = null
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    var updated_at: Calendar? = null

    constructor(tenant: Tenant?, unit: Unit?,narration:String, amount: Double?, start_date: LocalDate?, end_date: LocalDate?) {
        this.tenant = tenant
        this.unit = unit
        this.narration = narration
        this.amount = amount
        this.start_date = start_date
        this.end_date = end_date
    }
}
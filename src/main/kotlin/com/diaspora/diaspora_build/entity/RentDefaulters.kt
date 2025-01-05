package com.diaspora.diaspora_build.entity

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.util.*

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
class RentDefaulters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null
    @ManyToOne
    @JoinColumn(name = "tenant_id")
    var tenant: Tenant? = null
    var amountOwed: Double? = null
    var days_overdue: Int? = null
    @Column(columnDefinition = "TEXT")
    var default_reason: String? = null
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    var created_at: Calendar? = null
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    var updated_at: Calendar? = null

    constructor(tenant: Tenant?, amountOwed: Double?, days_overdue: Int?, default_reason: String?) {
        this.tenant = tenant
        this.amountOwed = amountOwed
        this.days_overdue = days_overdue
        this.default_reason = default_reason
    }
}

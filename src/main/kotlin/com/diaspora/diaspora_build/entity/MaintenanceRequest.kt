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
class MaintenanceRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null
    @ManyToOne
    @JoinColumn(name = "tenant_id")
    var tenant: Tenant? = null
    @ManyToOne
    @JoinColumn(name = "unit_id")
    var unit: Unit? = null
    @Column(columnDefinition = "TEXT")
    var description: String? = null
    @Column(columnDefinition = "TEXT")
    var priority:String? = null
    var status:Boolean? = null
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    var created_at: Calendar? = null
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    var updated_at: Calendar? = null

    constructor(tenant: Tenant?, unit: Unit?, description: String?, priority: String?,status:Boolean?) {
        this.tenant = tenant
        this.unit = unit
        this.description = description
        this.priority = priority
        this.status = status
    }
}
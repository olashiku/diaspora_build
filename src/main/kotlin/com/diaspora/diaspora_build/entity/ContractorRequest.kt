package com.diaspora.diaspora_build.entity

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.util.*

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
class ContractorRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null
    @ManyToOne
    @JoinColumn(name = "contractor_id")
    var contractor: Contractor? = null
    @ManyToOne
    @JoinColumn(name = "construction_id")
    var construction: Construction? = null
    var description:String? = null
    var charge:Double? = null
    @Column(columnDefinition = "TEXT")
    var descripton_of_cost:String? = null
    var status:String? = null
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    var created_at: Calendar? = null
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    var updated_at: Calendar? = null


    constructor(
        contractor: Contractor?,
        construction: Construction?,
        description: String?,
        charge: Double?,
        descripton_of_cost: String?,
        status: String?
    ) {
        this.contractor = contractor
        this.construction = construction
        this.description = description
        this.charge = charge
        this.descripton_of_cost = descripton_of_cost
        this.status = status
    }
}
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
class MaintenanceRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null
    @ManyToOne
    @JoinColumn(name = "property_id")
    var property: Property? = null
    @Column(columnDefinition = "TEXT")
    var description: String? = null
    @Column(columnDefinition = "TEXT")
    var work_details: String? = null
    var status:Boolean? = null
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    var created_at: Calendar? = null
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    var updated_at: Calendar? = null


    constructor(updated_at: Calendar?, created_at: Calendar?, id: Int?) {
        this.updated_at = updated_at
        this.created_at = created_at
        this.id = id
    }
}
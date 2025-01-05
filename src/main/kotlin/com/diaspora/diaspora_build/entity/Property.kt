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
class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null
    var address:String? = null
    @Column(columnDefinition = "TEXT")
    var property_details: String? = null
    var property_type: String? = null
    var status:Boolean? = null
    var total_area:String? = null
    @ManyToOne
    @JoinColumn(name = "user_id")
    val users:Users? = null
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    var created_at: Calendar? = null
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    var updated_at: Calendar? = null

    constructor(
        address: String?,
        property_details: String?,
        property_type: String?,
        status: Boolean?,
        total_area: String?
    ) {
        this.address = address
        this.property_details = property_details
        this.property_type = property_type
        this.status = status
        this.total_area = total_area
    }
}
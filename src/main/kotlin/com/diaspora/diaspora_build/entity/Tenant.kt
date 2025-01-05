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
class Tenant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null
    var full_name: String? = null
    var occupation: String? = null
    var email: String? = null
    var phone_number: String? = null
    var emergency_contact_name: String? = null
    var emergency_contact_phone_number: String? = null
    var status: Boolean? = null
    var date_of_birth: LocalDate? = null
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    var created_at: Calendar? = null
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    var updated_at: Calendar? = null
    @ManyToOne
    @JoinColumn(name = "unit_id")
    var unit:Unit? = null

    constructor(
        full_name: String?,
        occupation: String?,
        email: String?,
        phone_number: String?,
        emergency_contact_name: String?,
        emergency_contact_phone_number: String?,
        status: Boolean?,
        date_of_birth: LocalDate?
    ) {
        this.full_name = full_name
        this.occupation = occupation
        this.email = email
        this.phone_number = phone_number
        this.emergency_contact_name = emergency_contact_name
        this.emergency_contact_phone_number = emergency_contact_phone_number
        this.status = status
        this.date_of_birth = date_of_birth
    }
}
package com.diaspora.diaspora_build.entity

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.util.Calendar


@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = 0
    var first_name: String? = ""
    var last_name: String? = ""
    var password: String? = ""
    var phone: String? = ""
    var email: String? = ""
    var is_verified: Boolean? = false
    var country: String? = ""
    var balance:Double? = 0.0
    @ManyToOne
    @JoinColumn(name = "role_id")
    var role: Roles? = null
    var active: Boolean? = false
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    var created_at: Calendar? = null
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    var updated_at: Calendar? = null

    constructor(
        first_name: String?,
        last_name: String?,
        password: String?,
        phone: String?,
        email: String?,
        is_verified: Boolean?,
        country: String?,
        balance: Double?,
        role: Roles?,
        active: Boolean?
    ) {
        this.first_name = first_name
        this.last_name = last_name
        this.password = password
        this.phone = phone
        this.email = email
        this.is_verified = is_verified
        this.country = country
        this.balance = balance
        this.role = role
        this.active = active
    }
}
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

class Contractor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null
    var company_name: String? = null
    var email: String? = null
    var phone_number: String? = null
    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "user_id")
    var user:Users? = null
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    var created_at: Calendar? = null
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    var updated_at: Calendar? = null


    constructor(company_name: String?, email: String?, phone_number: String?, user: Users?) {
        this.company_name = company_name
        this.email = email
        this.phone_number = phone_number
        this.user = user
    }
}

package com.diaspora.diaspora_build.entity

import org.hibernate.annotations.CreationTimestamp
import java.util.*
import jakarta.persistence.*


@Entity
@Table(name = "user_onboarding")
class UserOnboarding{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id:Long? = null
    @ManyToOne
    @JoinColumn(name = "userId")
    var userId:Users? = null
    @Column(name = "reference")
    var reference:String? = null
    @Column(name = "is_active")
    var isActive:Boolean? = null
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = true, unique = false)
    val createdat: Calendar? = null
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = true, unique = false)
    var expiry_dat: Calendar? = null

    constructor()

    constructor(userId: Users?, reference: String?,isActive:Boolean?,expiry_dat:Calendar?) {
        this.userId = userId
        this.reference = reference
        this.isActive = isActive
        this.expiry_dat = expiry_dat
    }


}
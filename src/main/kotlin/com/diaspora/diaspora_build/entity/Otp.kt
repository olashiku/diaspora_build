package com.diaspora.diaspora_build.entity

import jakarta.persistence.*

@Entity
class Otp {
    @Id
    @Column(name = "id", nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long? = null
    @Column(name ="uniqueRef")
    var uniqueRef:String? = null
    @Column(name ="otp")
    var otp:String? = null
    @Column(name ="customerRef")
    var customerRef:String? = null


     constructor()

    constructor(id: Long?, uniqueRef: String?, otp: String?) {
        this.id = id
        this.uniqueRef = uniqueRef
        this.otp = otp
    }

    constructor(uniqueRef: String?, otp: String?,customerRef:String?) {
        this.uniqueRef = uniqueRef
        this.otp = otp
        this.customerRef = customerRef
    }


}
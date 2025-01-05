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
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
class Documents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null
    var title: String? = null
    var url: String? = null
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @ManyToOne
    @JoinColumn(name = "property_id")
    val property:Property? = null
    var created_at: Calendar? = null
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    var updated_at: Calendar? = null


    constructor(title:String,url: String?) {
        this.title =title
        this.url = url
    }
}
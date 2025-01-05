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
class Inspection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    var inspection_date: Calendar? = null
    @Column(columnDefinition = "TEXT")
    var comments: String? = null
    @ManyToOne
    @JoinColumn(name = "user_id")
    var users: Users? = null
    @ManyToOne
    @JoinColumn(name = "property_id")
    var property: Property? = null
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    var created_at: Calendar? = null
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    var updated_at: Calendar? = null


    constructor(comments: String?, users: Users?, property: Property?) {
        this.comments = comments
        this.users = users
        this.property = property
    }
}
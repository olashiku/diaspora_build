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



@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
class ConstructionPayment{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null
    @ManyToOne
    @JoinColumn(name = "user_id")
    var user: Users? = null
    @ManyToOne
    @JoinColumn(name = "construction_id")
    var construction: Construction? = null
    var amount: Double? = null
    var narration:String? = null
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    var created_at: Calendar? = null
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    var updated_at: Calendar? = null
    

    constructor(user: Users?, construction: Construction?, amount: Double?,narration:String?) {
        this.user = user
        this.construction = construction
        this.amount = amount
        this.narration = narration
    }
}
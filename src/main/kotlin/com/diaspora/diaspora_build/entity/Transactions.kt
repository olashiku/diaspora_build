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
class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null
    @ManyToOne
    @JoinColumn(name = "user_id")
    var user: Users? = null
    var narration: String? = null
    var drcr: String? = null
    var debit_account_no:String? = null
    var credit_account_no:String? = null
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    var created_at: Calendar? = null
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    var updated_at: Calendar? = null


    constructor(
        user: Users?,
        narration: String?,
        drcr: String?,
        debit_account_no: String?,
        credit_account_no: String?
    ) {
        this.user = user
        this.narration = narration
        this.drcr = drcr
        this.debit_account_no = debit_account_no
        this.credit_account_no = credit_account_no
    }
}
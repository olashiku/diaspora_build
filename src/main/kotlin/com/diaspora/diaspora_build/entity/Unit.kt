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
class Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null
    @ManyToOne
    @JoinColumn(name = "property_id")
    var property: Property? = null
    var unit_type: String? = null
    var base_rent: Float? = null
    var number_of_rooms: Int? = null
    var number_of_bathrooms: Int? = null
    var number_of_parkings: Int? = null
    var number_of_wc: Int? = null
    var is_furnished: Boolean? = null
    var is_heated: Boolean? = null
    var is_new: Boolean? = null
    var is_pet_friendly: Boolean? = null
    var is_handicapped_accessible: Boolean? = null
    var is_parking_accessible: Boolean? = null
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    var created_at: Calendar? = null
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    var updated_at: Calendar? = null

    constructor(
        property: Property?,
        unit_type: String?,
        base_rent: Float?,
        number_of_rooms: Int?,
        number_of_bathrooms: Int?,
        number_of_parkings: Int?,
        number_of_wc: Int?,
        is_furnished: Boolean?,
        is_heated: Boolean?,
        is_new: Boolean?,
        is_pet_friendly: Boolean?,
        is_handicapped_accessible: Boolean?,
        is_parking_accessible: Boolean?
    ) {
        this.property = property
        this.unit_type = unit_type
        this.base_rent = base_rent
        this.number_of_rooms = number_of_rooms
        this.number_of_bathrooms = number_of_bathrooms
        this.number_of_parkings = number_of_parkings
        this.number_of_wc = number_of_wc
        this.is_furnished = is_furnished
        this.is_heated = is_heated
        this.is_new = is_new
        this.is_pet_friendly = is_pet_friendly
        this.is_handicapped_accessible = is_handicapped_accessible
        this.is_parking_accessible = is_parking_accessible
    }
}
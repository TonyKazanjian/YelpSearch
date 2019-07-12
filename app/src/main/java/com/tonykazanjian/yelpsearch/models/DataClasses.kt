package com.tonykazanjian.yelpsearch.models

/**
 * @author Tony Kazanjian
 */
data class BusinessList(val businesses: List<Business>) {
    val size: Int get() = businesses.size

    operator fun get(position: Int) = businesses[position]
}
data class Business(val name: String, val imageUrl: String)
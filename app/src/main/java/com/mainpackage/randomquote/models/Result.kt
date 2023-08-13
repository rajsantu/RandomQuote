package com.mainpackage.randomquote.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "quote")
data class Result(
    @PrimaryKey(autoGenerate = true)
    val quoteId: Int,
    val id: String,
    val author: String,
    val authorSlug: String,
    val content: String,
    val dateAdded: String,
    val dateModified: String,
    val length: Int
)
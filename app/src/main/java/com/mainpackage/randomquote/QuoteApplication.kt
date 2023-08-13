package com.mainpackage.randomquote

import android.app.Application
import com.mainpackage.randomquote.api.QuoteService
import com.mainpackage.randomquote.api.RetrofitHelper
import com.mainpackage.randomquote.db.QuoteDatabase
import com.mainpackage.randomquote.repository.QuoteRepository

class QuoteApplication : Application() {

    lateinit var quoteRepository: QuoteRepository

    override fun onCreate() {
        super.onCreate()
        initialize()
    }

    private fun initialize() {
        val quoteService = RetrofitHelper.getInstance().create(QuoteService::class.java)
        val database = QuoteDatabase.getDatabase(applicationContext)
        quoteRepository = QuoteRepository(quoteService, database, applicationContext)
    }
}
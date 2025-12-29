package com.edigiya.test

import com.lagradost.cloudstream3.*

class TestProvider : MainAPI() {
    override var name = "Test Success"
    override var mainUrl = "https://example.com"
    override val supportedTypes = setOf(TvType.Movie)

    override suspend fun search(query: String): List<SearchResponse> {
        return emptyList()
    }
}

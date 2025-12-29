import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.TvType
import com.lagradost.cloudstream3.SearchResponse

class TestProvider : MainAPI() {

    override var name = "Test Provider"
    override var mainUrl = "https://example.com"
    override val supportedTypes = setOf(TvType.Movie)

    override suspend fun search(query: String): List<SearchResponse> {
        return emptyList()
    }
}

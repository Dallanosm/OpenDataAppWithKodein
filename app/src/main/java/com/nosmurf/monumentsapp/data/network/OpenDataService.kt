package com.nosmurf.monumentsapp.data.network

import com.nosmurf.monumentsapp.data.network.models.MonumentsDto
import retrofit2.http.GET
import rx.Observable

interface OpenDataService {

    companion object {
        val END_POINT = "http://opendata.caceres.es/sparql"
    }

    @GET("?default-graph-uri=&query=SELECT+%3Fgeo_long+as+%3Flng+%3Fgeo_lat+as+%3Flat+%3Fom_tipoMonumento+%3Frdfs_label" +
            "+as+%3Fname+%3Fom_tieneEnlaceSIG+WHERE+%7B+%0D%0A%3Furi+a+om%3AMonumento.+%0D%0AOPTIONAL++%7B%3Furi+geo%3Along" +
            "+%3Fgeo_long.+%7D%0D%0AOPTIONAL+%7B%3Furi+owl%3AsameAs+%3Fowl_sameAs.+%7D%0D%0AOPTIONAL+%7B%3Furi+om%3AtipoMonumento" +
            "+%3Fom_tipoMonumento.+%7D+%0D%0AOPTIONAL++%7B%3Furi+geo%3Alat+%3Fgeo_lat.+%7D%0D%0AOPTIONAL++%7B%3Furi" +
            "+om%3AtieneEnlaceSIG+%3Fom_tieneEnlaceSIG.+%7D%0D%0AOPTIONAL++%7B%3Furi+rdfs%3Alabel+%3Frdfs_label." +
            "+%7D%7D&format=application%2Fsparql-results%2Bjson&timeout=0&debug=on")
    fun getMonuments(): Observable<MonumentsDto>

}
package com.nosmurf.monumentsapp.domain.models

import java.net.URI


data class Monument(val name: String, val lat: Double, val long: Double, val type: String, val sigUrl: URI)

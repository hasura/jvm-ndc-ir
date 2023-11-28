package ndc.config

import com.fasterxml.jackson.annotation.JsonTypeInfo
import ndc.ir.SchemaResponse

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
open class Configuration {
    open val schemas: List<String> = emptyList()
    open var schema: SchemaResponse = SchemaResponse(
        scalar_types = emptyMap(),
        object_types = emptyMap(),
        collections = emptyList(),
        functions = emptyList(),
        procedures = emptyList()
    )
}

typealias RawConfiguration = Configuration

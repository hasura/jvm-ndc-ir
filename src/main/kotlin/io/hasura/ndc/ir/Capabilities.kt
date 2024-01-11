package io.hasura.ndc.ir

import com.fasterxml.jackson.annotation.JsonInclude

data class CapabilitiesResponse(
    val versions: String,
    val capabilities: Capabilities
)

@JsonInclude(JsonInclude.Include.NON_NULL)
data class QueryCapabilities(
    val relation_comparisons: Map<String, Any>? = null,
    val order_by_aggregate: Map<String, Any>? = null,
    val foreach: Map<String, Any>? = null
)

@JsonInclude(JsonInclude.Include.NON_NULL)
data class Capabilities(
    val query: QueryCapabilities? = null,
    val mutations: MutationCapabilities? = null,
    val explain: Map<String, Any>? = null,
    val relationships: Map<String, Any>? = null,
)

data class MutationCapabilities(
    val nested_inserts: Map<String, Any>? = null,
    val returning: Map<String, Any>? = null,
)


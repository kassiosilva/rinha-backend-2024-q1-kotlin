package kassiosa.models

import kotlinx.serialization.Serializable

@Serializable
data class Transaction(
  val value: Int,
  val type: Char,
  val description: String,
  val realizedIn: String?
)

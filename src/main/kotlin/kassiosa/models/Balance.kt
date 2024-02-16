package kassiosa.models

import java.time.LocalDate

data class Balance(
  val total: Int,
  val extractDate: String,
  val limit: Int
)

package kassiosa.models

data class Extract(
  val balance: Balance,
  val latestTransactions: List<Transaction>
)

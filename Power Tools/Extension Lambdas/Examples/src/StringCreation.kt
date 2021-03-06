// ExtensionLambdas/StringCreation.kt
package extensionlambdas
import atomictest.eq

private fun messy(): String {
  val built = StringBuilder()      // [1]
  built.append("ABCs: ")
  ('a'..'z').forEach { built.append(it) }
  return built.toString()          // [2]
}

private fun clean() = buildString {
  append("ABCs: ")
  ('a'..'z').forEach { append(it) }
}

fun main() {
  messy() eq clean()
}
// LateInitialization/LateInitSoln1.kt
package lateInitializationExercise1

interface PowerPlant
class ElectricMotor : PowerPlant
class CombustionEngine : PowerPlant

class Vehicle {
  lateinit var powerPlant: PowerPlant
}

lateinit var car: Vehicle

fun main() {
  lateinit var truck: Vehicle
  car = Vehicle()
  car.powerPlant = ElectricMotor()
  truck = Vehicle()
  truck.powerPlant = CombustionEngine()
}
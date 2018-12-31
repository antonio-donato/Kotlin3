import java.time.LocalTime
class Pc: iPc {

    var velocita: Float = 0.0F
    override fun calculate() {
        val ora = LocalTime.now()
        velocita = (27.8 * ora.nano).toFloat()
    }
    var power: Boolean = false
    override fun changePower() {
        power = !power
    }

}
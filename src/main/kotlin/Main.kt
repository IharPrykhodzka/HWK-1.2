fun main() {
    val height = 1.68
    val weight = 57.2
    val verdict = when (bodyMassIndex(height, weight)) {


        in 0.0..16.0 -> "Выраженный дефицит массы тела"
        in 16.1..18.5 -> "Недостаточная (дефицит) масса тела"
        in 18.6..25.0 -> "Норма"
        in 25.1..30.0 -> "Избыточная масса тела (предожирение)"
        in 30.1..35.0 -> "Ожирение"
        in 35.1..40.0 -> "Ожирение резкое"
        else -> "Очень резкое ожирение"
    }
    println(verdict)
}

fun bodyMassIndex(height: Double, weight: Double): Double {
    return weight / (height * height)
}
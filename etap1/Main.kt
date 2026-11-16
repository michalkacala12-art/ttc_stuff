fun obliczGodziny(godzinyTygodniowo: Int, liczbaTygodni: Int): Int {
    return godzinyTygodniowo * liczbaTygodni
}

fun main() {
    val imie = "Michal"
    var klasa = "4Td"
    val kierunek = "Technik Informatyk"

    println("Dane ucznia:")
    println("Imie: $imie")
    println("Klasa: $klasa")
    println("Kierunek ksztalcenia: $kierunek")

    println()

    val wynik1 = obliczGodziny(30, 10)
    val wynik2 = obliczGodziny(25, 15)

    println("Liczba godzin zajec:")
    println("30 godzin tygodniowo przez 10 tygodni: $wynik1 godzin")
    println("25 godzin tygodniowo przez 15 tygodni: $wynik2 godzin")
}

# Opdracht Klassen als attribuut-2 - BSA Monitor

## Inleiding
Je hebt deze opdracht al eens gedaan tijdens de cursus Programming. We maken nu gebruik van het feit dat je met klassen kunt werken en een klasse als attribuut kunt opnemen.

Tijdens de opleiding op de Hogeschool van Amsterdam krijg een student cijfers voor de vakken en projecten die hij of zij volgt. Aan het eind van jaar 1 krijgt iedere student een bindend studieadvies (BSA). Een BSA kan negatief of positief zijn. Is het BSA positief dan is het mogelijk om de opleiding te vervolgen. Bij een negatief BSA is het niet mogelijk om de opleiding te vervolgen aan de Hogeschool van Amsterdam. Een student ontvangt een negatief BSA als hij of zij aan het einde van het eerste jaar van inschrijving minder dan 50 studiepunten heeft behaald uit de propedeuse.

Je kunt een applicatie schrijven waarbij een student de behaalde cijfers in semester 1 invoert, waarna die student een overzicht krijgt van de studievoortgang. Tevens kan de applicatie voorspellen of de student een positief of negatief BSA zal krijgen.

Ieder vak/project heeft een naam en een hoeveelheid studiepunten. Deze studiepunten ontvang je wanneer je alle bij het vak behorende toetsen (tentamen, opdrachten etc.) haalt.

De volgende tabel geeft een overzicht van de vakken en projecten die studenten in semester 1 gemeenschappelijk hebben:

| Vak | Studiepunten |
|-----|--------------|
| Project Fasten Your Seatbelts | 12 |
| Programming | 3 |
| Databases | 3 |
| Personal Skills | 2 |
| Project Skills | 2 |

Daarnaast heeft elke richting nog twee vakken van 3 punten in semester 1. Voor studenten van de richting Software Engineering zijn dat de vakken OOP en User Interaction.

## Stappenplan
a. Maak een nieuw Java project in IntelliJ genaamd "BSAMonitor2".
b. Maak een klasse Vak aan.
1. De klasse kent de attributen naam, punten en cesuur. Deze zijn private.
2. Maak een all-args constructor.
3. Maak alleen de getters.
   c. Maak een klasse Score aan.
1. De klasse kent de attributen vak (een object van de klasse Vak), cijfer en behaaldePunten. Deze zijn private.
2. Maak een constructor met de attributen vak en cijfer. Deze bepaalt de waarde voor behaaldePunten door het cijfer met de cesuur van het vak te vergelijken
3. Maak alleen de getters.
   d. Maak een main methode aan in de launcher.
   e. Declareer een array met objecten van de klasse Vak.
1. Maak deze de juiste lengte.
2. Vul de array met de namen en de studiepunten van de vakken en projecten die bij de richting SE horen in semester 1. De cesuur is voor alle vakken 5,5.
   f. Declareer een array scores met objecten van de klasse Score.
1. Maak deze de juiste lengte.
   g. Gebruik de Scanner klasse om de gebruiker voor ieder vak zijn/haar behaalde cijfer in te laten voeren zoals in het voorbeeld hieronder. Gebruik een for-loop en
1. Sla het vak en het ingevoerde cijfer op in de array scores. Zorg ervoor dat de gebruiker alleen geldige cijfers (tussen de 1.0 en de 10.0) kan invoeren.
2. Tel alle behaalde studiepunten bij elkaar op en sla ook deze op.
   h. Toon de resultaten per project of vak op het scherm. Gebruik dit keer de System.out.printf methode (zie boek § 4.6) om de uitlijning van de uitvoer netjes te maken.
   i. Toon tenslotte het aantal behaalde studiepunten. Als het aantal behaalde studiepunten kleiner is dan 5/6 van het totaal, dan moet de volgende melding worden afgedrukt: "PAS OP: je ligt op schema voor een negatief BSA!".

## Input/Output
Zie hier een voorbeeld van input/output van deze applicatie voor de richting BIM. Input die de gebruiker invoert is schuin en onderstreept.

```
Voer behaalde cijfers in:
Fasten Your Seatbelts: 7,5
Programming: 5,5
Databases: 5,4
Personal Skills: 7
Project Skills: 5
OOP 1: 8
User Interaction: 8,1

Vak/project: Fasten Your Seatbelts Cijfer: 7.5 Behaalde punten: 12
Vak/project: Programming Cijfer: 5.5 Behaalde punten: 3
Vak/project: Databases Cijfer: 5.4 Behaalde punten: 0
Vak/project: Personal Skills Cijfer: 7.0 Behaalde punten: 2
Vak/project: Project Skills Cijfer: 5.0 Behaalde punten: 0
Vak/project: OOP 1 Cijfer: 8.0 Behaalde punten: 3
Vak/project: User Interaction Cijfer: 8.1 Behaalde punten: 3
Totaal behaalde studiepunten: 23/28
PAS OP: je ligt op schema voor een negatief BSA!
```

## Richtlijnen bij coderen (zie ook HvA HBO-ICT code conventions)
- Zorg dat je naam en het doel van het programma bovenin staan (ICC #1).
- Gebruik de juiste inspringing (indentation) bij de lay-out (ICC #2).
- Let op juist gebruik hoofdletters en kleine letters (ICC #3).
- Gebruik goede namen (ICC #4).
- Voeg waar nodig commentaar toe dat inzicht geeft in je code (ICC#7).
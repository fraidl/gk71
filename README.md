# Middleware Engineering "REST und Datenformate"

## Aufgabenbeschreibung
Dieses Projekt simuliert eine REST-API, die Wahldaten bereitstellt. Dazu gehören die Anzahl der Stimmen pro Partei sowie Vorzugsstimmen für Kandidaten in einem bestimmten Wahllokal. Ziel ist es, eine flexible Schnittstelle zu schaffen, die die Wahlergebnisse sowohl im JSON- als auch im XML-Format zur Verfügung stellt. Zusätzlich wird eine HTML-Darstellung der Daten angeboten, um eine schnelle und standardisierte Übermittlung der Ergebnisse an eine zentrale Sammelstelle zu ermöglichen. Die Anwendung basiert auf **Spring Boot** und wird als **RESTful Webservice** implementiert.

### Kernfunktionen:
- **Generierung von Wahldaten**: Eine Simulation erstellt dynamisch Wahlergebnisse für eine bestimmte Region.
- **REST-API-Endpunkte**: Ein REST-Controller nimmt HTTP-Anfragen entgegen und liefert die Wahldaten im JSON-Format oder auf Wunsch im XML-Format.
- **Flexible Ausgabeformate**: Die bereitgestellten Daten können in JSON und XML abgerufen werden, was die Integration erleichtert und vielseitige Nutzung erlaubt.

## Implementierung
Die Anwendung wurde in **Java** unter Verwendung von **Spring Boot** entwickelt und nutzt **Gradle** als Build-Tool. Die wichtigsten Komponenten sind:

1. **Datenmodelle**: Diese Klassen bilden die Struktur der Wahldaten ab, einschließlich der Stimmen pro Partei und Vorzugsstimmen:
   - `ElectionData`: Enthält Informationen zum Standort und zur Stimmenauszählung.
   - `PartyData`: Speichert die Stimmenanzahl für jede Partei.
   - `PreferenceVote`: Enthält die Vorzugsstimmen für einzelne Kandidaten.

2. **Simulation**: Generiert zufällige Wahldaten, um realistische Wahlszenarien zu simulieren.

3. **Service- und Controller-Ebene**:
   - **Service**: Stellt die Wahldaten zur Verfügung.
   - **Controller**: Bietet HTTP-Endpunkte für den Zugriff:
      - `/election/{regionID}` liefert die Wahldaten im JSON-Format.
      - `/election/{regionID}/xml` liefert die Wahldaten im XML-Format.

### Beispielhafte Endpunkte
- JSON-Ausgabe der Wahldaten: `http://localhost:8080/election/33123`
- XML-Ausgabe der Wahldaten: `http://localhost:8080/election/33123/xml`

## Verwendete Technologien
- **Spring Boot** zur Erstellung des RESTful Webservices
- **Thymeleaf** zur Darstellung der Wahldaten in der HTML-Oberfläche
- **Gradle** als Build- und Abhängigkeitsmanagement-Tool
- **JSON und XML** als Datenformate
- **JavaScript** zur Filterung der Daten in der HTML-Ansicht

## Weiterführende Quellen
- [Spring Boot - Offizielle Webseite](https://spring.io/projects/spring-boot)
- [Erstellung eines RESTful Webservices](https://spring.io/guides/gs/rest-service/)
- [Spring Initializr für Projektgenerierung](https://start.spring.io/)
- [Jackson Dataformat XML](https://github.com/FasterXML/jackson-dataformat-xml)
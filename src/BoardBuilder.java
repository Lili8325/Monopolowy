package src;

import java.util.ArrayList;

public class BoardBuilder {
    public static void createFields(ArrayList<Field> fields){
        //todo add start
        HouseField field1 = new HouseField("Zupa krewetkowa", 100, 100, 100);
        fields.add(field1);
        HouseField field2 = new HouseField("Zupa pomidorowa", 100, 100, 100);
        fields.add(field2);
        //todo event
        HouseField field3 = new HouseField("Zupa serowa", 100, 100, 100);
        fields.add(field3);
        HouseField field4 = new HouseField("Zupa curry", 100, 100, 100);
        fields.add(field4);
        HouseField field5 = new HouseField("Zupa zlota", 100, 100, 100);
        fields.add(field5);

        //todo evnet

        HouseField field6 = new HouseField("Jednorazowka", 100, 100, 100);
        fields.add(field6);
        HouseField field7 = new HouseField("E-Papieros POD", 100, 100, 100);
        fields.add(field7);
        HouseField field8 = new HouseField("E-Papieros BOX", 100, 100, 100);
        fields.add(field8);

        //todo evnet SZPITAL

        HouseField field9 = new HouseField("Piwo Tesco", 100, 100, 100);
        fields.add(field9);
        HouseField field10 = new HouseField("Piwo miodowe", 100, 100, 100);
        fields.add(field10);
        //todo evnet
        //todo evnet
        HouseField field11 = new HouseField("Piwo Corona", 100, 100, 100);
        fields.add(field11);
        HouseField field12 = new HouseField("Piwo toffiee", 100, 100, 100);
        fields.add(field12);
        HouseField field13 = new HouseField("Piwo Komes", 100, 100, 100);
        fields.add(field13);
        //todo evnet

        //todo evnet LOTERIA

        HouseField field14 = new HouseField("Monster zero gold", 100, 100, 100);
        fields.add(field14);
        HouseField field15 = new HouseField("Monster zero", 100, 100, 100);
        fields.add(field15);
        //todo evnet
        HouseField field16 = new HouseField("Red bull", 100, 100, 100);
        fields.add(field16);
        HouseField field17 = new HouseField("Red bull morele", 100, 100, 100);
        fields.add(field17);
        HouseField field18 = new HouseField("Monster mango", 100, 100, 100);
        fields.add(field18);
        //todo evnet
        HouseField field19 = new HouseField("Asus rog strix", 100, 100, 100);
        fields.add(field19);
        HouseField field20 = new HouseField("Komputer gamingowy", 100, 100, 100);
        fields.add(field20);
        HouseField field21 = new HouseField("Klawiatura mechaniczna", 100, 100, 100);
        fields.add(field21);

        //todo evnet WIĘZIENIE

        HouseField field22 = new HouseField("Hot dog", 100, 100, 100);
        fields.add(field22);
        HouseField field23 = new HouseField("Panini z kurczakiem", 100, 100, 100);
        fields.add(field23);
        HouseField field24 = new HouseField("Zapiekanka", 100, 100, 100);
        fields.add(field24);
        //todo evnet
        HouseField field25 = new HouseField("Pizza", 100, 100, 100);
        fields.add(field25);
        HouseField field26 = new HouseField("Zahir kabab", 100, 100, 100);
        fields.add(field26);
        //todo evnet
        //todo evnet
    }

    public static void createEventCards(ArrayList<Event> events){
        Event event1 = new Event("Idziesz robic dante", EventType.MOVEEVENT, 0, 0, 0, 0);
        events.add(event1);
        Event event2 = new Event("Zwolnienie z dante", EventType.MOVEEVENT, 0, 0, 0, 0);
        events.add(event2);
        Event event3 = new Event("Ruszasz sie o 2 pola do przodu", EventType.MOVEEVENT, 0, 0, 2, 0);
        events.add(event3);
        Event event4 = new Event("Ruszasz sie o 3 pola do tylu", EventType.MOVEEVENT, 0, 0, -3, 0);
        events.add(event4);
        Event event5 = new Event("Masz urodziny kazdy gracz placi Ci 200$", EventType.PAYEVENT, 200, 0, 0, 0);
        events.add(event5);
        Event event6 = new Event("Placisz za drukarnie 100$", EventType.PAYEVENT, 100, 0, 0, 0);
        events.add(event6);
        Event event7 = new Event("Bierzesz udział w konkursie, idziesz na pole konkurs WRS", EventType.MOVEEVENT, 0, 0, 0, 0);
        events.add(event7);
        Event event8 = new Event("Idziesz do szpitala", EventType.MOVEEVENT, 0, 0, 0, 0);
        events.add(event8);
        Event event9 = new Event("Zwolnienie ze szpitala", EventType.MOVEEVENT, 0, 0, 0, 0);
        events.add(event9);
        Event event10 = new Event("Idziesz na najbliższą opłatę przedmiotu", EventType.MOVEEVENT, 0, 0, 0, 0);
        events.add(event10);
        Event event11 = new Event("Idziesz po najtańsze piwo, idziesz na pole „piwo tesco”", EventType.MOVEEVENT, 0, 0, 0, 0);
        events.add(event11);
        Event event12 = new Event("Idziesz po najtańsze piwo, idziesz na pole „Złoty kurczak”", EventType.MOVEEVENT, 0, 0, 0, 0);
        events.add(event12);
        Event event13 = new Event("Zaczynasz opadać z sił idziesz po red bullka", EventType.MOVEEVENT, 0, 0, 0, 0);
        events.add(event13);
        Event event14 = new Event("Czas na przerwę, czas na zahirka idziesz na pole „zahir kebab”", EventType.MOVEEVENT, 0, 0, 0, 0);
        events.add(event14);
        Event event15 = new Event("Złamałeś nogę na w-f idziesz do szpitala", EventType.MOVEEVENT, 0, 0, 0, 0);
        events.add(event15);
        Event event16 = new Event("Idziesz na pole start ", EventType.MOVEEVENT, 0, 0, 0, 0);
        events.add(event16);
    }
}

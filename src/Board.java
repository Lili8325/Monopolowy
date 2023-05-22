package src;

import java.util.ArrayList;

public class Board {
    private ArrayList<Field> fields = new ArrayList<>();
    private int playerAmount;

    Board(int playerAmount){
        this.playerAmount = playerAmount;

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
        HouseField field7 = new HouseField("POD", 100, 100, 100);
        fields.add(field7);
        HouseField field8 = new HouseField("BOX", 100, 100, 100);
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
}

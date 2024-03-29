package ru.progwards.java1.lessons.bitsworld;

//        Задача 3. Класс Binary
//        3.1 Реализовать конструктор
//public Binary(byte num).
//        3.2 Реализовать метод
//public String toString(), который возвращает двоичное
// представление числа типа byte, используя только битовые
// операции. В выводимом значении всегда должно быть 8 символов
//        Например:
//        0: "00000000"
//        1: "00000001"
//        127: "01111111"
//        -128: "10000000"
//        -1: "11111111"

public class Binary {
    byte num;

    public Binary(byte num)
    {
    this.num = num;
    }

    public String toString(){
        String gf = Integer.toBinaryString(num);
        int gfLength = gf.length();
        gf = "00000000" + gf;
        return gf.substring(gfLength);
    }

    public static void main(String[] args) {
        System.out.println(new Binary((byte) 16).toString());
    }
}

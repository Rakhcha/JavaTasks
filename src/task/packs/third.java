package task.packs;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class third {

    public static HashMap<String,Long> n1(HashMap<String,Long> t) {
        for (String tn : t.keySet()) {
            if (String.valueOf(t.get(tn) % 1000000).length() < 5) t.put(tn, (long) 0); // проверяем длинну остатка, если она меньше 5 то округляем до нуля
            t.put(tn, Math.round(t.get(tn) / (Math.pow(10, String.valueOf(t.get(tn) % 1000000).length()))) * 1000000); // если нет, тогда заменяем в карте на округлённое значение
        }
        return t;
    }

    public static List<Float> n2(int i) { // по формулам из геометрии находим все стороны треугольника
        List<Float> bc = new ArrayList<>();
        bc.add((float) 2 * i);
        bc.add((float) Math.floor(Math.sqrt(bc.get(0) * bc.get(0) - i * i) * 100) / 100);
        return bc;
    }

    public static String n3(String p1, String p2) {
        if (p1.equals(p2)) return "TIE"; // если строки равны то ничья, если нет, првоеряем на все варианты победы первого, если он победил то выводим соответствующее сообщение
        if ((p1 + p2).equals("scissorspaper") || (p1 + p2).equals("rockscissors") || (p1 + p2).equals("paperrock")) return "Player 1 win";
        return "Player 2 win"; // в противном случае, выиграл второй
    }

    public static int n4(ArrayList<Integer> i) { // здесь я использовал Лист, но сейчас понимаю, что можно и без него с помощью потока stream, но переделывать не буду
        int a = 0, b = 0;
        for (int j : i) { // проходим по всему листу
            if (j % 2 == 0) a += j; // проверяем на чётность
            else b += j;
        }
        return a - b; //вычитаем
    }

    public static String n5(String p1) {
        StringBuilder p2 = new StringBuilder(); // создаем строитель строк
        for (int n = 0; n < p1.length(); n++) { // проходим по строке
            if ((int) p1.charAt(n) >= 65 && (int) p1.charAt(n) <= 90) p2.append(p1.substring(n, n + 1).toLowerCase()); // если код данного символ находится
            //в промежутке кодов заглавных английских букв, тогда делем его маленькой
            else p2.append(p1.substring(n, n + 1).toUpperCase()); // если нет, то большой
        }
        return p2.toString(); //возвращаем в виде строки
    }

    public static String n6 (String p1) {
        return ("aoueiyAOUEIY".indexOf(p1.charAt(p1.length() - 1)) != -1) ? p1 + "-inator " + p1.length() + "000" : p1 + "inator " + p1.length() + "000";
        // проверяем последний символ на гласность, если он гласный, тогда мы прибалвяем к строке -инатор и длинну строки + 000 ,если согласный то без тире
    }

    public static boolean n7(int a,int b, int c, int w, int h){
        return ( (b<=w)&(a<=h||c<=h) || (b<=h)&(a<=w||c<=w) || (c<=w)&(a<=h||b<=h) || (c<=h)&(a<=w||b<=w)); // проверка на все варианты вставки в отверстие
    }

    public static double n8(double f, double rf, int p, boolean c) {
        double frf = ((rf) + ((p * rf * 5) / 100)) / 100; // вычисляем полную трату топлива без конднея
        if (c) frf = frf + (frf * 10 / 100); //если есть кондей, увеличиваем на 10 процентов
        return Math.ceil((f / frf) * 100) / 100; // возвращаем округлённое до 2х едениц

    }

    public static double n9(int[] mass) {
        return Math.ceil((Arrays.stream(mass).mapToDouble(x -> x).sum() / mass.length) * 100) / 100; // используя stream , т.е поток, для того, чтобы вывести это в
        // одну стркоу, в этом потоке, переводим массив в тип дабл, ссумируем все значения и делим их на длинну массив, после чего округляем его до 2х знаков после запятой
    }

    public static boolean n10(int a) {
        int sum = 0, first = a; // создаем поля для суммы и начального числа, для дальнейшего стравнения
        while (a != 0) {
            sum += (a % 10);
            a /= 10;
        } // складываем цифры числа
        return ((first & 1) == 0) == ((sum & 1) == 0); // используем побитовый оператор "и" для определения чётности двух чисел и сравниваем результаты.

    }

}

package task.packs;

public class second {

    public static int n1(int i, int k){
        return (k*2+1)-i;
    }

    public static String n2(String name) {
        return name.substring(name.indexOf(" ") + 1) + " " + name.substring(0, name.indexOf(" ")); // выводим сначала часть строки от пробела до конца
        // после от начала до пробела и между ними пробел
    }

    public static double n3(int price, int skid) {
        return (Math.floor(price * (100 - skid)) / 100);
    }

    public static int n4(int[] s) { // путем перебора ищем максимум и минимум и вычитаем
        int min = Integer.MAX_VALUE, max = 0;
        for (int i = 0; i < s.length; i++) {
            if (max < s[i]) max = s[i];
            if (min > s[i]) min = s[i];
        }
        return max - min;
    }

    public static int n5(int a,int b,int c) { // проверяем условными операторами и выводим результат
        if (a == b && a == c) return 3;
        if (a == b || b == c || a == c) return 2;
        return 0;
    }

    public static String n6(String str) {
        return new StringBuilder(str).reverse().toString(); // с помощью StringBuilder переворачиваем принятую строку и возвращаем обратно в строку
    }

    public static int n7(int a,int b,int c) {// ищем максимум и минимум из трех и вычитаем
        return Integer.max(Integer.max(a, b), Integer.max(b, c)) - Integer.min(Integer.min(a, b), Integer.min(b, c));
    }

    public static boolean n8(String str) { // регулярным выражением оставляем только X и O учитывая регистр и сравниваем длины строк
        return str.toLowerCase().replaceAll("[$x]", "").length() == str.toLowerCase().replaceAll("[$o]", "").length();
    }

    public static String n9(String str) { // проверяем наличие bomb и выводим результат
        if (str.toLowerCase().contains("bomb")) return "Пригнись что ли!";
        return "Все окей, развлекайся";
    }

    public static boolean n10(String s1, String s2) { // ссумируем численное значение символов двух строк и сравниваем их
        int a = 0, b = 0;
        for (int i = 0; i < s1.length(); i++) a += s1.charAt(i);
        for (int i = 0; i < s2.length(); i++) b += s2.charAt(i);
        return a == b;
    }

}

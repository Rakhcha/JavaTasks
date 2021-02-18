package task.packs;

public class first {

    public static int n1(int i) {
        return i * 60; // число умножаем на 60
    }

    public static int n2(int i, int j) {
        return i * 2 + j * 3; // первое число умножаем на 2 очка, второе на 3 и складываем
    }

    public static int n3(int i, int j, int k) {
        return i * 3 + j + k * 0; // можно не использовать k, тогда int k будет unused
    }

    public static boolean n4(int i) {
        if (i % 5 != 0) return false; // если i целочисленно не делится на 5, тогда false, иначе true
        return true;
    }

    public static boolean n5(boolean b, boolean b2) {
        return b && b2; // b и b2 // тру и тру = тру и тп
    }

    public static int n6(int n, int w, int h) {
        return n / (w * h); // получаем периметр стены и n делим на периметр
    }

    public static int n7(int a) { // ошибка была с "b" его меняем на a
        return a * a;
    }

    public static boolean n8(float prob, float prize, float pay) {
        return prob * prize > pay; // проверяем условие из задания
    }

    public static int n9(int a, int b) {
        return a * 60 * b; // а умножаем на секунды и умножаем на fps
    }

    public static int n10(int a, int b) {
        return a - (a / b) * b; // чтобы получить остаток от деления, я вывел такую формулу :)
    }
}

package jc01_2020.avramkov.lesson08.task01;

public class Alphabet extends Application {

    enum letters {
        A(1), a(1), B(2), b(2);
        private int number;

        letters(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }
    }

}

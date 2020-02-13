package jc01_2020.avramkov.lesson07.task02;

public class King extends Figure {

    public King(char vertical, int horizontal) {
        super(vertical, horizontal);
    }

    public boolean moveTo(char toVertical, int toHorizontal) {
        if ((toHorizontal == getHorizontal() - 1 || toHorizontal == getHorizontal() + 1) && (toVertical == getVertical())) {
            System.out.println("Этот ход возможен на 1 клетку по вертикали");
            return true;
        } else {
            System.out.println("Этот ход не возможен на 1 клетку по вертикали");
            return false;
        }

    }
}

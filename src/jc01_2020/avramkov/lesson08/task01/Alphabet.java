package jc01_2020.avramkov.lesson08.task01;

public class Alphabet extends Application {

    enum letters {
        A(1),a(1), B(2),b(2), C(3),c(3), D(4),d(4),
        E(5),e(5), F(6),f(6), G(7),g(7), H(8),h(8),
        I(9),i(9), J(10),j(10), K(11),k(11), L(12),l(12),
        M(13),m(13), N(14),n(14), O(15),o(15), P(16),p(16),
        Q(17),q(17), R(18),r(18), S(19),s(19), T(20),t(20),
        U(21),u(21), V(22),v(22), W(23),w(23), X(24),x(24),
        Y(25),y(25), Z(26),z(26);
        private int number;

        letters(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }
    }

}

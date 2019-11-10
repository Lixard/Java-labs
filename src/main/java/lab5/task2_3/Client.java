package lab5.task2_3;

import org.jetbrains.annotations.NotNull;

final class Client {

    void getArea(@NotNull IFigure f) {
        System.out.println(f.getArea());
    }
}

package sk.tmconsulting.testy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CircleTest {

    private Circle circle;

    @BeforeEach
    void setUp() {
        circle = new Circle(); // Inicializujeme objekt pred každým testom
    }

    @Test
    void testObvodkruhu() {
        assertEquals(5, circle.obvodKruhu(2));
        assertEquals(-1, circle.obvodKruhu(-2));
    }

    @Test
    void testObsahkruhu() {
        assertEquals(1, circle.obsahKruhu(2));
        assertEquals(-5, circle.obsahKruhu(3));
    }

}


import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class CahillAlanTestTask2 {

    @Test(expected = IllegalArgumentException.class)
    public void test1() {

        BigDecimal normal = BigDecimal.valueOf(-1);
        BigDecimal reduced = BigDecimal.valueOf(2);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(1, 2));
        reducedp.add(new Period(4, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(7, 8));
        normalp.add(new Period(9, 11));


        new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test2() {

        BigDecimal normal = BigDecimal.valueOf(-5);
        BigDecimal reduced = BigDecimal.valueOf(2);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(1, 2));
        reducedp.add(new Period(4, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(7, 8));
        normalp.add(new Period(9, 11));


        new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3() {

        BigDecimal normal = BigDecimal.valueOf(-0.1);
        BigDecimal reduced = BigDecimal.valueOf(2);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(1, 2));
        reducedp.add(new Period(4, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(7, 8));
        normalp.add(new Period(9, 11));


        new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test4() {

        BigDecimal normal = BigDecimal.valueOf(Integer.MIN_VALUE);
        BigDecimal reduced = BigDecimal.valueOf(2);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(1, 2));
        reducedp.add(new Period(4, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(7, 8));
        normalp.add(new Period(9, 11));


        new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);
    }

    @Test
    public void test5() {

        BigDecimal normal = BigDecimal.valueOf(0);
        BigDecimal reduced = BigDecimal.valueOf(0);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(1, 2));
        reducedp.add(new Period(4, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(7, 8));
        normalp.add(new Period(9, 11));


        new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);
    }

    @Test
    public void test6() {

        BigDecimal normal = BigDecimal.valueOf(0.1);
        BigDecimal reduced = BigDecimal.valueOf(.05);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(1, 2));
        reducedp.add(new Period(4, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(7, 8));
        normalp.add(new Period(9, 11));


        new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);
    }

    @Test
    public void test7() {

        BigDecimal normal = BigDecimal.valueOf(1);
        BigDecimal reduced = BigDecimal.valueOf(0.5);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(1, 2));
        reducedp.add(new Period(4, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(7, 8));
        normalp.add(new Period(9, 11));


        new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);
    }

    @Test
    public void test8() {

        BigDecimal normal = BigDecimal.valueOf(5);
        BigDecimal reduced = BigDecimal.valueOf(2);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(1, 2));
        reducedp.add(new Period(4, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(7, 8));
        normalp.add(new Period(9, 11));


        new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);
    }

    @Test
    public void test9() {

        BigDecimal normal = BigDecimal.valueOf(Integer.MAX_VALUE);
        BigDecimal reduced = BigDecimal.valueOf(2);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(1, 2));
        reducedp.add(new Period(4, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(7, 8));
        normalp.add(new Period(9, 11));


        new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test10() {

        BigDecimal normal = BigDecimal.valueOf(4);
        BigDecimal reduced = BigDecimal.valueOf(2);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(1, 2));
        reducedp.add(new Period(4, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(7, 8));
        normalp.add(new Period(9, 11));


        new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);
    }

    @Test
    public void test11() {

        BigDecimal normal = BigDecimal.valueOf(2);
        BigDecimal reduced = BigDecimal.valueOf(2);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(1, 2));
        reducedp.add(new Period(4, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(7, 8));
        normalp.add(new Period(9, 11));


        new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);
    }

    @Test
    public void test12() {

        BigDecimal normal = BigDecimal.valueOf(1);
        BigDecimal reduced = BigDecimal.valueOf(2);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(1, 2));
        reducedp.add(new Period(4, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(7, 8));
        normalp.add(new Period(9, 11));


        new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);
    }


    @Test(expected = IllegalArgumentException.class)
    public void test13() {

        BigDecimal normal = BigDecimal.valueOf(10);
        BigDecimal reduced = BigDecimal.valueOf(-1);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(1, 2));
        reducedp.add(new Period(4, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(7, 8));
        normalp.add(new Period(9, 11));


        new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test14() {

        BigDecimal normal = BigDecimal.valueOf(10);
        BigDecimal reduced = BigDecimal.valueOf(-5);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(1, 2));
        reducedp.add(new Period(4, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(7, 8));
        normalp.add(new Period(9, 11));


        new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test15() {

        BigDecimal normal = BigDecimal.valueOf(10);
        BigDecimal reduced = BigDecimal.valueOf(-0.1);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(1, 2));
        reducedp.add(new Period(4, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(7, 8));
        normalp.add(new Period(9, 11));


        new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test16() {

        BigDecimal normal = BigDecimal.valueOf(10);
        BigDecimal reduced = BigDecimal.valueOf(Integer.MIN_VALUE);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(1, 2));
        reducedp.add(new Period(4, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(7, 8));
        normalp.add(new Period(9, 11));


        new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);
    }

    @Test
    public void test17() {

        BigDecimal normal = BigDecimal.valueOf(10);
        BigDecimal reduced = BigDecimal.valueOf(0);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(1, 2));
        reducedp.add(new Period(4, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(7, 8));
        normalp.add(new Period(9, 11));


        new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);
    }

    @Test
    public void test18() {

        BigDecimal normal = BigDecimal.valueOf(10);
        BigDecimal reduced = BigDecimal.valueOf(0.1);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(1, 2));
        reducedp.add(new Period(4, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(7, 8));
        normalp.add(new Period(9, 11));


        new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);
    }

    @Test
    public void test19() {

        BigDecimal normal = BigDecimal.valueOf(10);
        BigDecimal reduced = BigDecimal.valueOf(5);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(1, 2));
        reducedp.add(new Period(4, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(7, 8));
        normalp.add(new Period(9, 11));


        new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);
    }

    @Test
    public void test20() {

        BigDecimal normal = BigDecimal.valueOf(10);
        BigDecimal reduced = BigDecimal.valueOf(Integer.MAX_VALUE);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(1, 2));
        reducedp.add(new Period(4, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(7, 8));
        normalp.add(new Period(9, 11));


        new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test21() {

        BigDecimal normal = BigDecimal.valueOf(10);
        BigDecimal reduced = BigDecimal.valueOf(5);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(1, 7));
        reducedp.add(new Period(4, 8));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(7, 8));
        normalp.add(new Period(9, 11));


        new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test22() {

        BigDecimal normal = BigDecimal.valueOf(10);
        BigDecimal reduced = BigDecimal.valueOf(5);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(5, 9));
        reducedp.add(new Period(4, 8));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(7, 8));
        normalp.add(new Period(9, 11));


        new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);
    }


    @Test(expected = IllegalArgumentException.class)
    public void test23() {

        BigDecimal normal = BigDecimal.valueOf(10);
        BigDecimal reduced = BigDecimal.valueOf(5);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(1, 2));
        reducedp.add(new Period(14, 15));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(4, 8));
        normalp.add(new Period(5, 9));


        new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test24() {

        BigDecimal normal = BigDecimal.valueOf(10);
        BigDecimal reduced = BigDecimal.valueOf(5);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(1, 2));
        reducedp.add(new Period(4, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(5, 8));
        normalp.add(new Period(14, 16));


        new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test25() {

        BigDecimal normal = BigDecimal.valueOf(10);
        BigDecimal reduced = BigDecimal.valueOf(5);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(1, 2));
        reducedp.add(new Period(4, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(15, 18));
        normalp.add(new Period(4, 6));


        new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test26() {

        BigDecimal normal = BigDecimal.valueOf(10);
        BigDecimal reduced = BigDecimal.valueOf(5);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(4, 5));
        reducedp.add(new Period(9, 11));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(15, 18));
        normalp.add(new Period(4, 6));


        new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test27() {

        BigDecimal normal = BigDecimal.valueOf(10);
        BigDecimal reduced = BigDecimal.valueOf(5);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(1, 2));
        reducedp.add(new Period(4, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(4, 6));
        normalp.add(new Period(14, 16));


        new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test28() {

        BigDecimal normal = BigDecimal.valueOf(10);
        BigDecimal reduced = BigDecimal.valueOf(5);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(1, 4));
        reducedp.add(new Period(14, 15));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(11, 13));
        normalp.add(new Period(3, 6));


        new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);
    }

    @Test
    public void test29() {

        BigDecimal normal = BigDecimal.valueOf(10);
        BigDecimal reduced = BigDecimal.valueOf(5);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(1, 4));
        reducedp.add(new Period(14, 15));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(11, 13));
        normalp.add(new Period(3, 6));


        new Rate(CarParkKind.STAFF, normal, reduced, reducedp, normalp);
    }

    @Test
    public void test30() {

        BigDecimal normal = BigDecimal.valueOf(10);
        BigDecimal reduced = BigDecimal.valueOf(5);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(1, 4));
        reducedp.add(new Period(14, 15));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(11, 13));
        normalp.add(new Period(3, 6));


        new Rate(CarParkKind.VISITOR, normal, reduced, reducedp, normalp);
    }

    @Test
    public void test31() {

        BigDecimal normal = BigDecimal.valueOf(10);
        BigDecimal reduced = BigDecimal.valueOf(5);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(1, 4));
        reducedp.add(new Period(14, 15));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(11, 13));
        normalp.add(new Period(3, 6));


        new Rate(CarParkKind.MANAGEMENT, normal, reduced, reducedp, normalp);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test32() {

        BigDecimal normal = BigDecimal.valueOf(10);
        BigDecimal reduced = BigDecimal.valueOf(5);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(1, 4));
        reducedp.add(new Period(14, 15));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(11, 13));
        normalp.add(new Period(3, 6));


        new Rate(null, normal, reduced, reducedp, normalp);
    }

    @Test
    public void test33() {

        BigDecimal normal = BigDecimal.valueOf(5);
        BigDecimal reduced = BigDecimal.valueOf(2);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(2, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(5, 24));

        Rate myrate = new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);

        Period myperiod = new Period(2, 5);
        BigDecimal rate = myrate.calculate(myperiod);

        BigDecimal fifteen = BigDecimal.valueOf(15);
        assertEquals(fifteen, rate);

    }

    @Test
    public void test34() {

        BigDecimal normal = BigDecimal.valueOf(5);
        BigDecimal reduced = BigDecimal.valueOf(2);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(2, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(5, 24));

        Rate myrate = new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);

        Period myperiod = new Period(5, 10);
        BigDecimal rate = myrate.calculate(myperiod);

        BigDecimal ten = BigDecimal.valueOf(10);
        assertEquals(ten, rate);

    }

    @Test
    public void test35() {

        BigDecimal normal = BigDecimal.valueOf(5);
        BigDecimal reduced = BigDecimal.valueOf(2);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(2, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(5, 24));

        Rate myrate = new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);

        Period myperiod = new Period(1, 2);
        BigDecimal rate = myrate.calculate(myperiod);

        BigDecimal zero = BigDecimal.ZERO;
        assertEquals(zero, rate);

    }

    @Test
    public void test36() {

        BigDecimal normal = BigDecimal.valueOf(5);
        BigDecimal reduced = BigDecimal.valueOf(2);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(2, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(5, 24));

        Rate myrate = new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);

        Period myperiod = new Period(1, 6);
        BigDecimal rate = myrate.calculate(myperiod);

        BigDecimal seventeen = BigDecimal.valueOf(17);
        assertEquals(seventeen, rate);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test37() {

        BigDecimal normal = BigDecimal.valueOf(0);
        BigDecimal reduced = BigDecimal.valueOf(0);
        ArrayList<Period> reducedp = null;
        //reducedp.add(new Period(null));
        //reducedp.add(new Period(4, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(7, 8));
        normalp.add(new Period(9, 11));


        new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test38() {

        BigDecimal normal = null;
        BigDecimal reduced = BigDecimal.valueOf(0);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(1, 2));
        reducedp.add(new Period(4, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(7, 8));
        normalp.add(new Period(9, 11));


        new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);
    }

    @Test
    public void test39() {

        BigDecimal normal = BigDecimal.valueOf(5);
        BigDecimal reduced = BigDecimal.valueOf(2);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(2, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(5, 24));

        Rate myrate = new Rate(CarParkKind.VISITOR, normal, reduced, reducedp, normalp);

        Period myperiod = new Period(2, 7);
        BigDecimal rate = myrate.calculate(myperiod);

        BigDecimal zero = BigDecimal.valueOf(0);
        assertEquals(zero, rate);

    }

    @Test
    public void test40() {

        BigDecimal normal = BigDecimal.valueOf(5);
        BigDecimal reduced = BigDecimal.valueOf(2);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(2, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(5, 24));

        Rate myrate = new Rate(CarParkKind.VISITOR, normal, reduced, reducedp, normalp);

        Period myperiod = new Period(2, 11);
        BigDecimal rate = myrate.calculate(myperiod);

        BigDecimal five = BigDecimal.valueOf(5);
        assertEquals(five, rate);

    }

    @Test
    public void test41() {

        BigDecimal normal = BigDecimal.valueOf(5);
        BigDecimal reduced = BigDecimal.valueOf(2);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(2, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(5, 24));

        Rate myrate = new Rate(CarParkKind.MANAGEMENT, normal, reduced, reducedp, normalp);

        Period myperiod = new Period(2, 3);
        BigDecimal rate = myrate.calculate(myperiod);

        BigDecimal three = BigDecimal.valueOf(3);
        assertEquals(three, rate);

    }

    @Test
    public void test42() {

        BigDecimal normal = BigDecimal.valueOf(5);
        BigDecimal reduced = BigDecimal.valueOf(2);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(2, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(5, 24));

        Rate myrate = new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);

        Period myperiod = new Period(2, 4);
        BigDecimal rate = myrate.calculate(myperiod);

        BigDecimal four = BigDecimal.valueOf(4);
        assertEquals(four, rate);

    }

    @Test
    public void test43() {

        BigDecimal normal = BigDecimal.valueOf(5);
        BigDecimal reduced = BigDecimal.valueOf(2);
        ArrayList<Period> reducedp = new ArrayList<>();
        reducedp.add(new Period(2, 5));
        ArrayList<Period> normalp = new ArrayList<>();
        normalp.add(new Period(5, 24));

        Rate myrate = new Rate(CarParkKind.STUDENT, normal, reduced, reducedp, normalp);

        Period myperiod = new Period(2, 10);
        BigDecimal rate = myrate.calculate(myperiod);

        BigDecimal nineteen = BigDecimal.valueOf(19.125);
        assertEquals(nineteen, rate);

    }

}





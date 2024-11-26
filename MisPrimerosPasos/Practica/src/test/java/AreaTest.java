import static org.junit.jupiter.api.Assertions.*;
class AreaTest {

    @org.junit.jupiter.api.Test
    void area() {
        System.out.println("Test 1 de area triangulo");
        Area area1 = new Area();
        double base=50;
        double altura=75;
        double Resutadodepruebaarea=(base*altura)/2;
        double  ResultadoObtenidoarea=area1.area(base,altura);
        assertEquals(ResultadoObtenidoarea,Resutadodepruebaarea);
    }
}
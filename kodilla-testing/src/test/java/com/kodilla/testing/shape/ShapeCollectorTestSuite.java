package com.kodilla.testing.shape;
import org.junit.*;

public class ShapeCollectorTestSuite {
    @Before
    public void before() {
        System.out.println("Let's begin testing..");
    }
    @After
    public void after() {
        System.out.println("End of the test.");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("This is the beginning of all tests.");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("All tests are finished.");
    }
    @Test
    public void testAddFigure() {
        //given
        ShapeCollector shapeCollector  = new ShapeCollector();
        Shape triangle = new Triangle(3,5,"Triangle");
        //when
        boolean results = shapeCollector.addFigure(triangle);
        //then
        Assert.assertTrue(results);
    }
    @Test
    public void testRemoveFigure() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(2.5, "Circle");
        shapeCollector.addFigure(circle);
        //when
        boolean results = shapeCollector.removeFigure(circle);
        //then
        Assert.assertTrue(results);
    }
    @Test
    public void testGetFigure() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(5, "Square");
        //when
        shapeCollector.addFigure(square);
        Shape results = shapeCollector.getFigure(0);
        //then
        Assert.assertEquals(square,results);
    }
}

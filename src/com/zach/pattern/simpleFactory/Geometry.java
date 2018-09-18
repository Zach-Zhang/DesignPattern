package com.zach.pattern.simpleFactory;

/**
 * @Author:Zach
 * @Description:
 * @Date:Created in 10:02 2018/9/18
 * @Modified By:
 */
public interface Geometry {

    void draw();

    void erase();

    static Geometry createGeometry(GraphType gt) {
        switch (gt) {
            case CYCLE:
                return new CycleDrawing();
            case RECTANGLE:
                return new RectangleDrawing();
            case TRIANGLE:
                return new TriangleDrawing();

            default:
                return null;
        }
    }
}

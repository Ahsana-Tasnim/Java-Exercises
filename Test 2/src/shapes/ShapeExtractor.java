/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author Ahsana
 */
public class ShapeExtractor {
    private Shape[] shapes;

    public ShapeExtractor(Shape[] shapes) {
        this.shapes = shapes;
    }

    public Shape[] extract(ShapeFilter filter) {
        int size = countValid(filter);
        Shape[] res = new Shape[size];

        int next = 0;
        for (int i = 0; i < shapes.length; i++) {
            Shape temp = shapes[i];
            if (filter.accept(temp)) {
                res[next] = temp;
                next++;
            }
        }

        return res;
    }

    private int countValid(ShapeFilter filter) {
        int res = 0;

        for (int i = 0; i < shapes.length; i++) {
            Shape temp = shapes[i];
            if (filter.accept(temp)) {
                res++;
            }
        }

        return res;
    }
}

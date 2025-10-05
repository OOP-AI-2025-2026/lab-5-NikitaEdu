package ua.opnu.model;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Arc2D;
import java.awt.geom.GeneralPath;

public class Smile extends DrawShape {

    public Smile() {
    }

    public Smile(Point startPoint, Point endPoint) {
        super(startPoint, endPoint);
    }

    @Override
    public Shape getShape(Point startPoint, Point endPoint) {
        double width = Math.abs(startPoint.getX() - endPoint.getX());
        double height = Math.abs(startPoint.getY() - endPoint.getY());

        // Обличчя (основа коло)
        Ellipse2D face = new Ellipse2D.Double(startPoint.getX(), startPoint.getY(), width, height);

        // Посмішка (дуга)
        Arc2D smile = new Arc2D.Double(startPoint.getX() + width / 4, startPoint.getY() + height / 2, width / 2, height / 2, 0, -180, Arc2D.OPEN);

        // Око 1
        Ellipse2D eye1 = new Ellipse2D.Double(startPoint.getX() + width / 4, startPoint.getY() + height / 4, width / 10, height / 10);

        // Око 2
        Ellipse2D eye2 = new Ellipse2D.Double(startPoint.getX() + 3 * width / 4 - width / 10, startPoint.getY() + height / 4, width / 10, height / 10);

        // Створюємо комбіновану форму
        GeneralPath smiley = new GeneralPath();
        smiley.append(face, false);
        smiley.append(smile, false);
        smiley.append(eye1, false);
        smiley.append(eye2, false);

        return smiley;
    }
}
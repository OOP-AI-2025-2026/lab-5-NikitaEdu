package ua.opnu.model;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class Heart extends DrawShape {

    public Heart() {
    }

    public Heart(Point startPoint, Point endPoint) {
        super(startPoint, endPoint);
    }

    @Override
    public Shape getShape(Point startPoint, Point endPoint) {
        double width = Math.abs(startPoint.getX() - endPoint.getX());
        double height = Math.abs(startPoint.getY() - endPoint.getY());

        GeneralPath heart = new GeneralPath();
        heart.moveTo(startPoint.getX(), startPoint.getY() + height / 3);
        heart.curveTo(startPoint.getX(), startPoint.getY(),
                startPoint.getX() - width / 2, startPoint.getY(),
                startPoint.getX() - width / 2, startPoint.getY() + height / 3);
        heart.curveTo(startPoint.getX() - width / 2, startPoint.getY() + 2 * height / 3,
                startPoint.getX(), startPoint.getY() + height,
                startPoint.getX(), startPoint.getY() + height);
        heart.curveTo(startPoint.getX(), startPoint.getY() + height,
                startPoint.getX() + width / 2, startPoint.getY() + 2 * height / 3,
                startPoint.getX() + width / 2, startPoint.getY() + height / 3);
        heart.curveTo(startPoint.getX() + width / 2, startPoint.getY(),
                startPoint.getX(), startPoint.getY(),
                startPoint.getX(), startPoint.getY() + height / 3);

        heart.closePath();
        return heart;
    }
}
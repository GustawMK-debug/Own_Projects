package task11;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;
import java.util.ArrayList;
import java.util.List;

public class KochPanel extends JPanel {

    private int depth = 5;

    private static class Point {
        double x;
        double y;

        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        drawKochSnowflake(g2d);
    }

    private void drawKochSnowflake(Graphics2D g2d) {
        double centerX = getWidth() / 2.0;
        double centerY = getHeight() / 2.0;
        double r = (Math.min(getWidth(), getHeight()) / 2.0) * 0.8;
        double angleOffset = Math.PI / 2.0;
        double step = (2 * Math.PI) / 3.0;

        Point[] vertices = new Point[3];
        for (int i = 0; i < 3; i++) {
            vertices[i] = new Point(
                    centerX + Math.cos(step * i + angleOffset) * r,
                    centerY + Math.sin(step * i + angleOffset) * r
            );
        }

        List<Point> allPoints = new ArrayList<>(kochSegment(vertices[0], vertices[1], depth));

        List<Point> side2 = kochSegment(vertices[1], vertices[2], depth);
        side2.remove(0);
        allPoints.addAll(side2);

        List<Point> side3 = kochSegment(vertices[2], vertices[0], depth);
        side3.remove(0);
        allPoints.addAll(side3);

        Path2D.Double path = new Path2D.Double();
        path.moveTo(allPoints.get(0).x, allPoints.get(0).y);

        for (int i = 1; i < allPoints.size(); i++) {
            path.lineTo(allPoints.get(i).x, allPoints.get(i).y);
        }
        path.closePath();

        g2d.setColor(new Color(100, 180, 255));
        g2d.fill(path);

        g2d.setColor(new Color(0, 80, 160));
        g2d.setStroke(new BasicStroke(1.0f));
        g2d.draw(path);
    }

    private List<Point> kochSegment(Point p1, Point p2, int depth) {
        List<Point> points = new ArrayList<>();

        if (depth == 0) {
            points.add(p1);
            points.add(p2);
            return points;
        }

        Point a = new Point(p1.x + (p2.x - p1.x) / 3.0, p1.y + (p2.y - p1.y) / 3.0);
        Point b = new Point(p1.x + 2.0 * (p2.x - p1.x) / 3.0, p1.y + 2.0 * (p2.y - p1.y) / 3.0);

        double angle = Math.PI / 3.0;
        double dx = b.x - a.x;
        double dy = b.y - a.y;

        Point peak = new Point(
                a.x + dx * Math.cos(angle) - dy * Math.sin(angle),
                a.y + dx * Math.sin(angle) + dy * Math.cos(angle)
        );

        points.addAll(kochSegment(p1, a, depth - 1));

        List<Point> segment2 = kochSegment(a, peak, depth - 1);
        segment2.remove(0);
        points.addAll(segment2);

        List<Point> segment3 = kochSegment(peak, b, depth - 1);
        segment3.remove(0);
        points.addAll(segment3);

        List<Point> segment4 = kochSegment(b, p2, depth - 1);
        segment4.remove(0);
        points.addAll(segment4);

        return points;
    }
}
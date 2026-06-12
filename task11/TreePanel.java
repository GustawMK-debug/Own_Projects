package task11;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class TreePanel extends JPanel {

    private final Random random = new Random();

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(new Color(20, 20, 20));
        g2d.fillRect(0, 0, getWidth(), getHeight());

        int xFrom = getWidth() / 2;
        int yFrom = getHeight() - 20;
        int radius = 100;
        double angle = Math.PI;

        draw(g2d, xFrom, yFrom, radius, angle, 10);
    }

    private void draw(Graphics2D g2d, int xFrom, int yFrom, double radius, double angle, int depth) {
        if (depth == 0) {
            return;
        }

        g2d.setStroke(new BasicStroke(depth));

        if (depth > 3) {
            g2d.setColor(new Color(101, 67, 33));
        } else {
            g2d.setColor(new Color(34, 139, 34));
        }

        double deltaAngle = 0.25 + random.nextDouble() * 0.1;

        double leftEndX = xFrom + Math.sin(angle - deltaAngle) * radius;
        double leftEndY = yFrom + Math.cos(angle - deltaAngle) * radius;

        g2d.drawLine(xFrom, yFrom, (int) leftEndX, (int) leftEndY);
        draw(g2d, (int) leftEndX, (int) leftEndY, radius * (0.6 + random.nextDouble() * 0.2), angle - deltaAngle, depth - 1);

        double rightEndX = xFrom + Math.sin(angle + deltaAngle) * radius;
        double rightEndY = yFrom + Math.cos(angle + deltaAngle) * radius;

        g2d.drawLine(xFrom, yFrom, (int) rightEndX, (int) rightEndY);
        draw(g2d, (int) rightEndX, (int) rightEndY, radius * (0.6 + random.nextDouble() * 0.2), angle + deltaAngle, depth - 1);
    }
}
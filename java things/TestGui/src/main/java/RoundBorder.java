import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;

public class RoundBorder extends AbstractBorder {
    private final Color borderColor;
    private final int borderRadius;

    public RoundBorder(Color borderColor, int borderRadius) {
        this.borderColor = borderColor;
        this.borderRadius = borderRadius;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2 = (Graphics2D) g.create();

        g2.setColor(borderColor);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int arcWidth = borderRadius * 2;
        int arcHeight = borderRadius * 2;

        g2.drawRoundRect(x, y, width - 1, height - 1, arcWidth, arcHeight);

        g2.dispose();
    }

    @Override
    public Insets getBorderInsets(Component c) {
        int margin = borderRadius + 1;
        return new Insets(margin, margin, margin, margin);
    }

    @Override
    public Insets getBorderInsets(Component c, Insets insets) {
        insets.left = insets.top = insets.right = insets.bottom = borderRadius + 1;
        return insets;
    }
}
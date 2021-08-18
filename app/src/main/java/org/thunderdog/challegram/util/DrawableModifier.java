package org.thunderdog.challegram.util;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;

import org.thunderdog.challegram.tool.Drawables;
import org.thunderdog.challegram.tool.Paints;
import org.thunderdog.challegram.tool.Screen;

/**
 * Date: 2019-10-20
 * Author: default
 */
public class DrawableModifier implements DrawModifier {
  private final Drawable[] drawables;

  public DrawableModifier (int... iconIds) {
    if (iconIds.length != 4)
      throw new IllegalArgumentException("iconIds.length == " + iconIds.length);
    this.drawables = new Drawable[iconIds.length];
    for (int i = 0; i < iconIds.length; i++) {
      drawables[i] = Drawables.get(iconIds[i]);
    }
  }

  @Override
  public void afterDraw (View view, Canvas c) {
    int topRowHeight = Math.max(drawables[0].getMinimumHeight(), drawables[1].getMinimumHeight());
    int bottomRowHeight = Math.max(drawables[2].getMinimumHeight(), drawables[3].getMinimumHeight());
    int leftColumnWidth = Math.max(drawables[0].getMinimumWidth(), drawables[2].getMinimumWidth());
    int rightColumnWidth = Math.max(drawables[1].getMinimumWidth(), drawables[3].getMinimumWidth());
    int height = topRowHeight + bottomRowHeight;
    int width = leftColumnWidth + rightColumnWidth;

    int cx = view.getMeasuredWidth() - Screen.dp(18f) - width / 2;
    int cy = view.getMeasuredHeight() / 2;

    for (int i = 0; i < drawables.length; i++) {
      Drawable d = drawables[i];
      int x, y;
      if (i < 2) {
        y = cy - height / 2 + (topRowHeight - d.getMinimumHeight()) / 2;
      } else {
        y = cy + height / 2 - bottomRowHeight + (bottomRowHeight - d.getMinimumHeight()) / 2;
      }
      if (i % 2 == 0) {
        x = cx - width / 2 + (leftColumnWidth - d.getMinimumWidth()) / 2;
      } else {
        x = cx + width / 2 - rightColumnWidth + (rightColumnWidth - d.getMinimumWidth()) / 2;
      }
      Drawables.draw(c, d, x, y, Paints.getIconGrayPorterDuffPaint());
    }
  }
}

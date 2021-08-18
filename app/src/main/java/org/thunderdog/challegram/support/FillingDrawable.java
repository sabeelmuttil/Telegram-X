package org.thunderdog.challegram.support;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PixelFormat;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.thunderdog.challegram.theme.Theme;
import org.thunderdog.challegram.theme.ThemeColorId;
import org.thunderdog.challegram.theme.ThemeDelegate;
import org.thunderdog.challegram.tool.Paints;
import org.thunderdog.challegram.tool.Screen;

import me.vkryl.core.ColorUtils;

/**
 * Date: 22/01/2017
 * Author: default
 */

public class FillingDrawable extends Drawable {
  @ThemeColorId
  private int colorId;

  @Nullable
  private ThemeDelegate forcedTheme;

  private float cornerRadius;

  public FillingDrawable (int colorId) {
    this.colorId = colorId;
  }

  public final void setForcedTheme (ThemeDelegate forcedTheme) {
    if (this.forcedTheme != forcedTheme) {
      this.forcedTheme = forcedTheme;
      invalidateSelf();
    }
  }

  public void setCornerRadius (float radius) {
    if (this.cornerRadius != radius) {
      this.cornerRadius = radius;
      invalidateSelf();
    }
  }

  @ThemeColorId
  public final int getColorId () {
    return colorId;
  }

  public final void setColorId (int colorId) {
    if (this.colorId != colorId) {
      this.colorId = colorId;
      invalidateSelf();
    }
  }

  public void setAlphaFactor (float alpha) {
    if (this.alpha != alpha) {
      this.alpha = alpha;
      invalidateSelf();
    }
  }

  protected int getFillingColor () {
    return ColorUtils.alphaColor(alpha, forcedTheme != null ? forcedTheme.getColor(colorId) : Theme.getColor(colorId));
  }

  @Override
  public final void draw (@NonNull Canvas c) {
    if (colorId != 0) {
      if (cornerRadius != 0) {
        RectF rectF = Paints.getRectF();
        rectF.set(getBounds());
        float radius = Screen.dp(cornerRadius);
        c.drawRoundRect(rectF, radius, radius, Paints.fillingPaint(getFillingColor()));
      } else {
        c.drawRect(getBounds(), Paints.fillingPaint(getFillingColor()));
      }
    }
  }

  private float alpha = 1f;

  @Override
  public final void setAlpha (int alpha) { }

  @Override
  public final void setColorFilter (ColorFilter colorFilter) { }

  @Override
  public final int getOpacity () {
    return PixelFormat.UNKNOWN;
  }

  public static void changeColor (View view, @ThemeColorId int newColorId) {
    if (view != null) {
      Drawable drawable = view.getBackground();
      if (drawable instanceof FillingDrawable) {
        FillingDrawable fillingDrawable = (FillingDrawable) drawable;
        if (fillingDrawable.colorId != newColorId) {
          fillingDrawable.colorId = newColorId;
          view.invalidate();
        }
      }
    }
  }
}

package org.thunderdog.challegram.theme;

import androidx.annotation.Nullable;

import me.vkryl.core.ColorUtils;

/**
 * Date: 11/6/18
 * Author: default
 */
final class ThemeTemporary implements ThemeDelegate {
  private final ThemeDelegate fromTheme;
  private final ThemeDelegate toTheme;

  public ThemeTemporary (ThemeDelegate fromTheme, ThemeDelegate toTheme) {
    this.fromTheme = fromTheme;
    this.toTheme = toTheme;
  }

  @Override
  public int getId () {
    return ThemeId.TEMPORARY;
  }

  @Override
  public boolean equals (@Nullable Object obj) {
    return obj instanceof ThemeDelegate && toTheme.equals(obj);
  }

  @Override
  public boolean isDark () {
    return toTheme.isDark();
  }

  public ThemeDelegate getFromTheme () {
    return fromTheme instanceof ThemeTemporary ? ((ThemeTemporary) fromTheme).getToTheme() : fromTheme;
  }

  public ThemeDelegate getToTheme () {
    return toTheme;
  }

  public float getFactor () {
    return factor;
  }

  private float factor;

  public boolean setFactor (float factor) {
    if (this.factor != factor) {
      this.factor = factor;
      return true;
    }
    return false;
  }

  @Override
  public int getColor (@ThemeId int colorId) {
    if (factor == 0f)
      return fromTheme.getColor(colorId);
    else if (factor == 1f)
      return toTheme.getColor(colorId);
    return ColorUtils.fromToArgb(fromTheme.getColor(colorId), toTheme.getColor(colorId), factor);
  }

  @Override
  public float getProperty (@ThemeProperty int propertyId) {
    if (factor == 1f || ThemeManager.isStaticProperty(propertyId))
      return toTheme.getProperty(propertyId);
    else if (factor == 0f)
      return fromTheme.getProperty(propertyId);
    float fromProperty = fromTheme.getProperty(propertyId);
    float toProperty = toTheme.getProperty(propertyId);
    return fromProperty + (toProperty - fromProperty) * factor;
  }

  @Override
  public String getDefaultWallpaper () {
    return toTheme.getDefaultWallpaper();
  }
}

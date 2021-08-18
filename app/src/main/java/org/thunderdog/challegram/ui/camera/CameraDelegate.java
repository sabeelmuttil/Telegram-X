package org.thunderdog.challegram.ui.camera;

import org.thunderdog.challegram.loader.ImageGalleryFile;

public interface CameraDelegate {
  /**
   * Show text overlay
   * */
  void displayFatalErrorMessage (String msg);

  /**
   * Start error resolution, e.g.
   *
   * @param code Error code
   * */
  void resolveExpectedError (@CameraError.Code int code);

  /**
   * Called when number of available cameras became available or changed
   *
   * @param availableCameraCount number of cameras available on the device
   */
  void onAvailableCamerasCountChanged (int availableCameraCount);

  /**
   * Called when flash mode has been changed.
   *
   * This can happen either by user request or when switching to different camera.
   * */
  void onFlashModeChanged (int flashMode);

  /**
   * Called when zoom value has been changed.
   *
   * This happens when user slides capture button up/down,
   * or when switching to other camera from zoomed one.
   * */
  void onZoomChanged (float zoom);

  /**
   * Called when camera source has been changed.
   *
   * Good place to rotate switch button.
   *
   * @param completed false when camera switch started, true when camera switch completed
   * */
  void onCameraSourceChange (boolean completed, boolean isForward, boolean toFrontFace);

  /**
   * Called when photo/video result will, most likely, photo/video will become available soon.
   *
   * @param isVideo true if future future result will be video. false if photo
   */
  void onPerformSuccessHint (boolean isVideo);

  /**
   * Called when first frame has been rendered and it's OK to hide overlay
   */
  void onRenderedFirstFrame ();

  /**
   * Called when it's good point to take screenshot of camera preview & display blurred version of it
   */
  void onResetRenderState (boolean needBlurPreview, Runnable after);

  /**
   * Called when display orientation has been changed
   * */
  void onDisplayRotationChanged ();

  /**
   * Called when UI has been blocked (e.g. no UI rotation, no camera close, etc).
   * */
  void onUiBlocked (boolean isBlocked);

  /**
   * Picture has been successfully taken.
   * */
  void onMediaTaken (ImageGalleryFile file);

  /**
   * Return true if media files should not be added to public directory
   * */
  boolean usePrivateFolder ();

  /**
   * Called when video capture has been started
   * */
  void onVideoCaptureStarted (long startTimeMs);

  /**
   * Called when video capture has been finished
   * */
  void onVideoCaptureEnded ();
}

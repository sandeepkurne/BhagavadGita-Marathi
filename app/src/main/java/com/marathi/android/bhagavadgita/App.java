package com.marathi.android.bhagavadgita;

import android.app.Application;
import android.content.Context;

/**
 * Created by Sandeep.
 */
public class App extends Application {
  /**
   * Flag to indicate if deep links have been processed yet
   */
  public static boolean processedDeepLinks = false;

  private static Context mContext;

  public static Context getContext() {
    return mContext;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    mContext = this;
  }
}

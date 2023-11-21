package com.studyappcenter0620;

import android.os.Bundle;

import com.facebook.react.ReactActivity;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

public class MainActivity extends ReactActivity {

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "studyAppCenter0620";
  }
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    AppCenter.start(getApplication(), "def59cb4-9b9f-4f6f-9d8f-88b1ba9f3f51", Analytics.class, Crashes.class);
  }
}

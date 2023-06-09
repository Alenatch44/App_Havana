// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSlideshowBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button button1;

  @NonNull
  public final Button button2;

  @NonNull
  public final Button button3;

  @NonNull
  public final Button button4;

  @NonNull
  public final Button buttonExit;

  @NonNull
  public final ImageView imageViewHome;

  @NonNull
  public final ShapeableImageView personImageView;

  @NonNull
  public final Button text2Slideshow;

  @NonNull
  public final TextView textSlideshow;

  private FragmentSlideshowBinding(@NonNull ScrollView rootView, @NonNull Button button1,
      @NonNull Button button2, @NonNull Button button3, @NonNull Button button4,
      @NonNull Button buttonExit, @NonNull ImageView imageViewHome,
      @NonNull ShapeableImageView personImageView, @NonNull Button text2Slideshow,
      @NonNull TextView textSlideshow) {
    this.rootView = rootView;
    this.button1 = button1;
    this.button2 = button2;
    this.button3 = button3;
    this.button4 = button4;
    this.buttonExit = buttonExit;
    this.imageViewHome = imageViewHome;
    this.personImageView = personImageView;
    this.text2Slideshow = text2Slideshow;
    this.textSlideshow = textSlideshow;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSlideshowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSlideshowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_slideshow, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSlideshowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_1;
      Button button1 = ViewBindings.findChildViewById(rootView, id);
      if (button1 == null) {
        break missingId;
      }

      id = R.id.button_2;
      Button button2 = ViewBindings.findChildViewById(rootView, id);
      if (button2 == null) {
        break missingId;
      }

      id = R.id.button_3;
      Button button3 = ViewBindings.findChildViewById(rootView, id);
      if (button3 == null) {
        break missingId;
      }

      id = R.id.button_4;
      Button button4 = ViewBindings.findChildViewById(rootView, id);
      if (button4 == null) {
        break missingId;
      }

      id = R.id.button_exit;
      Button buttonExit = ViewBindings.findChildViewById(rootView, id);
      if (buttonExit == null) {
        break missingId;
      }

      id = R.id.imageViewHome;
      ImageView imageViewHome = ViewBindings.findChildViewById(rootView, id);
      if (imageViewHome == null) {
        break missingId;
      }

      id = R.id.personImageView;
      ShapeableImageView personImageView = ViewBindings.findChildViewById(rootView, id);
      if (personImageView == null) {
        break missingId;
      }

      id = R.id.text_2_slideshow;
      Button text2Slideshow = ViewBindings.findChildViewById(rootView, id);
      if (text2Slideshow == null) {
        break missingId;
      }

      id = R.id.text_slideshow;
      TextView textSlideshow = ViewBindings.findChildViewById(rootView, id);
      if (textSlideshow == null) {
        break missingId;
      }

      return new FragmentSlideshowBinding((ScrollView) rootView, button1, button2, button3, button4,
          buttonExit, imageViewHome, personImageView, text2Slideshow, textSlideshow);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

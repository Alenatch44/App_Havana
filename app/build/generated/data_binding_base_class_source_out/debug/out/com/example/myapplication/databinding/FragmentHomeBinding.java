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

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button button;

  @NonNull
  public final Button button3d;

  @NonNull
  public final Button buttonCall;

  @NonNull
  public final Button buttonLk;

  @NonNull
  public final ImageView imageViewHome;

  @NonNull
  public final ShapeableImageView shapeableImageView;

  @NonNull
  public final TextView textHome;

  @NonNull
  public final TextView textHomeDown;

  @NonNull
  public final TextView textHomeDown1;

  @NonNull
  public final TextView textHomeDown2;

  private FragmentHomeBinding(@NonNull ScrollView rootView, @NonNull Button button,
      @NonNull Button button3d, @NonNull Button buttonCall, @NonNull Button buttonLk,
      @NonNull ImageView imageViewHome, @NonNull ShapeableImageView shapeableImageView,
      @NonNull TextView textHome, @NonNull TextView textHomeDown, @NonNull TextView textHomeDown1,
      @NonNull TextView textHomeDown2) {
    this.rootView = rootView;
    this.button = button;
    this.button3d = button3d;
    this.buttonCall = buttonCall;
    this.buttonLk = buttonLk;
    this.imageViewHome = imageViewHome;
    this.shapeableImageView = shapeableImageView;
    this.textHome = textHome;
    this.textHomeDown = textHomeDown;
    this.textHomeDown1 = textHomeDown1;
    this.textHomeDown2 = textHomeDown2;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.button_3d;
      Button button3d = ViewBindings.findChildViewById(rootView, id);
      if (button3d == null) {
        break missingId;
      }

      id = R.id.button_call;
      Button buttonCall = ViewBindings.findChildViewById(rootView, id);
      if (buttonCall == null) {
        break missingId;
      }

      id = R.id.button_lk;
      Button buttonLk = ViewBindings.findChildViewById(rootView, id);
      if (buttonLk == null) {
        break missingId;
      }

      id = R.id.imageViewHome;
      ImageView imageViewHome = ViewBindings.findChildViewById(rootView, id);
      if (imageViewHome == null) {
        break missingId;
      }

      id = R.id.shapeableImageView;
      ShapeableImageView shapeableImageView = ViewBindings.findChildViewById(rootView, id);
      if (shapeableImageView == null) {
        break missingId;
      }

      id = R.id.text_home;
      TextView textHome = ViewBindings.findChildViewById(rootView, id);
      if (textHome == null) {
        break missingId;
      }

      id = R.id.text_home_down;
      TextView textHomeDown = ViewBindings.findChildViewById(rootView, id);
      if (textHomeDown == null) {
        break missingId;
      }

      id = R.id.text_home_down_1;
      TextView textHomeDown1 = ViewBindings.findChildViewById(rootView, id);
      if (textHomeDown1 == null) {
        break missingId;
      }

      id = R.id.text_home_down_2;
      TextView textHomeDown2 = ViewBindings.findChildViewById(rootView, id);
      if (textHomeDown2 == null) {
        break missingId;
      }

      return new FragmentHomeBinding((ScrollView) rootView, button, button3d, buttonCall, buttonLk,
          imageViewHome, shapeableImageView, textHome, textHomeDown, textHomeDown1, textHomeDown2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

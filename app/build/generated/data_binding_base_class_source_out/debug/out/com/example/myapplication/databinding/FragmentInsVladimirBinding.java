// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentInsVladimirBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ImageView imageVladimir;

  @NonNull
  public final TextView textInfo;

  @NonNull
  public final TextView textInfoVladimirIns1;

  @NonNull
  public final TextView textInfoVladimirIns2;

  @NonNull
  public final TextView textVladimirIns;

  private FragmentInsVladimirBinding(@NonNull ScrollView rootView, @NonNull ImageView imageVladimir,
      @NonNull TextView textInfo, @NonNull TextView textInfoVladimirIns1,
      @NonNull TextView textInfoVladimirIns2, @NonNull TextView textVladimirIns) {
    this.rootView = rootView;
    this.imageVladimir = imageVladimir;
    this.textInfo = textInfo;
    this.textInfoVladimirIns1 = textInfoVladimirIns1;
    this.textInfoVladimirIns2 = textInfoVladimirIns2;
    this.textVladimirIns = textVladimirIns;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentInsVladimirBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentInsVladimirBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_ins_vladimir, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentInsVladimirBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.image_vladimir;
      ImageView imageVladimir = ViewBindings.findChildViewById(rootView, id);
      if (imageVladimir == null) {
        break missingId;
      }

      id = R.id.text_info;
      TextView textInfo = ViewBindings.findChildViewById(rootView, id);
      if (textInfo == null) {
        break missingId;
      }

      id = R.id.text_info_vladimir_ins_1;
      TextView textInfoVladimirIns1 = ViewBindings.findChildViewById(rootView, id);
      if (textInfoVladimirIns1 == null) {
        break missingId;
      }

      id = R.id.text_info_vladimir_ins_2;
      TextView textInfoVladimirIns2 = ViewBindings.findChildViewById(rootView, id);
      if (textInfoVladimirIns2 == null) {
        break missingId;
      }

      id = R.id.text_vladimir_ins;
      TextView textVladimirIns = ViewBindings.findChildViewById(rootView, id);
      if (textVladimirIns == null) {
        break missingId;
      }

      return new FragmentInsVladimirBinding((ScrollView) rootView, imageVladimir, textInfo,
          textInfoVladimirIns1, textInfoVladimirIns2, textVladimirIns);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
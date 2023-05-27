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

public final class FragmentInsOlgaBBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ImageView imageOlgaB;

  @NonNull
  public final TextView textInfo;

  @NonNull
  public final TextView textInfoOlgaBIns1;

  @NonNull
  public final TextView textInfoOlgaBIns2;

  @NonNull
  public final TextView textOlgaBIns;

  private FragmentInsOlgaBBinding(@NonNull ScrollView rootView, @NonNull ImageView imageOlgaB,
      @NonNull TextView textInfo, @NonNull TextView textInfoOlgaBIns1,
      @NonNull TextView textInfoOlgaBIns2, @NonNull TextView textOlgaBIns) {
    this.rootView = rootView;
    this.imageOlgaB = imageOlgaB;
    this.textInfo = textInfo;
    this.textInfoOlgaBIns1 = textInfoOlgaBIns1;
    this.textInfoOlgaBIns2 = textInfoOlgaBIns2;
    this.textOlgaBIns = textOlgaBIns;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentInsOlgaBBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentInsOlgaBBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_ins_olga_b, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentInsOlgaBBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.image_olga_b;
      ImageView imageOlgaB = ViewBindings.findChildViewById(rootView, id);
      if (imageOlgaB == null) {
        break missingId;
      }

      id = R.id.text_info;
      TextView textInfo = ViewBindings.findChildViewById(rootView, id);
      if (textInfo == null) {
        break missingId;
      }

      id = R.id.text_info_olga_b_ins_1;
      TextView textInfoOlgaBIns1 = ViewBindings.findChildViewById(rootView, id);
      if (textInfoOlgaBIns1 == null) {
        break missingId;
      }

      id = R.id.text_info_olga_b_ins_2;
      TextView textInfoOlgaBIns2 = ViewBindings.findChildViewById(rootView, id);
      if (textInfoOlgaBIns2 == null) {
        break missingId;
      }

      id = R.id.text_olga_b_ins;
      TextView textOlgaBIns = ViewBindings.findChildViewById(rootView, id);
      if (textOlgaBIns == null) {
        break missingId;
      }

      return new FragmentInsOlgaBBinding((ScrollView) rootView, imageOlgaB, textInfo,
          textInfoOlgaBIns1, textInfoOlgaBIns2, textOlgaBIns);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
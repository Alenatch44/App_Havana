// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
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

public final class FragmentSportBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button buttonLineSport1;

  @NonNull
  public final Button buttonLineSport2;

  @NonNull
  public final Button buttonLineSport3;

  @NonNull
  public final Button buttonSportAr1;

  @NonNull
  public final Button buttonSportAr2;

  @NonNull
  public final Button buttonSportAr3;

  @NonNull
  public final Button buttonSportAr4;

  @NonNull
  public final Button buttonSportVideo1;

  @NonNull
  public final Button buttonSportVideo2;

  @NonNull
  public final Button buttonSportVideo3;

  @NonNull
  public final Button buttonSportVideo4;

  @NonNull
  public final ImageView imageViewTrain1;

  @NonNull
  public final ImageView imageViewTrain2;

  @NonNull
  public final ImageView imageViewTrain3;

  @NonNull
  public final ImageView imageViewTrain4;

  @NonNull
  public final TextView nameTrain1;

  @NonNull
  public final TextView nameTrain11;

  @NonNull
  public final TextView nameTrain2;

  @NonNull
  public final TextView nameTrain21;

  @NonNull
  public final TextView nameTrain3;

  @NonNull
  public final TextView nameTrain31;

  @NonNull
  public final TextView nameTrain4;

  @NonNull
  public final TextView nameTrain41;

  @NonNull
  public final RelativeLayout relLayoutSport1;

  @NonNull
  public final RelativeLayout relLayoutSport2;

  @NonNull
  public final RelativeLayout relLayoutSport3;

  @NonNull
  public final RelativeLayout relLayoutSport4;

  private FragmentSportBinding(@NonNull ScrollView rootView, @NonNull Button buttonLineSport1,
      @NonNull Button buttonLineSport2, @NonNull Button buttonLineSport3,
      @NonNull Button buttonSportAr1, @NonNull Button buttonSportAr2,
      @NonNull Button buttonSportAr3, @NonNull Button buttonSportAr4,
      @NonNull Button buttonSportVideo1, @NonNull Button buttonSportVideo2,
      @NonNull Button buttonSportVideo3, @NonNull Button buttonSportVideo4,
      @NonNull ImageView imageViewTrain1, @NonNull ImageView imageViewTrain2,
      @NonNull ImageView imageViewTrain3, @NonNull ImageView imageViewTrain4,
      @NonNull TextView nameTrain1, @NonNull TextView nameTrain11, @NonNull TextView nameTrain2,
      @NonNull TextView nameTrain21, @NonNull TextView nameTrain3, @NonNull TextView nameTrain31,
      @NonNull TextView nameTrain4, @NonNull TextView nameTrain41,
      @NonNull RelativeLayout relLayoutSport1, @NonNull RelativeLayout relLayoutSport2,
      @NonNull RelativeLayout relLayoutSport3, @NonNull RelativeLayout relLayoutSport4) {
    this.rootView = rootView;
    this.buttonLineSport1 = buttonLineSport1;
    this.buttonLineSport2 = buttonLineSport2;
    this.buttonLineSport3 = buttonLineSport3;
    this.buttonSportAr1 = buttonSportAr1;
    this.buttonSportAr2 = buttonSportAr2;
    this.buttonSportAr3 = buttonSportAr3;
    this.buttonSportAr4 = buttonSportAr4;
    this.buttonSportVideo1 = buttonSportVideo1;
    this.buttonSportVideo2 = buttonSportVideo2;
    this.buttonSportVideo3 = buttonSportVideo3;
    this.buttonSportVideo4 = buttonSportVideo4;
    this.imageViewTrain1 = imageViewTrain1;
    this.imageViewTrain2 = imageViewTrain2;
    this.imageViewTrain3 = imageViewTrain3;
    this.imageViewTrain4 = imageViewTrain4;
    this.nameTrain1 = nameTrain1;
    this.nameTrain11 = nameTrain11;
    this.nameTrain2 = nameTrain2;
    this.nameTrain21 = nameTrain21;
    this.nameTrain3 = nameTrain3;
    this.nameTrain31 = nameTrain31;
    this.nameTrain4 = nameTrain4;
    this.nameTrain41 = nameTrain41;
    this.relLayoutSport1 = relLayoutSport1;
    this.relLayoutSport2 = relLayoutSport2;
    this.relLayoutSport3 = relLayoutSport3;
    this.relLayoutSport4 = relLayoutSport4;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSportBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSportBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_sport, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSportBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_line_sport_1;
      Button buttonLineSport1 = ViewBindings.findChildViewById(rootView, id);
      if (buttonLineSport1 == null) {
        break missingId;
      }

      id = R.id.button_line_sport_2;
      Button buttonLineSport2 = ViewBindings.findChildViewById(rootView, id);
      if (buttonLineSport2 == null) {
        break missingId;
      }

      id = R.id.button_line_sport_3;
      Button buttonLineSport3 = ViewBindings.findChildViewById(rootView, id);
      if (buttonLineSport3 == null) {
        break missingId;
      }

      id = R.id.button_sport_ar_1;
      Button buttonSportAr1 = ViewBindings.findChildViewById(rootView, id);
      if (buttonSportAr1 == null) {
        break missingId;
      }

      id = R.id.button_sport_ar_2;
      Button buttonSportAr2 = ViewBindings.findChildViewById(rootView, id);
      if (buttonSportAr2 == null) {
        break missingId;
      }

      id = R.id.button_sport_ar_3;
      Button buttonSportAr3 = ViewBindings.findChildViewById(rootView, id);
      if (buttonSportAr3 == null) {
        break missingId;
      }

      id = R.id.button_sport_ar_4;
      Button buttonSportAr4 = ViewBindings.findChildViewById(rootView, id);
      if (buttonSportAr4 == null) {
        break missingId;
      }

      id = R.id.button_sport_video_1;
      Button buttonSportVideo1 = ViewBindings.findChildViewById(rootView, id);
      if (buttonSportVideo1 == null) {
        break missingId;
      }

      id = R.id.button_sport_video_2;
      Button buttonSportVideo2 = ViewBindings.findChildViewById(rootView, id);
      if (buttonSportVideo2 == null) {
        break missingId;
      }

      id = R.id.button_sport_video_3;
      Button buttonSportVideo3 = ViewBindings.findChildViewById(rootView, id);
      if (buttonSportVideo3 == null) {
        break missingId;
      }

      id = R.id.button_sport_video_4;
      Button buttonSportVideo4 = ViewBindings.findChildViewById(rootView, id);
      if (buttonSportVideo4 == null) {
        break missingId;
      }

      id = R.id.imageViewTrain1;
      ImageView imageViewTrain1 = ViewBindings.findChildViewById(rootView, id);
      if (imageViewTrain1 == null) {
        break missingId;
      }

      id = R.id.imageViewTrain2;
      ImageView imageViewTrain2 = ViewBindings.findChildViewById(rootView, id);
      if (imageViewTrain2 == null) {
        break missingId;
      }

      id = R.id.imageViewTrain3;
      ImageView imageViewTrain3 = ViewBindings.findChildViewById(rootView, id);
      if (imageViewTrain3 == null) {
        break missingId;
      }

      id = R.id.imageViewTrain4;
      ImageView imageViewTrain4 = ViewBindings.findChildViewById(rootView, id);
      if (imageViewTrain4 == null) {
        break missingId;
      }

      id = R.id.name_train_1;
      TextView nameTrain1 = ViewBindings.findChildViewById(rootView, id);
      if (nameTrain1 == null) {
        break missingId;
      }

      id = R.id.name_train_1_1;
      TextView nameTrain11 = ViewBindings.findChildViewById(rootView, id);
      if (nameTrain11 == null) {
        break missingId;
      }

      id = R.id.name_train_2;
      TextView nameTrain2 = ViewBindings.findChildViewById(rootView, id);
      if (nameTrain2 == null) {
        break missingId;
      }

      id = R.id.name_train_2_1;
      TextView nameTrain21 = ViewBindings.findChildViewById(rootView, id);
      if (nameTrain21 == null) {
        break missingId;
      }

      id = R.id.name_train_3;
      TextView nameTrain3 = ViewBindings.findChildViewById(rootView, id);
      if (nameTrain3 == null) {
        break missingId;
      }

      id = R.id.name_train_3_1;
      TextView nameTrain31 = ViewBindings.findChildViewById(rootView, id);
      if (nameTrain31 == null) {
        break missingId;
      }

      id = R.id.name_train_4;
      TextView nameTrain4 = ViewBindings.findChildViewById(rootView, id);
      if (nameTrain4 == null) {
        break missingId;
      }

      id = R.id.name_train_4_1;
      TextView nameTrain41 = ViewBindings.findChildViewById(rootView, id);
      if (nameTrain41 == null) {
        break missingId;
      }

      id = R.id.relLayout_sport_1;
      RelativeLayout relLayoutSport1 = ViewBindings.findChildViewById(rootView, id);
      if (relLayoutSport1 == null) {
        break missingId;
      }

      id = R.id.relLayout_sport_2;
      RelativeLayout relLayoutSport2 = ViewBindings.findChildViewById(rootView, id);
      if (relLayoutSport2 == null) {
        break missingId;
      }

      id = R.id.relLayout_sport_3;
      RelativeLayout relLayoutSport3 = ViewBindings.findChildViewById(rootView, id);
      if (relLayoutSport3 == null) {
        break missingId;
      }

      id = R.id.relLayout_sport_4;
      RelativeLayout relLayoutSport4 = ViewBindings.findChildViewById(rootView, id);
      if (relLayoutSport4 == null) {
        break missingId;
      }

      return new FragmentSportBinding((ScrollView) rootView, buttonLineSport1, buttonLineSport2,
          buttonLineSport3, buttonSportAr1, buttonSportAr2, buttonSportAr3, buttonSportAr4,
          buttonSportVideo1, buttonSportVideo2, buttonSportVideo3, buttonSportVideo4,
          imageViewTrain1, imageViewTrain2, imageViewTrain3, imageViewTrain4, nameTrain1,
          nameTrain11, nameTrain2, nameTrain21, nameTrain3, nameTrain31, nameTrain4, nameTrain41,
          relLayoutSport1, relLayoutSport2, relLayoutSport3, relLayoutSport4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

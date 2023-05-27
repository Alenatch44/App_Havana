package com.example.myapplication.ui.gallery;

import android.bluetooth.le.ScanSettings;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentGalleryBinding;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Calendar;
import java.util.Date;

public class GalleryFragment extends Fragment {
    TextView time1,time2,time3,time4,time5,time6,
            time7,time8,time9,time10,time11,time12,time13;
    TextView name1,name2,name3,name4,name5,name6,
            name7,name8,name9,name10,name11,name12,name13;
    TextView place1,place2,place3,place4,place5,place6,
            place7,place8,place9,place10,place11,place12,place13;
    TextView coach1,coach2,coach3,coach4,coach5,coach6,
            coach7,coach8,coach9,coach10,coach11,coach12,coach13;
    TextView duration1, duration2, duration3, duration4, duration5, duration6,
            duration7, duration8, duration9, duration10, duration11, duration12, duration13;
    FirebaseDatabase db = FirebaseDatabase.getInstance("https://my-application-78cd2-default-rtdb.europe-west1.firebasedatabase.app");


    private FragmentGalleryBinding binding;
    private CalendarView calendar;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GalleryViewModel galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        time1 = root.findViewById(R.id.time_gallery);
        name1 = root.findViewById(R.id.name_gallery);
        place1 = root.findViewById(R.id.place_gallery);
        coach1 = root.findViewById(R.id.coach_gallery);
        duration1 = root.findViewById(R.id.duration_gallery);

        time2 = root.findViewById(R.id.time_gallery_2);
        name2 = root.findViewById(R.id.name_gallery_2);
        place2 = root.findViewById(R.id.place_gallery_2);
        coach2 = root.findViewById(R.id.coach_gallery_2);
        duration2 = root.findViewById(R.id.duration_gallery_2);

        time3 = root.findViewById(R.id.time_gallery_3);
        name3 = root.findViewById(R.id.name_gallery_3);
        place3 = root.findViewById(R.id.place_gallery_3);
        coach3 = root.findViewById(R.id.coach_gallery_3);
        duration3 = root.findViewById(R.id.duration_gallery_3);

        time4 = root.findViewById(R.id.time_gallery_4);
        name4 = root.findViewById(R.id.name_gallery_4);
        place4 = root.findViewById(R.id.place_gallery_4);
        coach4 = root.findViewById(R.id.coach_gallery_4);
        duration4 = root.findViewById(R.id.duration_gallery_4);

        time5 = root.findViewById(R.id.time_gallery_5);
        name5 = root.findViewById(R.id.name_gallery_5);
        place5 = root.findViewById(R.id.place_gallery_5);
        coach5 = root.findViewById(R.id.coach_gallery_5);
        duration5 = root.findViewById(R.id.duration_gallery_5);

        time6 = root.findViewById(R.id.time_gallery_6);
        name6 = root.findViewById(R.id.name_gallery_6);
        place6 = root.findViewById(R.id.place_gallery_6);
        coach6 = root.findViewById(R.id.coach_gallery_6);
        duration6 = root.findViewById(R.id.duration_gallery_6);

        time7 = root.findViewById(R.id.time_gallery_7);
        name7 = root.findViewById(R.id.name_gallery_7);
        place7 = root.findViewById(R.id.place_gallery_7);
        coach7 = root.findViewById(R.id.coach_gallery_7);
        duration7 = root.findViewById(R.id.duration_gallery_7);

        time8 = root.findViewById(R.id.time_gallery_8);
        name8 = root.findViewById(R.id.name_gallery_8);
        place8 = root.findViewById(R.id.place_gallery_8);
        coach8 = root.findViewById(R.id.coach_gallery_8);
        duration8 = root.findViewById(R.id.duration_gallery_8);

        time9 = root.findViewById(R.id.time_gallery_9);
        name9 = root.findViewById(R.id.name_gallery_9);
        place9 = root.findViewById(R.id.place_gallery_9);
        coach9 = root.findViewById(R.id.coach_gallery_9);
        duration9 = root.findViewById(R.id.duration_gallery_9);

        time10 = root.findViewById(R.id.time_gallery_10);
        name10 = root.findViewById(R.id.name_gallery_10);
        place10 = root.findViewById(R.id.place_gallery_10);
        coach10 = root.findViewById(R.id.coach_gallery_10);
        duration10 = root.findViewById(R.id.duration_gallery_10);

        time11 = root.findViewById(R.id.time_gallery_11);
        name11 = root.findViewById(R.id.name_gallery_11);
        place11 = root.findViewById(R.id.place_gallery_11);
        coach11 = root.findViewById(R.id.coach_gallery_11);
        duration11 = root.findViewById(R.id.duration_gallery_11);

        time12 = root.findViewById(R.id.time_gallery_12);
        name12 = root.findViewById(R.id.name_gallery_12);
        place12 = root.findViewById(R.id.place_gallery_12);
        coach12 = root.findViewById(R.id.coach_gallery_12);
        duration12 = root.findViewById(R.id.duration_gallery_12);

        time13 = root.findViewById(R.id.time_gallery_13);
        name13 = root.findViewById(R.id.name_gallery_13);
        place13 = root.findViewById(R.id.place_gallery_13);
        coach13 = root.findViewById(R.id.coach_gallery_13);
        duration13 = root.findViewById(R.id.duration_gallery_13);

        calendar = (CalendarView) root.findViewById(R.id.calendarView);
        Calendar c = Calendar.getInstance();
        Date date = new Date();
        c.setTime(date);
        String dDayWeek;

        switch (c.get(Calendar.DAY_OF_WEEK)){
            case (1):
                dDayWeek = "Sunday";
                break;
            case (2):
                dDayWeek = "Monday";
                break;
            case (3):
                dDayWeek = "Tuesday";
                break;
            case (4):
                dDayWeek = "Wednesday";
                break;
            case (5):
                dDayWeek = "Thursday";
                break;
            case (6):
                dDayWeek = "Friday";
                break;
            case (7):
                dDayWeek = "Saturday";
                break;
            default:
                dDayWeek = "Monday";
                break;
        }

        scheduleUpdate(dDayWeek, db, "1",time1,name1,place1,coach1,duration1);
        scheduleUpdate(dDayWeek, db, "2",time2,name2,place2,coach2,duration2);
        scheduleUpdate(dDayWeek, db, "3",time3,name3,place3,coach3,duration3);
        scheduleUpdate(dDayWeek, db, "4",time4,name4,place4,coach4,duration4);
        scheduleUpdate(dDayWeek, db, "5",time5,name5,place5,coach5,duration5);
        scheduleUpdate(dDayWeek, db, "6",time6,name6,place6,coach6,duration6);
        scheduleUpdate(dDayWeek, db, "7",time7,name7,place7,coach7,duration7);
        scheduleUpdate(dDayWeek, db, "8",time8,name8,place8,coach8,duration8);
        scheduleUpdate(dDayWeek, db, "9",time9,name9,place9,coach9,duration9);
        scheduleUpdate(dDayWeek, db, "10",time10,name10,place10,coach10,duration10);
        scheduleUpdate(dDayWeek, db, "11",time11,name11,place11,coach11,duration11);
        scheduleUpdate(dDayWeek, db, "12",time12,name12,place12,coach12,duration12);
        scheduleUpdate(dDayWeek, db, "13",time13,name13,place13,coach13,duration13);

        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
                c.set(year,month,day);
                String dayWeek;
                int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
                switch (dayOfWeek){
                    case (1):
                        dayWeek = "Sunday";
                        break;
                    case (2):
                        dayWeek = "Monday";
                        break;
                    case (3):
                        dayWeek = "Tuesday";
                        break;
                    case (4):
                        dayWeek = "Wednesday";
                        break;
                    case (5):
                        dayWeek = "Thursday";
                        break;
                    case (6):
                        dayWeek = "Friday";
                        break;
                    case (7):
                        dayWeek = "Saturday";
                        break;
                    default:
                        dayWeek = "Monday";
                        break;
                }
                scheduleUpdate(dayWeek, db, "1",time1,name1,place1,coach1,duration1);
                scheduleUpdate(dayWeek, db, "2",time2,name2,place2,coach2,duration2);
                scheduleUpdate(dayWeek, db, "3",time3,name3,place3,coach3,duration3);
                scheduleUpdate(dayWeek, db, "4",time4,name4,place4,coach4,duration4);
                scheduleUpdate(dayWeek, db, "5",time5,name5,place5,coach5,duration5);
                scheduleUpdate(dayWeek, db, "6",time6,name6,place6,coach6,duration6);
                scheduleUpdate(dayWeek, db, "7",time7,name7,place7,coach7,duration7);
                scheduleUpdate(dayWeek, db, "8",time8,name8,place8,coach8,duration8);
                scheduleUpdate(dayWeek, db, "9",time9,name9,place9,coach9,duration9);
                scheduleUpdate(dayWeek, db, "10",time10,name10,place10,coach10,duration10);
                scheduleUpdate(dayWeek, db, "11",time11,name11,place11,coach11,duration11);
                scheduleUpdate(dayWeek, db, "12",time12,name12,place12,coach12,duration12);
                scheduleUpdate(dayWeek, db, "13",time13,name13,place13,coach13,duration13);
            }
        });




//        final TextView textView = binding.textGallery;
//        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void scheduleUpdate (String day, FirebaseDatabase db, String workout,TextView time,
                                TextView name, TextView place, TextView coach, TextView duration)
    {
        DatabaseReference dbTime = db.getReference("/Schedule/" + day + "/Workout"+ workout +"/Time");
        DatabaseReference dbName = db.getReference("/Schedule/" + day + "/Workout"+ workout +"/Name");
        DatabaseReference dbPlace = db.getReference("/Schedule/" + day + "/Workout"+ workout +"/Place");
        DatabaseReference dbCoach = db.getReference("/Schedule/" + day + "/Workout"+ workout +"/Coach");
        DatabaseReference dbDurat = db.getReference("/Schedule/" + day + "/Workout"+ workout +"/Duration");

        dbTime.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String vT = snapshot.getValue(String.class);
                time.setText(""+ vT);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

        dbName.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String vN = snapshot.getValue(String.class);
                name.setText(""+vN);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

        dbPlace.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String vP = snapshot.getValue(String.class);
                place.setText(""+vP);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

        dbCoach.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String vC = snapshot.getValue(String.class);
                coach.setText(""+vC);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

        dbDurat.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String vD = snapshot.getValue(String.class);
                duration.setText(""+vD);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });
    }



}
